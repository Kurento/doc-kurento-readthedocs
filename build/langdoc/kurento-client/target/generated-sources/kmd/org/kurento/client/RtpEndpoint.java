/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Endpoint that provides bidirectional content delivery capabilities with remote networked peers through RTP or SRTP protocol. An {@link module:elements.RtpEndpoint RtpEndpoint} contains paired sink and source :rom:cls:`MediaPad` for audio and video. This endpoint inherits from {@link module:core/abstracts.BaseRtpEndpoint BaseRtpEndpoint}.
 *       </p>
 *       <p>
 *       In order to establish an RTP/SRTP communication, peers engage in an SDP negotiation process, where one of the peers (the offerer) sends an offer, while the other peer (the offeree) responds with an answer. This endpoint can function in both situations
 *       <ul style='list-style-type:circle'>
 *         <li>
 *           As offerer: The negotiation process is initiated by the media server
 *           <ul>
 *             <li>KMS generates the SDP offer through the generateOffer method. This offer must then be sent to the remote peer (the offeree) through the signaling channel, for processing.</li>
 *             <li>The remote peer process the Offer, and generates an Answer to this offer. The Answer is sent back to the media server.</li>
 *             <li>Upon receiving the Answer, the endpoint must invoke the processAnswer method.</li>
 *           </ul>
 *         </li>
 *         <li>
 *           As offeree: The negotiation process is initiated by the remote peer
 *           <ul>
 *             <li>The remote peer, acting as offerer, generates an SDP offer and sends it to the WebRTC endpoint in Kurento.</li>
 *             <li>The endpoint will process the Offer invoking the processOffer method. The result of this method will be a string, containing an SDP Answer.</li>
 *             <li>The SDP Answer must be sent back to the offerer, so it can be processed.</li>
 *           </ul>
 *         </li>
 *       </ul>
 *       </p>
 *       <p>
 *       In case of unidirectional connections (i.e. only one peer is going to send media), the process is more simple, as only the emitter needs to process an SDP. On top of the information about media codecs and types, the SDP must contain the IP of the remote peer, and the port where it will be listening. This way, the SDP can be mangled without needing to go through the exchange process, as the receiving peer does not need to process any answer.
 *       </p>
 *       <p>
 *       While there is no congestion control in this endpoint, the user can set some bandwidth limits that will be used during the negotiation process.
 *       The default bandwidth range of the endpoint is 100kbps-500kbps, but it can be changed separately for input/output directions and for audio/video streams.
 *       <ul style='list-style-type:circle'>
 *         <li>
 *           Input bandwidth control mechanism: Configuration interval used to inform remote peer the range of bitrates that can be pushed into this RtpEndpoint object. These values are announced in the SDP.
 *           <ul>
 *             <li>
 *               setMaxVideoRecvBandwidth: sets Max bitrate limits expected for received video stream.
 *             </li>
 *             <li>
 *               setMaxAudioRecvBandwidth: sets Max bitrate limits expected for received audio stream.
 *             </li>
 *           </ul>
 *         </li>
 *         <li>
 *           Output bandwidth control mechanism: Configuration interval used to control bitrate of the output video stream sent to remote peer. Remote peers can also announce bandwidth limitation in their SDPs (through the b=<modifier>:<value> tag). Kurento will always enforce bitrate limitations specified by the remote peer over internal configurations.
 *           <ul>
 *             <li>
 *               setMaxVideoSendBandwidth: sets Max bitrate limits for video sent to remote peer.
 *             </li>
 *             <li>
 *               setMinVideoSendBandwidth: sets Min bitrate limits for audio sent to remote peer.
 *             </li>
 *           </ul>
 *         </li>
 *       </ul>
 *       All bandwidth control parameters must be changed before the SDP negotiation takes place, and can't be modified afterwards.
 *       TODO: What happens if the b=as tag form the SDP has a lower value than the one set in setMinVideoSendBandwidth?
 *       </p>
 *       <p>
 *       Having no congestion ocntrol implementation means that the bitrate will remain constant. This is something to take into consideration when setting upper limits for the output bandwidth, or the local network connection can be overflooded.
 *       </p>
 *       
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface RtpEndpoint extends BaseRtpEndpoint {


    /**
     * Add a {@link EventListener} for event {@link OnKeySoftLimitEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on OnKeySoftLimitEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(OnKeySoftLimitEvent.class)
    ListenerSubscription addOnKeySoftLimitListener(EventListener<OnKeySoftLimitEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link OnKeySoftLimitEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on OnKeySoftLimitEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(OnKeySoftLimitEvent.class)
    void addOnKeySoftLimitListener(EventListener<OnKeySoftLimitEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link OnKeySoftLimitEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(OnKeySoftLimitEvent.class)
    void removeOnKeySoftLimitListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link OnKeySoftLimitEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(OnKeySoftLimitEvent.class)
    void removeOnKeySoftLimitListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<RtpEndpoint> {

/**
 *
 * Creates a Builder for RtpEndpoint
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(RtpEndpoint.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
	}
	
/**
 *
 * Sets a value for crypto in Builder for RtpEndpoint.
 *
 * @param crypto
 *       SDES-type param. If present, this parameter indicates that the communication will be encrypted. By default no encryption is used.
 *
 **/
    public Builder withCrypto(org.kurento.client.SDES crypto){
      props.add("crypto",crypto);
      return this;
    }
/**
 *
 * This configures the endpoint to use IPv6 instead of IPv4.
 *
 **/
    public Builder useIpv6(){
      props.add("useIpv6",Boolean.TRUE);
      return this;
    }
    }


}