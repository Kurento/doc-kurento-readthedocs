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

/**
 *
 * Get Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     int getMinVideoRecvBandwidth();

/**
 *
 * Get Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void getMinVideoRecvBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     TFuture<Integer> getMinVideoRecvBandwidth(Transaction tx);

/**
 *
 * Set Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth);

/**
 *
 * Set Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Continuation<Void> cont);

/**
 *
 * Set Minimum video bandwidth for receiving.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Transaction tx);
/**
 *
 * Get Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     int getMinVideoSendBandwidth();

/**
 *
 * Get Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void getMinVideoSendBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     TFuture<Integer> getMinVideoSendBandwidth(Transaction tx);

/**
 *
 * Set Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth);

/**
 *
 * Set Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Continuation<Void> cont);

/**
 *
 * Set Minimum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 100
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Transaction tx);
/**
 *
 * Get Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     int getMaxVideoSendBandwidth();

/**
 *
 * Get Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     void getMaxVideoSendBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     TFuture<Integer> getMaxVideoSendBandwidth(Transaction tx);

/**
 *
 * Set Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth);

/**
 *
 * Set Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Continuation<Void> cont);

/**
 *
 * Set Maximum video bandwidth for sending.
 *   Unit: kbps(kilobits per second).
 *    0: unlimited.
 *   Default value: 500
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Transaction tx);
/**
 *
 * Get State of the media
 *
 **/
     org.kurento.client.MediaState getMediaState();

/**
 *
 * Get State of the media
 *
 **/
     void getMediaState(Continuation<org.kurento.client.MediaState> cont);

/**
 *
 * Get State of the media
 *
 **/
     TFuture<org.kurento.client.MediaState> getMediaState(Transaction tx);

/**
 *
 * Get State of the connection
 *
 **/
     org.kurento.client.ConnectionState getConnectionState();

/**
 *
 * Get State of the connection
 *
 **/
     void getConnectionState(Continuation<org.kurento.client.ConnectionState> cont);

/**
 *
 * Get State of the connection
 *
 **/
     TFuture<org.kurento.client.ConnectionState> getConnectionState(Transaction tx);

/**
 *
 * Get Parameters of the congestion control algorithm
 *
 **/
     org.kurento.client.RembParams getRembParams();

/**
 *
 * Get Parameters of the congestion control algorithm
 *
 **/
     void getRembParams(Continuation<org.kurento.client.RembParams> cont);

/**
 *
 * Get Parameters of the congestion control algorithm
 *
 **/
     TFuture<org.kurento.client.RembParams> getRembParams(Transaction tx);

/**
 *
 * Set Parameters of the congestion control algorithm
 *
 **/
     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams);

/**
 *
 * Set Parameters of the congestion control algorithm
 *
 **/
     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams, Continuation<Void> cont);

/**
 *
 * Set Parameters of the congestion control algorithm
 *
 **/
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