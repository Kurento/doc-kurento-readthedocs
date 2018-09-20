%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
JavaScript - Hello World with Data Channels
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

This web application extends the :doc:`Hello World Tutorial<./tutorial-helloworld>`, adding
media processing to the basic `WebRTC`:term: loopback and allowing send text from browser
to the media server through data channels.

For the impatient: running this example
=======================================

You'll need to install Kurento Media Server before running this example.
Read :doc:`installation guide </user/installation>` for further
information.

Be sure to have installed `Node.js`:term: and `Bower`:term: in your system. In
an Ubuntu machine, you can install both as follows:

.. sourcecode:: bash

   curl -sL https://deb.nodesource.com/setup_4.x | sudo bash -
   sudo apt-get install -y nodejs
   sudo npm install -g bower

Due to `Same-origin policy`:term:, this demo has to be served by an HTTP server.
A very simple way of doing this is by means of an HTTP Node.js server which can
be installed using `npm`:term: :

.. sourcecode:: bash

   sudo npm install http-server -g

You also need the source code of this demo. You can clone it from GitHub. Then
start the HTTP server:

.. sourcecode:: bash

    git clone https://github.com/Kurento/kurento-tutorial-js.git
    cd kurento-tutorial-js/kurento-hello-world-data-channel
    git checkout 6.7.2-dev
    bower install
    http-server -p 8443 -S -C keys/server.crt -K keys/server.key

Finally, access the application connecting to the URL https://localhost:8443/
through a WebRTC capable browser (Chrome, Firefox).

