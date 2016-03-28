/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A {@link module:core/abstracts.Hub Hub} that allows routing between arbitrary port pairs
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface Dispatcher extends Hub {



/**
 *
 * Connects each corresponding {@link MediaType} of the given source port with the sink port.
 *
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see Dispatcher#connect
 *
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink, Continuation<Void> cont);

/**
 *
 * Connects each corresponding {@link MediaType} of the given source port with the sink port.
 *
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);

    



    public class Builder extends AbstractBuilder<Dispatcher> {

/**
 *
 * Creates a Builder for Dispatcher
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(Dispatcher.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}