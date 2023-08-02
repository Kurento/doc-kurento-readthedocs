.. highlight:: json

================
Kurento Protocol
================

.. contents:: Table of Contents

Kurento Media Server exposes a full fledged API to let applications process media in several ways. To allow this rich API, Kurento requires full-duplex communications between the controlling Application Server and the media server itself. For this reason, the **Kurento Protocol** is implemented on top of :term:`JSON-RPC` and uses the :term:`WebSocket` transport.

Thorough this document, the word "**client**" is used to refer to the :doc:`Application Server </user/writing_applications>`, which acts as brain and controller of Kurento.



JSON-RPC message format
=======================

Kurento Protocol uses the :term:`JSON-RPC` 2.0 Specification to encode its API messages. The following subsections describe the contents of the :term:`JSON` messages that follow this spec.



Request
-------

An *RPC call* is represented by sending a *request* message to a server. The *request* message has the following members:

- ``jsonrpc``: A string specifying the version of the JSON-RPC protocol. It must be ``2.0``.
- ``id``: A unique identifier established by the client, that contains a number. The server must reply with the same value in the *response* message. This member is used to correlate the context between both messages.
- ``method``: A string containing the name of the method to be invoked.
- ``params``: A structured value that holds the parameter values to be used during the invocation of the method.

The following JSON shows a sample request for the creation of a `PlayerEndpoint` Media Element:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "method": "create",
     "params": {
       "type": "PlayerEndpoint",
       "constructorParams": {
         "pipeline": "6829986",
         "uri": "http://host/app/video.mp4"
       },
       "sessionId": "c93e5bf0-4fd0-4888-9411-765ff5d89b93"
     }
   }



Successful Response
-------------------

When an RPC call is made, the server replies with a **response** message. A successful response will contain the following members:

- ``jsonrpc``: A string specifying the version of the JSON-RPC protocol. It must be ``2.0``.
- ``id``: Must match the value of the *id* member in the *request* message.
- ``result``: Its value is determined by the method invoked on the server.

The following example shows a typical successful response:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "result": {
       "value": "442352747",
       "sessionId": "c93e5bf0-4fd0-4888-9411-765ff5d89b93"
     }
   }

In case the connection is rejected, the response includes a message with a *rejected* attribute, containing a *code* and a *message* with the reason why the session was not accepted, and no *sessionId* is defined.



Error Response
--------------

When an RPC call is made, the server replies with a **response** message. An error response will contain the following members:

- ``jsonrpc``: A string specifying the version of the JSON-RPC protocol. It must be ``2.0``.
- ``id``: Must match the value of the *id* member in the *request* message. If the error happened even before being able to read the *id* in the *request* message (e.g. a JSON *Parse Error* / *Invalid Request*), *id* is *null*.
- ``error``: An object describing the error, with the following members:

  - ``code``: A number indicating the type of error that occurred. Destined for machine code.
  - ``data``: An optional value that is particular to each error, and contains additional information about the error itself. It usually is an object that at least contains a ``type`` string with the internal name of the error.
  - ``message``: A string providing a short description of the error. Destined for human reading; it's not a good idea to parse it with machine code, because the wording of messages could change over time. Prefer using the ``code`` field to differentiate between types of errors.

The following example shows an example error response:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 5,
     "error": {
       "code": 40101,
       "data": { "type": "MEDIA_OBJECT_NOT_FOUND" },
       "message": "Object '1234567890' not found"
     }
   }



Kurento API over JSON-RPC
=========================

Before issuing commands, the Kurento Client requires establishing a WebSocket connection with Kurento Media Server to this URL: ``ws://hostname:port/kurento``.

Once the WebSocket has been established, the Kurento Protocol offers several callable methods:

- ``ping``: Keep-alive method between client and Kurento Media Server.
- ``create``: Creates a new media object, i.e. a Media Pipeline, an Endpoint, or any other Media Element.
- ``describe``: Retrieves an already existing object.
- ``invoke``: Calls a method on an existing object.
- ``subscribe``: Subscribes to some specific event, to receive notifications when it gets emitted by a media object.
- ``unsubscribe``: Removes an existing subscription to an event.
- ``release``: Marks a media object for garbage collection and release of the resources used by it.
- ``connect``: Restore a previous connection with a media server, to recover from unexpected disconnections.

