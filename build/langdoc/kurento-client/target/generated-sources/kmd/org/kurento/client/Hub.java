/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A Hub is a routing {@link module:core/abstracts.MediaObject MediaObject}. It connects several {@link module:core/abstracts.Endpoint endpoints } together
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface Hub extends MediaObject {



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
 * @see Hub#getGstreamerDot
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
 * @see Hub#getGstreamerDot
 *
 **/
    void getGstreamerDot(Continuation<String> cont);

/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside the pipeline
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx);

    




}