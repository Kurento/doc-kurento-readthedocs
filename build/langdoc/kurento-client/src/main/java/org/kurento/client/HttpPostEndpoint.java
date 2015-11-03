/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * An {@link module:elements.HttpPostEndpoint HttpPostEndpoint} contains SINK pads for AUDIO and VIDEO, which provide access to an HTTP file upload function
 *    This type of endpoint provide unidirectional communications. Its :rom:cls:`MediaSources <MediaSource>` are accessed through the <a href="http://www.kurento.org/docs/current/glossary.html#term-http">HTTP</a> POST method.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface HttpPostEndpoint extends HttpEndpoint {


    /**
     * Add a {@link EventListener} for event {@link EndOfStreamEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on EndOfStreamEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(EndOfStreamEvent.class)
    ListenerSubscription addEndOfStreamListener(EventListener<EndOfStreamEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link EndOfStreamEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on EndOfStreamEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(EndOfStreamEvent.class)
    void addEndOfStreamListener(EventListener<EndOfStreamEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link EndOfStreamEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(EndOfStreamEvent.class)
    void removeEndOfStreamListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link EndOfStreamEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(EndOfStreamEvent.class)
    void removeEndOfStreamListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<HttpPostEndpoint> {

/**
 *
 * Creates a Builder for HttpPostEndpoint
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(HttpPostEndpoint.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

/**
 *
 * Sets a value for disconnectionTimeout in Builder for HttpPostEndpoint.
 *
 * @param disconnectionTimeout
 *       This is the time that an http endpoint will wait for a reconnection, in case an HTTP connection is lost.
 *
 **/
    public Builder withDisconnectionTimeout(int disconnectionTimeout){
      props.add("disconnectionTimeout",disconnectionTimeout);
      return this;
    }
/**
 *
 * configures the endpoint to use encoded media instead of raw media. If the parameter is not set then the element uses raw media. Changing this parameter could affect in a severe way to stability because key frames lost will not be generated. Changing the media type does not affect to the result except in the performance (just in the case where original media and target media are the same) and in the problem with the key frames. We strongly recommended not to use this parameter because correct behaviour is not guarantied.
 *
 **/
    public Builder useEncodedMedia(){
      props.add("useEncodedMedia",Boolean.TRUE);
      return this;
    }
    }


}