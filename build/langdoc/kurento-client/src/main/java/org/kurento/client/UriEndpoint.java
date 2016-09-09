/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Interface for endpoints the require a URI to work. An example of this, would be a :rom:cls:`PlayerEndpoint` whose URI property could be used to locate a file to stream
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface UriEndpoint extends Endpoint {

/**
 *
 * Get The uri for this endpoint.
 *
 **/
     String getUri();

/**
 *
 * Get The uri for this endpoint.
 *
 **/
     void getUri(Continuation<String> cont);

/**
 *
 * Get The uri for this endpoint.
 *
 **/
     TFuture<String> getUri(Transaction tx);

/**
 *
 * Get State of the endpoint
 *
 **/
     org.kurento.client.UriEndpointState getState();

/**
 *
 * Get State of the endpoint
 *
 **/
     void getState(Continuation<org.kurento.client.UriEndpointState> cont);

/**
 *
 * Get State of the endpoint
 *
 **/
     TFuture<org.kurento.client.UriEndpointState> getState(Transaction tx);



/**
 *
 * Pauses the feed
 *
 **/
  void pause();

/**
 *
 * Asynchronous version of pause:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see UriEndpoint#pause
 *
 **/
    void pause(Continuation<Void> cont);

/**
 *
 * Pauses the feed
 *
 **/
    void pause(Transaction tx);


/**
 *
 * Stops the feed
 *
 **/
  void stop();

/**
 *
 * Asynchronous version of stop:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see UriEndpoint#stop
 *
 **/
    void stop(Continuation<Void> cont);

/**
 *
 * Stops the feed
 *
 **/
    void stop(Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link UriEndpointStateChangedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on UriEndpointStateChangedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(UriEndpointStateChangedEvent.class)
    ListenerSubscription addUriEndpointStateChangedListener(EventListener<UriEndpointStateChangedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link UriEndpointStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on UriEndpointStateChangedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(UriEndpointStateChangedEvent.class)
    void addUriEndpointStateChangedListener(EventListener<UriEndpointStateChangedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link UriEndpointStateChangedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(UriEndpointStateChangedEvent.class)
    void removeUriEndpointStateChangedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link UriEndpointStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(UriEndpointStateChangedEvent.class)
    void removeUriEndpointStateChangedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}