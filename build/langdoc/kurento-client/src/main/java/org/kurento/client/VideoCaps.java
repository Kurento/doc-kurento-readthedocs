/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Format for video media
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class VideoCaps  {

/**
 *
 * Video codec
 *
 **/
    private org.kurento.client.VideoCodec codec;
/**
 *
 * Framerate
 *
 **/
    private org.kurento.client.Fraction framerate;

/**
 *
 * Create a VideoCaps
 *
 **/
    public VideoCaps(@org.kurento.client.internal.server.Param("codec") org.kurento.client.VideoCodec codec, @org.kurento.client.internal.server.Param("framerate") org.kurento.client.Fraction framerate) {

	super();

        this.codec = codec;
        this.framerate = framerate;
    }

/**
 *
 * get Video codec
 *
 **/
    public org.kurento.client.VideoCodec getCodec(){
    	return codec;
    }

/**
 *
 * set Video codec
 *
 **/
    public void setCodec(org.kurento.client.VideoCodec codec){
    	this.codec = codec;
    }

/**
 *
 * get Framerate
 *
 **/
    public org.kurento.client.Fraction getFramerate(){
    	return framerate;
    }

/**
 *
 * set Framerate
 *
 **/
    public void setFramerate(org.kurento.client.Fraction framerate){
    	this.framerate = framerate;
    }

}

