/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Format for audio media
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class AudioCaps  {

/**
 *
 * Audio codec
 *
 **/
    private org.kurento.client.AudioCodec codec;
/**
 *
 * Bitrate
 *
 **/
    private int bitrate;

/**
 *
 * Create a AudioCaps
 *
 **/
    public AudioCaps(@org.kurento.client.internal.server.Param("codec") org.kurento.client.AudioCodec codec, @org.kurento.client.internal.server.Param("bitrate") int bitrate) {

	super();

        this.codec = codec;
        this.bitrate = bitrate;
    }

/**
 *
 * get Audio codec
 *
 **/
    public org.kurento.client.AudioCodec getCodec(){
    	return codec;
    }

/**
 *
 * set Audio codec
 *
 **/
    public void setCodec(org.kurento.client.AudioCodec codec){
    	this.codec = codec;
    }

/**
 *
 * get Bitrate
 *
 **/
    public int getBitrate(){
    	return bitrate;
    }

/**
 *
 * set Bitrate
 *
 **/
    public void setBitrate(int bitrate){
    	this.bitrate = bitrate;
    }

}

