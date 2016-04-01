/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A pipeline is a container for a collection of {@link module:core/abstracts.MediaElement MediaElements} and :rom:cls:`MediaMixers<MediaMixer>`. It offers the methods needed to control the creation and connection of elements inside a certain pipeline.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaPipeline extends MediaObject {

/**
 *
 * Get If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     boolean getLatencyStats();

/**
 *
 * Get If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     void getLatencyStats(Continuation<Boolean> cont);

/**
 *
 * Get If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     TFuture<Boolean> getLatencyStats(Transaction tx);

/**
 *
 * Set If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     void setLatencyStats(@org.kurento.client.internal.server.Param("latencyStats") boolean latencyStats);

/**
 *
 * Set If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     void setLatencyStats(@org.kurento.client.internal.server.Param("latencyStats") boolean latencyStats, Continuation<Void> cont);

/**
 *
 * Set If statistics about pipeline latency are enabled for all mediaElements
 *
 **/
     void setLatencyStats(@org.kurento.client.internal.server.Param("latencyStats") boolean latencyStats, Transaction tx);


/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside the pipeline
 *
 * @param details
 *       Details of graph
 * @return The dot graph *
 **/
  String getGstreamerDot(@org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details);

/**
 *
 * Asynchronous version of getGstreamerDot:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaPipeline#getGstreamerDot
 *
 * @param details
 *       Details of graph
 *
 **/
    void getGstreamerDot(@org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details, Continuation<String> cont);

/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside the pipeline
 *
 * @param details
 *       Details of graph
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx, @org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details);


/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside the pipeline
 * @return The dot graph *
 **/
  String getGstreamerDot();

/**
 *
 * Asynchronous version of getGstreamerDot:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaPipeline#getGstreamerDot
 *
 **/
    void getGstreamerDot(Continuation<String> cont);

/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside the pipeline
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx);

    
    Transaction beginTransaction();




}