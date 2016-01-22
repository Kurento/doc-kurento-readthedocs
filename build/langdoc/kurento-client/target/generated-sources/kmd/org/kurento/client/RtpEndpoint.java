/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Endpoint that provides bidirectional content delivery capabilities with remote networked peers through RTP protocol. An {@link module:elements.RtpEndpoint RtpEndpoint} contains paired sink and source :rom:cls:`MediaPad` for audio and video.
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

/**
 *
 * Sets a value for crypto in Builder for RtpEndpoint.
 *
 * @param crypto
 *       Crypto parameters
 *
 **/
    public Builder withCrypto(org.kurento.client.SDES crypto){
      props.add("crypto",crypto);
      return this;
    }
/**
 *
 * Use IPv6 instead of IPv4
 *
 **/
    public Builder useIpv6(){
      props.add("useIpv6",Boolean.TRUE);
      return this;
    }
    }


}