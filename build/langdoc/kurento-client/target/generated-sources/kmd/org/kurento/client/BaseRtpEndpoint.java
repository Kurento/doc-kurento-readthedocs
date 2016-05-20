/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This class extends from the SdpEndpoint, and handles RTP communications. All endpoints that rely on this network protocol, like the RTPEndpoint or the WebRtcEndpoint, inherit from this. The endpoint provides information about the connection state and the media state. These can be consulted at any time through the mediaState and the connectionState properties. It is also possible subscribe to events fired when these properties change.
 *       <ul style='list-style-type:circle'>
 *         <li>
 *           ConnectionStateChangedEvent: This event is raised when the connection between two peers changes. It can have two values
 *           <ul>
 *             <li>CONNECTED</li>
 *             <li>DISCONNECTED</li>
 *           </ul>
 *         </li>
 *         <li>
 *           MediaStateChangedEvent: Based on RTCP packet flow, this event provides more reliable information about the state of media flow. Since RTCP packets are not flowing at a constant rate (minimizing a browser with an RTCPeerConnection might affect this interval, for instance), there is a guard period of about 5s. This traduces in a period where there might be no media flowing, but the event hasn't been fired yet. Nevertheless, this is the most reliable and useful way of knowing what the state of media exchange is. Possible values are:
 *           <ul>
 *             <li>CONNECTED: There is an RTCP packet flow between peers.</li>
 *             <li>DISCONNECTED: No RTCP packets have been received, or at least 5s have passed since the last packet arrived.</li>
 *           </ul>
 *         </li>
 *       </ul>
 *       Part of the bandwidth control of the video component of the media session is done here. The values of the properties described are in kbps.
 *       <ul style='list-style-type:circle'>
 *         <li>
 *           Input bandwidth control mechanism: Configuration interval used to inform remote peer the range of bitrates that can be pushed into this BaseRtpEndpoint object.
 *           <ul>
 *             <li>
 *               setMinVideoRecvBandwidth: sets min bitrate limits expected for the received video stream. This value is set to limit the lower value of REMB packages, if supported by the implementing class.
 *             </li>
 *           </ul>
 *           Max values are announced in the SDP, while min values are set to limit the lower value of REMB packages. It follows that min values will only have effect in peers that support this control mechanism, such as Chrome.
 *         </li>
 *         <li>
 *           Output bandwidth control mechanism: Configuration interval used to control bitrate of the output video stream sent to remote peer. It is important to keep in mind that pushed bitrate depends on network and remote peer capabilities. Remote peers can also announce bandwidth limitation in their SDPs (through the b=<modifier>:<value> tag).   Kurento will always enforce bitrate limitations specified by the remote peer over internal configurations.
 *           <ul>
 *             <li>
 *               setMinVideoSendBandwidth: sets the minimum bitrate for video to be sent to remote peer. 0 is considered unconstrained.
 *             </li>
 *             <li>
 *               setMaxVideoSendBandwidth: sets maximum bitrate limits for video sent to remote peer. 0 is considered unconstrained.
 *             </li>
 *           </ul>
 *         </li>
 *       </ul>
 *       All bandwidth control parameters must be changed before the SDP negotiation takes place, and can't be changed afterwards.
 *       </p>
 *       
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface BaseRtpEndpoint extends SdpEndpoint {

/**
 *
 * Get Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     int getMinVideoRecvBandwidth();

/**
 *
 * Get Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void getMinVideoRecvBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     TFuture<Integer> getMinVideoRecvBandwidth(Transaction tx);

/**
 *
 * Set Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth);

/**
 *
 * Set Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Continuation<Void> cont);

/**
 *
 * Set Minimum bandwidth announced for video reception, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoRecvBandwidth(@org.kurento.client.internal.server.Param("minVideoRecvBandwidth") int minVideoRecvBandwidth, Transaction tx);
/**
 *
 * Get Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     int getMinVideoSendBandwidth();

/**
 *
 * Get Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void getMinVideoSendBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     TFuture<Integer> getMinVideoSendBandwidth(Transaction tx);

/**
 *
 * Set Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth);

/**
 *
 * Set Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Continuation<Void> cont);

/**
 *
 * Set Minimum bandwidth for video transmission, in kbps. The default value is 100 kbps. 0 is considered unconstrained.
 *
 **/
     void setMinVideoSendBandwidth(@org.kurento.client.internal.server.Param("minVideoSendBandwidth") int minVideoSendBandwidth, Transaction tx);
/**
 *
 * Get Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     int getMaxVideoSendBandwidth();

/**
 *
 * Get Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     void getMaxVideoSendBandwidth(Continuation<Integer> cont);

/**
 *
 * Get Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     TFuture<Integer> getMaxVideoSendBandwidth(Transaction tx);

/**
 *
 * Set Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth);

/**
 *
 * Set Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Continuation<Void> cont);

/**
 *
 * Set Maximum bandwidth for video transmission, in kbps. The default value is 500 kbps. 0 is considered unconstrained.
 *
 **/
     void setMaxVideoSendBandwidth(@org.kurento.client.internal.server.Param("maxVideoSendBandwidth") int maxVideoSendBandwidth, Transaction tx);
/**
 *
 * Get Media flow state. Possible values are
 *           <ul>
 *             <li>CONNECTED: There is an RTCP flow.</li>
 *             <li>DISCONNECTED: No RTCP packets have been received for at least 5 sec.</li>
 *           </ul>
 *           
 *
 **/
     org.kurento.client.MediaState getMediaState();

/**
 *
 * Get Media flow state. Possible values are
 *           <ul>
 *             <li>CONNECTED: There is an RTCP flow.</li>
 *             <li>DISCONNECTED: No RTCP packets have been received for at least 5 sec.</li>
 *           </ul>
 *           
 *
 **/
     void getMediaState(Continuation<org.kurento.client.MediaState> cont);

/**
 *
 * Get Media flow state. Possible values are
 *           <ul>
 *             <li>CONNECTED: There is an RTCP flow.</li>
 *             <li>DISCONNECTED: No RTCP packets have been received for at least 5 sec.</li>
 *           </ul>
 *           
 *
 **/
     TFuture<org.kurento.client.MediaState> getMediaState(Transaction tx);

/**
 *
 * Get Connection state. Possible values are
 *           <ul>
 *             <li>CONNECTED</li>
 *             <li>DISCONNECTED</li>
 *           </ul>
 *
 **/
     org.kurento.client.ConnectionState getConnectionState();

/**
 *
 * Get Connection state. Possible values are
 *           <ul>
 *             <li>CONNECTED</li>
 *             <li>DISCONNECTED</li>
 *           </ul>
 *
 **/
     void getConnectionState(Continuation<org.kurento.client.ConnectionState> cont);

/**
 *
 * Get Connection state. Possible values are
 *           <ul>
 *             <li>CONNECTED</li>
 *             <li>DISCONNECTED</li>
 *           </ul>
 *
 **/
     TFuture<org.kurento.client.ConnectionState> getConnectionState(Transaction tx);

/**
 *
 * Get Advanced parameters to configure the congestion control algorithm.
 *
 **/
     org.kurento.client.RembParams getRembParams();

/**
 *
 * Get Advanced parameters to configure the congestion control algorithm.
 *
 **/
     void getRembParams(Continuation<org.kurento.client.RembParams> cont);

/**
 *
 * Get Advanced parameters to configure the congestion control algorithm.
 *
 **/
     TFuture<org.kurento.client.RembParams> getRembParams(Transaction tx);

/**
 *
 * Set Advanced parameters to configure the congestion control algorithm.
 *
 **/
     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams);

/**
 *
 * Set Advanced parameters to configure the congestion control algorithm.
 *
 **/
     void setRembParams(@org.kurento.client.internal.server.Param("rembParams") org.kurento.client.RembParams rembParams, Continuation<Void> cont);

/**
 *
 * Set Advanced parameters to configure the congestion control algorithm.
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