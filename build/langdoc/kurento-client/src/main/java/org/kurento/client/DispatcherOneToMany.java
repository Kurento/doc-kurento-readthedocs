/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A {@link module:core/abstracts.Hub Hub} that sends a given source to all the connected sinks
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface DispatcherOneToMany extends Hub {



/**
 *
 * Sets the source port that will be connected to the sinks of every {@link module:core.HubPort HubPort} of the dispatcher
 *
 * @param source
 *       source to be broadcasted
 *
 **/
  void setSource(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source);

/**
 *
 * Asynchronous version of setSource:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see DispatcherOneToMany#setSource
 *
 * @param source
 *       source to be broadcasted
 *
 **/
    void setSource(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, Continuation<Void> cont);

/**
 *
 * Sets the source port that will be connected to the sinks of every {@link module:core.HubPort HubPort} of the dispatcher
 *
 * @param source
 *       source to be broadcasted
 *
 **/
    void setSource(Transaction tx, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source);


/**
 *
 * Remove the source port and stop the media pipeline.
 *
 **/
  void removeSource();

/**
 *
 * Asynchronous version of removeSource:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see DispatcherOneToMany#removeSource
 *
 **/
    void removeSource(Continuation<Void> cont);

/**
 *
 * Remove the source port and stop the media pipeline.
 *
 **/
    void removeSource(Transaction tx);

    



    public class Builder extends AbstractBuilder<DispatcherOneToMany> {

/**
 *
 * Creates a Builder for DispatcherOneToMany
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(DispatcherOneToMany.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}