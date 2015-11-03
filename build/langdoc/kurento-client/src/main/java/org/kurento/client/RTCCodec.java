/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * RTC codec statistics
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCCodec extends RTCStats {

/**
 *
 * Payload type as used in RTP encoding.
 *
 **/
    private long payloadType;
/**
 *
 * e.g., video/vp8 or equivalent.
 *
 **/
    private String codec;
/**
 *
 * Represents the media sampling rate.
 *
 **/
    private long clockRate;
/**
 *
 * Use 2 for stereo, missing for most other cases.
 *
 **/
    private long channels;
/**
 *
 * From the SDP description line.
 *
 **/
    private String parameters;

/**
 *
 * Create a RTCCodec
 *
 **/
    public RTCCodec(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("payloadType") long payloadType, @org.kurento.client.internal.server.Param("codec") String codec, @org.kurento.client.internal.server.Param("clockRate") long clockRate, @org.kurento.client.internal.server.Param("channels") long channels, @org.kurento.client.internal.server.Param("parameters") String parameters) {

	super(
id, 
type, 
timestamp);

        this.payloadType = payloadType;
        this.codec = codec;
        this.clockRate = clockRate;
        this.channels = channels;
        this.parameters = parameters;
    }

/**
 *
 * get Payload type as used in RTP encoding.
 *
 **/
    public long getPayloadType(){
    	return payloadType;
    }

/**
 *
 * set Payload type as used in RTP encoding.
 *
 **/
    public void setPayloadType(long payloadType){
    	this.payloadType = payloadType;
    }

/**
 *
 * get e.g., video/vp8 or equivalent.
 *
 **/
    public String getCodec(){
    	return codec;
    }

/**
 *
 * set e.g., video/vp8 or equivalent.
 *
 **/
    public void setCodec(String codec){
    	this.codec = codec;
    }

/**
 *
 * get Represents the media sampling rate.
 *
 **/
    public long getClockRate(){
    	return clockRate;
    }

/**
 *
 * set Represents the media sampling rate.
 *
 **/
    public void setClockRate(long clockRate){
    	this.clockRate = clockRate;
    }

/**
 *
 * get Use 2 for stereo, missing for most other cases.
 *
 **/
    public long getChannels(){
    	return channels;
    }

/**
 *
 * set Use 2 for stereo, missing for most other cases.
 *
 **/
    public void setChannels(long channels){
    	this.channels = channels;
    }

/**
 *
 * get From the SDP description line.
 *
 **/
    public String getParameters(){
    	return parameters;
    }

/**
 *
 * set From the SDP description line.
 *
 **/
    public void setParameters(String parameters){
    	this.parameters = parameters;
    }

}

