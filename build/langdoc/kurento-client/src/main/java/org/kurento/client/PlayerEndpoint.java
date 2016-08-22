/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 *       <p>
 *       Retrieves content from seekable or non-seekable sources, and injects them into <a href="http://www.kurento.org/docs/current/glossary.html#term-kms">KMS</a>, so they can be delivered to any Filter or Endpoint in the same MediaPipeline. Following URI schemas are supported:
 *       <ul>
 *         <li>
 *           Files: Mounted in the local file system.
 *           <ul><li>file:///path/to/file</li></ul>
 *         </li>
 *         <li>
 *           RTSP: Those of IP cameras would be a good example.
 *           <ul>
 *             <li>rtsp://<server-ip></li>
 *             <li>rtsp://username:password@<server-ip></li>
 *           </ul>
 *         </li>
 *         <li>
 *           HTTP: Any file available in an HTTP server
 *           <ul>
 *             <li>http(s)://<server-ip>/path/to/file</li>
 *             <li>http(s)://username:password@<server-ip>/path/to/file</li>
 *           </ul>
 *         </li>
 *       </ul>
 *       </p>
 *       <p>
 *       For the player to stream the contents of the file, the server must have access to the resource. In case of local files, the user running the process must have read permissions over the file. For network resources, the path to the resource must be accessible: IP and port access not blocked, correct credentials, etc.The resource location can’t be changed after the player is created, and a new player should be created for streaming a different resource.
 *       </p>
 *       <p>
 *       The list of valid operations is
 *       <ul>
 *         <li>*play*: starts streaming media. If invoked after pause, it will resume playback.</li>
 *         <li>*stop*: stops streaming media. If play is invoked afterwards, the file will be streamed from the beginning.</li>
 *         <li>*pause*: pauses media streaming. Play must be invoked in order to resume playback.</li>
 *         <li>*seek*: If the source supports “jumps” in the timeline, then the PlayerEndpoint can
 *           <ul>
 *             <li>*setPosition*: allows to set the position in the file.</li>
 *             <li>*getPosition*: returns the current position being streamed.</li>
 *           </ul>
 *         </li>
 *       </ul>
 *       </p>
 *       <p>
 *       <h2>Events fired:</h2>
 *       <ul><li>EndOfStreamEvent: If the file is streamed completely.</li></ul>
 *       </p>
 *       
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface PlayerEndpoint extends UriEndpoint {

/**
 *
 * Get Returns info about the source being played
 *
 **/
     org.kurento.client.VideoInfo getVideoInfo();

/**
 *
 * Get Returns info about the source being played
 *
 **/
     void getVideoInfo(Continuation<org.kurento.client.VideoInfo> cont);

/**
 *
 * Get Returns info about the source being played
 *
 **/
     TFuture<org.kurento.client.VideoInfo> getVideoInfo(Transaction tx);

/**
 *
 * Get Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     long getPosition();

/**
 *
 * Get Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     void getPosition(Continuation<Long> cont);

/**
 *
 * Get Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     TFuture<Long> getPosition(Transaction tx);

/**
 *
 * Set Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     void setPosition(@org.kurento.client.internal.server.Param("position") long position);

/**
 *
 * Set Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     void setPosition(@org.kurento.client.internal.server.Param("position") long position, Continuation<Void> cont);

/**
 *
 * Set Get or set the actual position of the video in ms. <hr/><b>Note</b> Setting the position only works for seekable videos
 *
 **/
     void setPosition(@org.kurento.client.internal.server.Param("position") long position, Transaction tx);


/**
 *
 * Starts reproducing the media, sending it to the :rom:cls:`MediaSource`. If the endpoint
 *           has been connected to other endpoints, those will start receiving media.
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
 * Starts reproducing the media, sending it to the :rom:cls:`MediaSource`. If the endpoint
 *           has been connected to other endpoints, those will start receiving media.
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

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
	}
	
/**
 *
 * use encoded instead of raw media. If the parameter is false then the element uses raw media. Changing this parameter can affect stability severely, as lost key frames will not be regenerated. Enabling this flag does not affect the overall behaviour, but has an impact in performance (just in case where original media and target media are the same). It will help solve the problem with lost key frames. We strongly recommended not to use this parameter because correct behaviour is not guarantied.
 *
 **/
    public Builder useEncodedMedia(){
      props.add("useEncodedMedia",Boolean.TRUE);
      return this;
    }
/**
 *
 * Sets a value for networkCache in Builder for PlayerEndpoint.
 *
 * @param networkCache
 *       When using rtsp sources. Amount of ms to buffer
 *
 **/
    public Builder withNetworkCache(int networkCache){
      props.add("networkCache",networkCache);
      return this;
    }
    }


}