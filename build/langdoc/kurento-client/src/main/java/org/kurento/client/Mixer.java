/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A {@link module:core/abstracts.Hub Hub} that allows routing of video between arbitrary port pairs and mixing of audio among several ports
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface Mixer extends Hub {



/**
 *
 * Connects each corresponding {@link MediaType} of the given source port with the sink port.
 *
 * @param media
 *       The sort of media stream to be connected
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see Mixer#connect
 *
 * @param media
 *       The sort of media stream to be connected
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink, Continuation<Void> cont);

/**
 *
 * Connects each corresponding {@link MediaType} of the given source port with the sink port.
 *
 * @param media
 *       The sort of media stream to be connected
 * @param source
 *       Source port to be connected
 * @param sink
 *       Sink port to be connected
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);


/**
 *
 * Disonnects each corresponding {@link MediaType} of the given source port from the sink port.
 *
 * @param media
 *       The sort of media stream to be disconnected
 * @param source
 *       Audio source port to be disconnected
 * @param sink
 *       Audio sink port to be disconnected
 *
 **/
  void disconnect(@org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);

/**
 *
 * Asynchronous version of disconnect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see Mixer#disconnect
 *
 * @param media
 *       The sort of media stream to be disconnected
 * @param source
 *       Audio source port to be disconnected
 * @param sink
 *       Audio sink port to be disconnected
 *
 **/
    void disconnect(@org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink, Continuation<Void> cont);

/**
 *
 * Disonnects each corresponding {@link MediaType} of the given source port from the sink port.
 *
 * @param media
 *       The sort of media stream to be disconnected
 * @param source
 *       Audio source port to be disconnected
 * @param sink
 *       Audio sink port to be disconnected
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("media") org.kurento.client.MediaType media, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.HubPort sink);

    



    public class Builder extends AbstractBuilder<Mixer> {

/**
 *
 * Creates a Builder for Mixer
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(Mixer.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}