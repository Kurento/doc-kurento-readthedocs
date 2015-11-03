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

/**
 *
 * Sets a value for mediaProfile in Builder for RecorderEndpoint.
 *
 * @param mediaProfile
 *       Choose either a {@link #MediaProfileSpecType.WEBM} or a {@link #MediaProfileSpecType.MP4} profile for recording
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