.. note::

   These instructions work only if Kurento Media Server is up and running in the same machine
   as the tutorial. However, it is possible to connect to a remote KMS in other machine, simply adding
   the parameter ``ws_uri`` to the URL, as follows:

   .. sourcecode:: bash

      https://localhost:8443/index.html?ws_uri=wss://kms_host:kms_port/kurento

   Notice that the Kurento Media Server must connected using a **Secure WebSocket** (i.e., the KMS URI
   starts with *wss://*). For this reason, the support for secure WebSocket must be enabled in the Kurento
   Media Server you are using to run this tutorial. For further information about securing applications,
   please visit the following :doc:`page </features/security>`.

.. note::

   This demo needs the kms-datachannelexample module installed in the media server. That module is
   available in the Kurento repositories, so it is possible to install it with:


   .. sourcecode:: bash

      sudo apt-get install kms-datachannelexample


Understanding this example
==========================

The logic of the application is quite simple: the local stream is sent to
Kurento Media Server, which returns it back to the client without
modifications. To implement this behavior we need to create a
`Media Pipeline`:term: with a single `Media Element`:term:, i.e. of type
**WebRtcEndpoint**, which holds the capability of exchanging full-duplex
(bidirectional) WebRTC media flows. It is important to set value of property
*useDataChannels* to true during **WebRtcEndpoint** creation. This media element
is connected to itself in order to deliver back received Media.

The application creates a channel between **PeerConnection** and **WebRtcEndpoint**
used for message delivery.

Complete source code of this demo can be found in
`GitHub <https://github.com/Kurento/kurento-tutorial-js/tree/master/kurento-hello-world-data-channel>`_.


JavaScript Logic
================

This demo follows a *Single Page Application* architecture (`SPA`:term:). The
interface is the following HTML page:
`index.html <https://github.com/Kurento/kurento-tutorial-js/blob/master/kurento-hello-world-data-channel/index.html>`_.
This web page links two Kurento JavaScript libraries:

* **kurento-client.js** : Implementation of the Kurento JavaScript Client.

* **kurento-utils.js** : Kurento utility library aimed to simplify the WebRTC
  management in the browser.

In addition, these two JavaScript libraries are also required:

* **Bootstrap** : Web framework for developing responsive web sites.

* **jquery.js** : Cross-platform JavaScript library designed to simplify the
  client-side scripting of HTML.

* **adapter.js** : WebRTC JavaScript utility library maintained by Google that
  abstracts away browser differences.

* **ekko-lightbox** : Module for Bootstrap to open modal images, videos, and
  galleries.

* **demo-console** : Custom JavaScript console.

The specific logic of this demo is coded in the following JavaScript page:
`index.js <https://github.com/Kurento/kurento-tutorial-js/blob/master/kurento-hello-world-data-channel/js/index.js>`_.
In this file, there is a function which is called when the green button labeled
as *Start* in the GUI is clicked.

.. sourcecode:: js

   var startButton = document.getElementById("start");

   startButton.addEventListener("click", function() {
      var options = {
         peerConnection: peerConnection,
         localVideo: videoInput,
         remoteVideo: videoOutput
       };

      webRtcPeer = kurentoUtils.WebRtcPeer.WebRtcPeerSendrecv(options, function(error) {
         if(error) return onError(error)
         this.generateOffer(onOffer)
      });

      [...]
   }

The function *WebRtcPeer.WebRtcPeerSendrecv* abstracts the WebRTC internal
details (i.e. PeerConnection and getUserStream) and makes possible to start a
full-duplex WebRTC communication, using the HTML video tag with id *videoInput*
to show the video camera (local stream) and the video tag *videoOutput* to show
the remote stream provided by the Kurento Media Server.

Inside this function, a call to *generateOffer* is performed. This function
accepts a callback in which the SDP offer is received. In this callback we
create an instance of the *KurentoClient* class that will manage communications
with the Kurento Media Server. So, we need to provide the URI of its WebSocket
endpoint. In this example, we assume it's listening in port 8433 at the same
host than the HTTP serving the application.

.. sourcecode:: js

   [...]

   var args = getopts(location.search,
   {
     default:
     {
       ws_uri: 'wss://' + location.hostname + ':8433/kurento',
       ice_servers: undefined
     }
   });

   [...]

   kurentoClient(args.ws_uri, function(error, client){
     [...]
   };

Once we have an instance of ``kurentoClient``, the following step is to create a
*Media Pipeline*, as follows:

.. sourcecode:: js

   client.create("MediaPipeline", function(error, _pipeline){
      [...]
   });

If everything works correctly, we have an instance of a media pipeline (variable
``pipeline`` in this example). With this instance, we are able to create
*Media Elements*. In this example we just need a *WebRtcEndpoint* with ``useDataChannels`` property
as *true*. Then, this media elements is connected itself:

.. sourcecode:: js

   pipeline.create("WebRtcEndpoint", {useDataChannels: true}, function(error, webRtc){
      if(error) return onError(error);

      setIceCandidateCallbacks(webRtcPeer, webRtc, onError)

      webRtc.processOffer(sdpOffer, function(error, sdpAnswer){
        if(error) return onError(error);

        webRtc.gatherCandidates(onError);

        webRtcPeer.processAnswer(sdpAnswer, onError);
      });

      webRtc.connect(webRtc, function(error){
        if(error) return onError(error);

        console.log("Loopback established");
      });
    });


In the following snippet, we can see how to create the channel and the ``send`` method of one channel.

.. sourcecode:: javascript

   var dataConstraints = null;
   var channel = peerConnection.createDataChannel(getChannelName (), dataConstraints);
   ...

   sendButton.addEventListener("click", function(){
       ...
       channel.send(data);
       ...
   });

.. note::

   The :term:`TURN` and :term:`STUN` servers to be used can be configured simple adding
   the parameter ``ice_servers`` to the application URL, as follows:

   .. sourcecode:: bash

      https://localhost:8443/index.html?ice_servers=[{"urls":"stun:stun1.example.net"},{"urls":"stun:stun2.example.net"}]
      https://localhost:8443/index.html?ice_servers=[{"urls":"turn:turn.example.org","username":"user","credential":"myPassword"}]

Dependencies
============

Demo dependencies are defined in file `bower.json <https://github.com/Kurento/kurento-tutorial-js/blob/master/kurento-hello-world-data-channel/bower.json>`_.
They are managed using `Bower`:term:.

.. sourcecode:: js

   "dependencies": {
      "kurento-client": "6.7.2-dev",
      "kurento-utils": "6.7.2-dev"
   }

.. note::

   We are in active development. You can find the latest version of
   Kurento JavaScript Client at `Bower <https://bower.io/search/?q=kurento-client>`_.
