/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * <p>
 *       Provides the functionality to store contents. The recorder can store in local files or in a network resource. It receives a media stream from another MediaElement (i.e. the source), and stores it in the designated location.
 *       </p>
 *       <p>
 *       The following information has to be provided In order to create a RecorderEndpoint, and can’t be changed afterwards:
 *       <ul>
 *         <li>
 *           URI of the resource where media will be stored. Following schemas are supported:
 *           <ul>
 *             <li>
 *               Files: mounted in the local file system.
 *               <ul>
 *                 <li>file://<path-to-file></li>
 *               </ul>
 *             <li>
 *               HTTP: Requires the server to support method PUT
 *               <ul>
 *                 <li>
 *                   http(s)://<server-ip>/path/to/file
 *                 </li>
 *                 <li>
 *                   http(s)://username:password@<server-ip>/path/to/file
 *                 </li>
 *               </ul>
 *             </li>
 *           </ul>
 *         </li>
 *         <li>
 *           Relative URIs (with no schema) are supported. They are completed prepending a default URI defined by property defaultPath. This property allows using relative paths instead of absolute paths. If a relative path is provided, defaultPath will be prepended. This property is defined in the configuration file /etc/kurento/modules/kurento/UriEndpoint.conf.ini, and the default value is file:///var/kurento/
 *         </li>
 *         <li>
 *           The media profile used to store the file. This will determine the encoding. See below for more details about media profile
 *         </li>
 *         <li>
 *           Optionally, the user can select if the endpoint will stop processing once the EndOfStream event is detected.
 *         </li>
 *       </ul>
 *       <p>
 *       </p>
 *       RecorderEndpoint requires access to the resource where stream is going to be recorded. If it’s a local file (file://), the system user running the media server daemon (kurento by default), needs to have write permissions for that URI. If it’s an HTTP server, it must be accessible from the machine where media server is running, and also have the correct access rights. Otherwise, the media server won’t be able to store any information, and an ErrorEvent will be fired. Please note that if you haven't subscribed to that type of event, you can be left wondering why your media is not being saved, while the error message was ignored.
 *       <p>
 *       </p>
 *       The media profile is quite an important parameter, as it will determine whether there is a transcodification or not. If the input stream codec if not compatible with the selected media profile, the media will be transcoded into a suitable format, before arriving at the RecorderEndpoint's sink pad. This will result in a higher CPU load and will impact overall performance of the media server. For instance, if a VP8 encoded video received through a WebRTC endpoint arrives at the RecorderEndpoint, depending on the format configured in the recorder:
 *       <ul>
 *         <li>WEBM: No transcodification will take place.</li>
 *         <li>MP4: The media server will have to transcode the media received from VP8 to H264. This will raise the CPU load in the system.</li>
 *       </ul>
 *       <p>
 *       </p>
 *       Recording will start as soon as the user invokes the record method. The recorder will then store, in the location indicated, the media that the source is sending to the endpoint’s sink. If no media is being received, or no endpoint has been connected, then the destination will be empty. The recorder starts storing information into the file as soon as it gets it.
 *       <p>
 *       </p>
 *       When another endpoint is connected to the recorder, by default both AUDIO and VIDEO media types are expected, unless specified otherwise when invoking the connect method. Failing to provide both types, will result in teh recording buffering the received media: it won’t be written to the file until the recording is stopped. This is due to the recorder waiting for the other type of media to arrive, so they are synchronised.
 *       <p>
 *       </p>
 *       The source endpoint can be hot-swapped, while the recording is taking place. The recorded file will then contain different feeds. When switching video sources, if the new video has different size, the recorder will retain the size of the previous source. If the source is disconnected, the last frame recorded will be shown for the duration of the disconnection, or until the recording is stopped.
 *       <p>
 *       </p>
 *       It is recommended to start recording only after media arrives, either to the endpoint that is the source of the media connected to the recorder, to the recorder itself, or both. Users may use the MediaFlowIn and MediaFlowOut events, and synchronise the recording with the moment media comes in. In any case, nothing will be stored in the file until the first media packets arrive.
 *       <p>
 *       </p>
 *       Stopping the recording process is done through the stopAndWait method, which will return only after all the information was stored correctly. If the file is empty, this means that no media arrived at the recorder.
 *       </p>
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface RecorderEndpoint extends UriEndpoint {



/**
 *
 * Starts storing media received through the sink pad.
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
 * Starts storing media received through the sink pad.
 *
 **/
    void record(Transaction tx);


/**
 *
 * Stops recording and does not return until all the content has been written to the selected uri. This can cause timeouts on some clients if there is too much content to write, or the transport is slow
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
 * Stops recording and does not return until all the content has been written to the selected uri. This can cause timeouts on some clients if there is too much content to write, or the transport is slow
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
 *       Sets the media profile used for recording. If the profile is different than the one being recieved at the sink pad, media will be trnascoded, resulting in a higher CPU load. For instance, when recording a VP8 encoded video from a WebRTC endpoint in MP4, the load is higher that when recording in WEBM.
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