The Kurento Protocol also allows Kurento Media Server to proactively send messages to clients, i.e. sending of events:

- ``onEvent``: This request is sent from Kurento Media server to subscribed clients when an event occurs.



.. _protocol-ping:

ping
----

In order to warrant the WebSocket connectivity between the client and the Kurento Media Server, a *keep-alive* method is implemented. This method is based on a *ping* method sent by the client, which must be replied with a *pong* message from the server. If no response is obtained in a time interval, the client will assume that the connectivity with the media server has been lost. The *interval* parameter is the time available to receive the *pong* message from the server, in milliseconds. By default this value is `240000`_ (**4 minutes**).

.. _240000: https://github.com/Kurento/kurento/blob/7.0.0/clients/java/client/src/main/java/org/kurento/client/KurentoClient.java#L55

This is an example of a *ping* request:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "method": "ping",
     "params": {
       "interval": 240000
     }
   }

The response to a *ping* request must contain a *result* object with the parameter ``value: pong``. The following snippet shows the *pong* response to the previous *ping* request:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "result": {
       "value": "pong"
     }
   }



create
------

This message requests the creation of an object from the Kurento API (Media Pipelines and Media Elements). The parameter *type* specifies the type of the object to be created. The parameter *constructorParams* contains all the information needed to create the object. Each message needs different *constructorParams* to create the object. These parameters are defined :doc:`per-module </features/kurento_modules>`.

Media Elements have to be contained in a previously created Media Pipeline. Therefore, before creating Media Elements, a Media Pipeline must exist. The response of the creation of a Media Pipeline contains a parameter called *sessionId*, which must be included in the next create requests for Media Elements.

The following example shows a request message for the creation of an object of the type *MediaPipeline*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 2,
     "method": "create",
     "params": {
       "type": "MediaPipeline",
       "constructorParams": {},
       "properties": {}
     }
   }

The response to this request message is as follows. Notice that the parameter *value* identifies the created Media Pipeline, and *sessionId* is the identifier of the current session:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 2,
     "result": {
       "value": "ID_kurento.MediaPipeline",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response message contains the identifier of the new object in the field *value*. As usual, the field *id* will match the value of the *id* member in the *request* message. The *sessionId* is also returned in each response.

The following example shows a request message for the creation of an object of the type *WebRtcEndpoint* within an existing Media Pipeline (identified by the parameter *constructorParams.mediaPipeline*). Notice that in this request, the *sessionId* is already present, while in the previous example it was not (since at that point it was unknown for the client):

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 3,
     "method": "create",
     "params": {
       "type": "WebRtcEndpoint",
       "constructorParams": {
         "mediaPipeline": "ID_kurento.MediaPipeline"
       },
       "properties": {},
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response to this request message is as follows:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 3,
     "result": {
       "value": "ID_kurento.MediaPipeline/ID_kurento.WebRtcEndpoint",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }



describe
--------

This message retrieves the information of an already existing object in the Media Server. This can be useful for cases there a newly started client does already know the IDs of all objects it wants to manage, so it just needs to get a reference to them from the Media Server, instead of creating new ones. The *object* parameter contains the id of the desired object that should be retrieved.

This example shows how to get a reference to a Media Pipeline that had been created earlier:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 4,
     "method": "describe",
     "params": {
       "object": "ID_kurento.MediaPipeline",
       "sessionId": "0cd20d0e-451f-4fd9-b3d4-dff33f90d328"
     }
   }

The response to this request message is as follows:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 4,
     "result": {
       "hierarchy": ["kurento.MediaObject"],
       "qualifiedType": "kurento.MediaPipeline",
       "type": "MediaPipeline",
       "sessionId": "0cd20d0e-451f-4fd9-b3d4-dff33f90d328"
     }
   }

