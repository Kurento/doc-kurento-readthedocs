/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Retrieves content from seekable sources in reliable
 * mode (does not discard media information) and inject 
 * them into <a href="http://www.kurento.org/docs/current/glossary.html#term-kms">KMS</a>. It
 * contains one :rom:cls:`MediaSource` for each media type detected.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface PlayerEndpoint extends UriEndpoint {



/**
 *
 * Starts to send data to the endpoint :rom:cls:`MediaSource`
 *
 **/
  void play();

/**
 *
 * Asynchronous version of play:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see PlayerEndpoint#play
 *
 **/
    void play(Continuation<Void> cont);

/**
 *
 * Starts to send data to the endpoint :rom:cls:`MediaSource`
 *
 **/
    void play(Transaction tx);

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
    



    public class Builder extends AbstractBuilder<PlayerEndpoint> {

/**
 *
 * Creates a Builder for PlayerEndpoint
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline, String uri){

      super(PlayerEndpoint.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
      props.add("uri",uri);
    }

/**
 *
 * use encoded instead of raw media. If the parameter is false then the
 * element uses raw media. Changing this parameter can affect stability
 * severely, as lost key frames lost will not be regenerated. Changing the media type does not
 * affect to the result except in the performance (just in the case where
 * original media and target media are the same) and in the problem with the
 * key frames. We strongly recommended not to use this parameter because
 * correct behaviour is not guarantied.
 *
 **/
    public Builder useEncodedMedia(){
      props.add("useEncodedMedia",Boolean.TRUE);
      return this;
    }
    }


}