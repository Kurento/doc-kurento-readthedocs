/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Endpoint that provides bidirectional content delivery capabilities with remote networked peers through RTP protocol. An {@link module:elements.RtpEndpoint RtpEndpoint} contains paired sink and source :rom:cls:`MediaPad` for audio and video.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface RtpEndpoint extends SdpEndpoint {


    



    public class Builder extends AbstractBuilder<RtpEndpoint> {

/**
 *
 * Creates a Builder for RtpEndpoint
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(RtpEndpoint.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}