The response message contains the type information of the object that has just been retrieved. Other fields such as *id* and *sessionId* are those corresponding to the current RPC session.

The following example shows the retrieval of an already existing *PlayerEndpoint*; the mechanics are mostly the same, but in this case the response contains more details pertaining the class hierarchy of the Endpoint:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 5,
     "method": "describe",
     "params": {
       "object": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
       "sessionId": "4b3c8344-5b47-4f40-bc2d-a2a0f82723d0"
     }
   }

The response to this request message is as follows:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 5,
     "result": {
       "hierarchy": [
         "kurento.UriEndpoint",
         "kurento.Endpoint",
         "kurento.MediaElement",
         "kurento.MediaObject"
      ],
      "qualifiedType": "kurento.PlayerEndpoint",
      "type": "PlayerEndpoint",
      "sessionId": "4b3c8344-5b47-4f40-bc2d-a2a0f82723d0"
     }
   }

Lastly, this is what happens when trying to retrieve an object that does not exist in the server:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 5,
     "method": "describe",
     "params": {
       "object": "1234567890",
       "sessionId": "20587cfe-76aa-4451-ac73-55e33ae6ca2a"
     }
   }

An error response will be returned:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 5,
     "error": {
       "code": 40101,
       "data": { "type": "MEDIA_OBJECT_NOT_FOUND" },
       "message": "Object '1234567890' not found"
     }
   }



invoke
------

This message requests running a given operation on the specified object. The parameter *object* indicates the *id* of the object in which the operation will run. The parameter *operation* carries the name of the operation that should run. Finally, the parameter *operationParams* has the parameters passed to the operation.

The following example shows an invocation request for the *connect* operation, to connect a *PlayerEndpoint* with a *WebRtcEndpoint*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 6,
     "method": "invoke",
     "params": {
       "object": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
       "operation": "connect",
       "operationParams": {
         "sink": "ID_kurento.MediaPipeline/ID_kurento.WebRtcEndpoint"
       },
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response message contains the value returned while executing the operation invoked on the object, or nothing if the operation doesn't return any value.

This is the typical response while invoking the *connect* operation (which doesn't return anything):

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 6,
     "result": {
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }



subscribe
---------

This message requests the subscription to a certain kind of events in the specified object. The parameter *object* indicates the *id* of the object to subscribe for events. The parameter *type* specifies the type of the events. If a client is subscribed for a certain type of events in an object, each time an event is fired in this object a request with method *onEvent* is sent from Kurento Media Server to the client. This kind of request is described few sections later.

The following example shows a request message requesting the subscription of the event type *EndOfStream* on a *PlayerEndpoint* object:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 8,
     "method": "subscribe",
     "params": {
       "type": "EndOfStream",
       "object": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response message contains the subscription identifier. This value can be used later to remove this subscription.

This is the response of the subscription request. The *value* attribute contains the subscription id:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 8,
     "result": {
       "value": "052061c1-0d87-4fbd-9cc9-66b57c3e1280",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }



unsubscribe
-----------

This message requests the cancellation of a previous event subscription. The parameter *subscription* contains the subscription *id* received from the server when the subscription was created.

The following example shows a request message requesting the cancellation of the subscription ``353be312-b7f1-4768-9117-5c2f5a087429`` for a given *object*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 9,
     "method": "unsubscribe",
     "params": {
       "subscription": "052061c1-0d87-4fbd-9cc9-66b57c3e1280",
       "object": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response message only contains the *sessionId*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 9,
     "result": {
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }



release
-------

This message requests releasing the resources of the specified object. The parameter *object* indicates the *objectId* of the object to be released:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 7,
     "method": "release",
     "params": {
       "object": "ID_kurento.MediaPipeline",
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }

The response message only contains the *sessionId*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 7,
     "result": {
       "sessionId": "bd4d6227-0463-4d52-b1c3-c71f0be68466"
     }
   }



connect
-------

Objects handled by Kurento can consume a lot of resources. It would be wasteful if the media server keeps unneeded objects in memory due to an unexpected disconnection of the client, so Kurento includes a Garbage Collector that will release unused resources.

A Media Element is garbage collected when the client which owned the object gets disconnected for longer than 4 minutes. After that time, these media elements are disposed automatically. Therefore, the WebSocket connection between client and Kurento should be active at all times. In case of reconnecting after a temporary network disconnection, Kurento provides the *connect* method that allows the client to reconnect.

This message allows a client to reconnect to the same Kurento instance to which it was previously connected:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 10,
     "method": "connect",
     "params": {
       "sessionId": "4f5255d5-5695-4e1c-aa2b-722e82db5260"
     }
   }

If the reconnection to the given session was successful, the session's resources won't be garbage collected after 4 minutes, and Kurento replies as follows:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 10,
     "result": {
       "serverId": "<serverId>",
       "sessionId": "4f5255d5-5695-4e1c-aa2b-722e82db5260"
     }
   }

However, if the *connect* method was attempted against a different Kurento instance, the response would look like this:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 10,
     "error": {
       "code": 40007,
       "data": { "type": "INVALID_SESSION" },
       "message": "Invalid session"
     }
   }

