/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Provides function to store contents in reliable mode (doesn't discard data). It contains :rom:cls:`MediaSink` pads for audio and video.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface RecorderEndpoint extends UriEndpoint {



/**
 *
 * Starts storing media received through the :rom:cls:`MediaSink` pad
 *
 **/
  void record();

/**
 *
 * Asynchronous version of record:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see RecorderEndpoint#record
 *
 **/
    void record(Continuation<Void> cont);

/**
 *
 * Starts storing media received through the :rom:cls:`MediaSink` pad
 *
 **/
    void record(Transaction tx);


/**
 *
 * Stops recording and do not returns until all the content has bee written to the selected uri. This can cause timeouts on some clients if there is too much content to write and/or the transport is slow
 *
 **/
  void stopAndWait();

/**
 *
 * Asynchronous version of stopAndWait:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see RecorderEndpoint#stopAndWait
 *
 **/
    void stopAndWait(Continuation<Void> cont);

/**
 *
 * Stops recording and do not returns until all the content has bee written to the selected uri. This can cause timeouts on some clients if there is too much content to write and/or the transport is slow
 *
 **/
    void stopAndWait(Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link RecordingEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on RecordingEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecordingEvent.class)
    ListenerSubscription addRecordingListener(EventListener<RecordingEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link RecordingEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on RecordingEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecordingEvent.class)
    void addRecordingListener(EventListener<RecordingEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link RecordingEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecordingEvent.class)
    void removeRecordingListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link RecordingEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(RecordingEvent.class)
    void removeRecordingListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link PausedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on PausedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(PausedEvent.class)
    ListenerSubscription addPausedListener(EventListener<PausedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link PausedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on PausedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(PausedEvent.class)
    void addPausedListener(EventListener<PausedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link PausedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(PausedEvent.class)
    void removePausedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link PausedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(PausedEvent.class)
    void removePausedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link StoppedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on StoppedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(StoppedEvent.class)
    ListenerSubscription addStoppedListener(EventListener<StoppedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link StoppedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on StoppedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(StoppedEvent.class)
    void addStoppedListener(EventListener<StoppedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link StoppedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(StoppedEvent.class)
    void removeStoppedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link StoppedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(StoppedEvent.class)
    void removeStoppedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<RecorderEndpoint> {

/**
 *
 * Creates a Builder for RecorderEndpoint
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline, String uri){

      super(RecorderEndpoint.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
      props.add("uri",uri);
    }

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
	}
	
/**
 *
 * Sets a value for mediaProfile in Builder for RecorderEndpoint.
 *
 * @param mediaProfile
 *       Choose either one of the values defined in {@link #MediaProfileSpecType} as profile for recording
 *
 **/
    public Builder withMediaProfile(org.kurento.client.MediaProfileSpecType mediaProfile){
      props.add("mediaProfile",mediaProfile);
      return this;
    }
/**
 *
 * Forces the recorder endpoint to finish processing data when an <a href="http://www.kurento.org/docs/current/glossary.html#term-eos">EOS</a> is detected in the stream
 *
 **/
    public Builder stopOnEndOfStream(){
      props.add("stopOnEndOfStream",Boolean.TRUE);
      return this;
    }
    }


}