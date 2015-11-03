/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Base class to manage common RTP features.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface BaseRtpEndpoint extends SdpEndpoint {

     int getMinVideoRecvBandwidth();

     void getMinVideoRecvBandwidth(Continuation<Integer> cont);

     TFuture<Integer> getMinVideoRecvBandwidth(Transaction tx);

     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth);

     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Continuation<Void> cont);

     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Transaction tx);
     int getMinVideoSendBandwidth();

     void getMinVideoSendBandwidth(Continuation<Integer> cont);

     TFuture<Integer> getMinVideoSendBandwidth(Transaction tx);

     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth);

     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Continuation<Void> cont);

     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Transaction tx);
     int getMaxVideoSendBandwidth();

     void getMaxVideoSendBandwidth(Continuation<Integer> cont);

     TFuture<Integer> getMaxVideoSendBandwidth(Transaction tx);

     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth);

     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Continuation<Void> cont);

     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Transaction tx);
     org.kurento.client.MediaState getMediaState();

     void getMediaState(Continuation<org.kurento.client.MediaState> cont);

     TFuture<org.kurento.client.MediaState> getMediaState(Transaction tx);

     org.kurento.client.ConnectionState getConnectionState();

     void getConnectionState(Continuation<org.kurento.client.ConnectionState> cont);

     TFuture<org.kurento.client.ConnectionState> getConnectionState(Transaction tx);

     org.kurento.client.RembParams getRembParams();

     void getRembParams(Continuation<org.kurento.client.RembParams> cont);

     TFuture<org.kurento.client.RembParams> getRembParams(Transaction tx);

     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams);

     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams, Continuation<Void> cont);

     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams, Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link MediaStateChangedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on MediaStateChangedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaStateChangedEvent.class)
    ListenerSubscription addMediaStateChangedListener(EventListener<MediaStateChangedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link MediaStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on MediaStateChangedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaStateChangedEvent.class)
    void addMediaStateChangedListener(EventListener<MediaStateChangedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link MediaStateChangedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaStateChangedEvent.class)
    void removeMediaStateChangedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link MediaStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaStateChangedEvent.class)
    void removeMediaStateChangedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link ConnectionStateChangedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ConnectionStateChangedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ConnectionStateChangedEvent.class)
    ListenerSubscription addConnectionStateChangedListener(EventListener<ConnectionStateChangedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ConnectionStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ConnectionStateChangedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ConnectionStateChangedEvent.class)
    void addConnectionStateChangedListener(EventListener<ConnectionStateChangedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ConnectionStateChangedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ConnectionStateChangedEvent.class)
    void removeConnectionStateChangedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ConnectionStateChangedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ConnectionStateChangedEvent.class)
    void removeConnectionStateChangedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}