In this case, the client is supposed to invoke the *connect* method without parameters, in order to get a new *sessionId*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 10,
     "method": "connect"
   }



onEvent
-------

When a client is subscribed to some events from an object, the server sends an *onEvent* request each time an event of that type is fired in the object. This is possible because the Kurento Protocol is implemented with WebSockets and there is a full duplex channel between client and server.

The ``data`` field contents are dependent on the type of event, but it generally contains these values:

- ``source``: The object source of the event.
- ``type``: The type of the event.
- ``timestampMillis``: The timestamp associated with this event: Milliseconds elapsed since the UNIX Epoch (Jan 1, 1970, UTC).
- ``tags``: Media elements can be labeled using the methods *setSendTagsInEvents* and *addTag*, present in each element. These tags are key-value metadata that can be used by developers for custom purposes. Tags are returned with each event by the media server in this field.

This message has no *id* field due to the fact that no response is required.

The following example shows a notification sent from server to client, notifying of an event *EndOfStream* for a *PlayerEndpoint* object:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "method": "onEvent",
     "params": {
       "value": {
         "data": {
           "source": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
           "tags": [],
           "timestampMillis": "1441277150433",
           "type": "EndOfStream"
         },
         "object": "ID_kurento.MediaPipeline/ID_kurento.PlayerEndpoint",
         "type": "EndOfStream"
       }
     }
   }

Here, an example Error event is sent to notify about permission errors while trying to access the file system:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "method": "onEvent",
     "params": {
       "value": {
         "data": {
           "description": "Error code 6: Could not open file \"/tmp/invalid/path/test.webm\" for writing., [...] system error: Permission denied",
           "errorCode": 6,
           "source": "ID_kurento.MediaPipeline/ID_kurento.RecorderEndpoint",
           "tags": [],
           "timestampMillis": "1646657831138",
           "type": "RESOURCE_ERROR_OPEN"
         },
         "object": "ID_kurento.MediaPipeline/ID_kurento.RecorderEndpoint",
         "type": "Error"
       }
     }
   }

For more info about Kurento events, check :doc:`/features/events`.



closeSession
------------

If you inspect the JSON traffic between any of the Kurento clients and Kurento Media Server itself, you might notice that clients send a ``closeSession`` request. This is an undocumented command that was added for development purposes in the past, and was kept in the implementation. However, it does nothing in practice. You can safely ignore this method if you are implementing the Kurento Protocol on your own SDK.



Example: WebRTC in loopback
===========================

This section describes an example of the messages exchanged between a Kurento Client and the Kurento Media Server, in order to create a WebRTC in loopback. This example is fully depicted in the :doc:`Tutorials section </user/tutorials>`. The steps are the following:

1. Client sends a request message in order to create a Media Pipeline:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "method": "create",
     "params": {
       "type": "MediaPipeline",
       "constructorParams": {},
       "properties": {}
     }
   }

2. Kurento sends a response message with the identifier for the Media Pipeline and the Media Session:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 1,
     "result": {
       "value": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline",
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

3. Client sends a request to create a *WebRtcEndpoint*:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 2,
     "method": "create",
     "params": {
       "type": "WebRtcEndpoint",
       "constructorParams": {
         "mediaPipeline": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline"
       },
       "properties": {},
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

4. Kurento creates the *WebRtcEndpoint* and sends back to the client the Media Element identifier:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 2,
     "result": {
       "value": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline/e72a1ff5-e416-48ff-99ef-02f7fadabaf7_WebRtcEndpoint",
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

5. Client invokes the *connect* operation on the *WebRtcEndpoint*, in order to create a loopback:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 3,
     "method": "invoke",
     "params": {
       "object": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline/e72a1ff5-e416-48ff-99ef-02f7fadabaf7_WebRtcEndpoint",
       "operation": "connect",
       "operationParams": {
         "sink": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline/e72a1ff5-e416-48ff-99ef-02f7fadabaf7_WebRtcEndpoint"
       },
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

6. Kurento carries out the connection and acknowledges the operation:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 3,
     "result": {
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

7. Client invokes the *processOffer* method of the *WebRtcEndpoint*, in order to start the :term:`SDP Offer/Answer` negotiation for WebRTC:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 4,
     "method": "invoke",
     "params": {
       "object": "c4a84b47-1acd-4930-9f6d-008c10782dfe_MediaPipeline/e72a1ff5-e416-48ff-99ef-02f7fadabaf7_WebRtcEndpoint",
       "operation": "processOffer",
       "operationParams": {
         "offer": "SDP"
       },
       "sessionId": "ba4be2a1-2b09-444e-a368-f81825a6168c"
     }
   }

8. Kurento carries out the SDP negotiation and returns the SDP Answer:

.. code-block:: json

   {
     "jsonrpc": "2.0",
     "id": 4,
     "result": {
       "value": "SDP"
     }
   }



Creating a custom Kurento Client
================================

In order to implement a Kurento Client you need to follow the reference documentation. The best way to know all details is to take a look at IDL files that define the interface of the Kurento elements.

We have defined a custom IDL format based on JSON. From it, we automatically generate the client code for the Kurento Client libraries:

- `core <https://github.com/Kurento/kurento/blob/main/server/module-core/src/server/interface/core.kmd.json>`__

- `elements <https://github.com/Kurento/kurento/blob/main/server/module-elements/src/server/interface>`__

- `filters <https://github.com/Kurento/kurento/blob/main/server/module-filters/src/server/interface>`__



Kurento Module Creator
----------------------

Kurento Clients contain code that is automatically generated from the IDL interface files, using a tool named **Kurento Module Creator**. This tool can also be used to create custom clients in other languages.

Kurento Module Creator can be installed in an Ubuntu machine using the  following command:

.. code-block:: shell

   sudo apt-get update ; sudo apt-get install kurento-module-creator

The aim of this tool is to generate the client code and also the glue code
needed in the server-side. For code generation it uses `Freemarker <https://freemarker.apache.org/>`__ as the template engine. The typical way to use Kurento Module Creator is by running a command like this:

.. code-block:: shell

   kurento-module-creator -c <CODEGEN_DIR> -r <ROM_FILE> -r <TEMPLATES_DIR>

Where:

- *CODEGEN_DIR*: Destination directory for generated files.
- *ROM_FILE*: A space-separated list of *Kurento Media Element Description* (kmd files), or folders containing these files. For example, you can take a look to the kmd files within the `Kurento Media Server <https://github.com/Kurento/kurento/tree/main/server/media-server/scaffold>`__ source code.
- *TEMPLATES_DIR*: Directory that contains template files. As an example,
  you can take a look to the internal `Java templates <https://github.com/Kurento/kurento/tree/main/clients/java/client/src/main/resources/templates>`__ and `JavaScript templates <https://github.com/Kurento/kurento/tree/main/clients/javascript/client/templates>`__ directories.
