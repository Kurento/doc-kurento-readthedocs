/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics related to the media stream.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCMediaStreamTrackStats extends RTCStats {

/**
 *
 * Represents the track.id property.
 *
 **/
    private String trackIdentifier;
/**
 *
 * true indicates that this is a remote source. false in other case.
 *
 **/
    private boolean remoteSource;
/**
 *
 * Synchronized sources.
 *
 **/
    private java.util.List<String> ssrcIds;
/**
 *
 * Only makes sense for video media streams and represents the width of the video frame for this SSRC.
 *
 **/
    private long frameWidth;
/**
 *
 * Only makes sense for video media streams and represents the height of the video frame for this SSRC.
 *
 **/
    private long frameHeight;
/**
 *
 * Only valid for video. It represents the nominal FPS value.
 *
 **/
    private double framesPerSecond;
/**
 *
 * Only valid for video. It represents the total number of frames sent for this SSRC.
 *
 **/
    private long framesSent;
/**
 *
 * Only valid for video and when remoteSource is set to true. It represents the total number of frames received for this SSRC.
 *
 **/
    private long framesReceived;
/**
 *
 * Only valid for video. It represents the total number of frames correctly decoded for this SSRC. 
 *
 **/
    private long framesDecoded;
/**
 *
 * Only valid for video. The total number of frames dropped predecode or dropped because the frame missed its display deadline.
 *
 **/
    private long framesDropped;
/**
 *
 * Only valid for video. The total number of corrupted frames that have been detected.
 *
 **/
    private long framesCorrupted;
/**
 *
 * Only valid for audio, and the value is between 0..1 (linear), where 1.0 represents 0 dBov.
 *
 **/
    private double audioLevel;
/**
 *
 * Only present on audio tracks sourced from a microphone where echo cancellation is applied. Calculated in decibels.
 *
 **/
    private double echoReturnLoss;
/**
 *
 * Only present on audio tracks sourced from a microphone where echo cancellation is applied.
 *
 **/
    private double echoReturnLossEnhancement;

/**
 *
 * Create a RTCMediaStreamTrackStats
 *
 **/
    public RTCMediaStreamTrackStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("trackIdentifier") String trackIdentifier, @org.kurento.client.internal.server.Param("remoteSource") boolean remoteSource, @org.kurento.client.internal.server.Param("ssrcIds") java.util.List<String> ssrcIds, @org.kurento.client.internal.server.Param("frameWidth") long frameWidth, @org.kurento.client.internal.server.Param("frameHeight") long frameHeight, @org.kurento.client.internal.server.Param("framesPerSecond") double framesPerSecond, @org.kurento.client.internal.server.Param("framesSent") long framesSent, @org.kurento.client.internal.server.Param("framesReceived") long framesReceived, @org.kurento.client.internal.server.Param("framesDecoded") long framesDecoded, @org.kurento.client.internal.server.Param("framesDropped") long framesDropped, @org.kurento.client.internal.server.Param("framesCorrupted") long framesCorrupted, @org.kurento.client.internal.server.Param("audioLevel") double audioLevel, @org.kurento.client.internal.server.Param("echoReturnLoss") double echoReturnLoss, @org.kurento.client.internal.server.Param("echoReturnLossEnhancement") double echoReturnLossEnhancement) {

	super(
id, 
type, 
timestamp);

        this.trackIdentifier = trackIdentifier;
        this.remoteSource = remoteSource;
        this.ssrcIds = ssrcIds;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.framesPerSecond = framesPerSecond;
        this.framesSent = framesSent;
        this.framesReceived = framesReceived;
        this.framesDecoded = framesDecoded;
        this.framesDropped = framesDropped;
        this.framesCorrupted = framesCorrupted;
        this.audioLevel = audioLevel;
        this.echoReturnLoss = echoReturnLoss;
        this.echoReturnLossEnhancement = echoReturnLossEnhancement;
    }

/**
 *
 * get Represents the track.id property.
 *
 **/
    public String getTrackIdentifier(){
    	return trackIdentifier;
    }

/**
 *
 * set Represents the track.id property.
 *
 **/
    public void setTrackIdentifier(String trackIdentifier){
    	this.trackIdentifier = trackIdentifier;
    }

/**
 *
 * get true indicates that this is a remote source. false in other case.
 *
 **/
    public boolean getRemoteSource(){
    	return remoteSource;
    }

/**
 *
 * set true indicates that this is a remote source. false in other case.
 *
 **/
    public void setRemoteSource(boolean remoteSource){
    	this.remoteSource = remoteSource;
    }

/**
 *
 * get Synchronized sources.
 *
 **/
    public java.util.List<String> getSsrcIds(){
    	return ssrcIds;
    }

/**
 *
 * set Synchronized sources.
 *
 **/
    public void setSsrcIds(java.util.List<String> ssrcIds){
    	this.ssrcIds = ssrcIds;
    }

/**
 *
 * get Only makes sense for video media streams and represents the width of the video frame for this SSRC.
 *
 **/
    public long getFrameWidth(){
    	return frameWidth;
    }

/**
 *
 * set Only makes sense for video media streams and represents the width of the video frame for this SSRC.
 *
 **/
    public void setFrameWidth(long frameWidth){
    	this.frameWidth = frameWidth;
    }

/**
 *
 * get Only makes sense for video media streams and represents the height of the video frame for this SSRC.
 *
 **/
    public long getFrameHeight(){
    	return frameHeight;
    }

/**
 *
 * set Only makes sense for video media streams and represents the height of the video frame for this SSRC.
 *
 **/
    public void setFrameHeight(long frameHeight){
    	this.frameHeight = frameHeight;
    }

/**
 *
 * get Only valid for video. It represents the nominal FPS value.
 *
 **/
    public double getFramesPerSecond(){
    	return framesPerSecond;
    }

/**
 *
 * set Only valid for video. It represents the nominal FPS value.
 *
 **/
    public void setFramesPerSecond(double framesPerSecond){
    	this.framesPerSecond = framesPerSecond;
    }

/**
 *
 * get Only valid for video. It represents the total number of frames sent for this SSRC.
 *
 **/
    public long getFramesSent(){
    	return framesSent;
    }

/**
 *
 * set Only valid for video. It represents the total number of frames sent for this SSRC.
 *
 **/
    public void setFramesSent(long framesSent){
    	this.framesSent = framesSent;
    }

/**
 *
 * get Only valid for video and when remoteSource is set to true. It represents the total number of frames received for this SSRC.
 *
 **/
    public long getFramesReceived(){
    	return framesReceived;
    }

/**
 *
 * set Only valid for video and when remoteSource is set to true. It represents the total number of frames received for this SSRC.
 *
 **/
    public void setFramesReceived(long framesReceived){
    	this.framesReceived = framesReceived;
    }

/**
 *
 * get Only valid for video. It represents the total number of frames correctly decoded for this SSRC. 
 *
 **/
    public long getFramesDecoded(){
    	return framesDecoded;
    }

/**
 *
 * set Only valid for video. It represents the total number of frames correctly decoded for this SSRC. 
 *
 **/
    public void setFramesDecoded(long framesDecoded){
    	this.framesDecoded = framesDecoded;
    }

/**
 *
 * get Only valid for video. The total number of frames dropped predecode or dropped because the frame missed its display deadline.
 *
 **/
    public long getFramesDropped(){
    	return framesDropped;
    }

/**
 *
 * set Only valid for video. The total number of frames dropped predecode or dropped because the frame missed its display deadline.
 *
 **/
    public void setFramesDropped(long framesDropped){
    	this.framesDropped = framesDropped;
    }

/**
 *
 * get Only valid for video. The total number of corrupted frames that have been detected.
 *
 **/
    public long getFramesCorrupted(){
    	return framesCorrupted;
    }

/**
 *
 * set Only valid for video. The total number of corrupted frames that have been detected.
 *
 **/
    public void setFramesCorrupted(long framesCorrupted){
    	this.framesCorrupted = framesCorrupted;
    }

/**
 *
 * get Only valid for audio, and the value is between 0..1 (linear), where 1.0 represents 0 dBov.
 *
 **/
    public double getAudioLevel(){
    	return audioLevel;
    }

/**
 *
 * set Only valid for audio, and the value is between 0..1 (linear), where 1.0 represents 0 dBov.
 *
 **/
    public void setAudioLevel(double audioLevel){
    	this.audioLevel = audioLevel;
    }

/**
 *
 * get Only present on audio tracks sourced from a microphone where echo cancellation is applied. Calculated in decibels.
 *
 **/
    public double getEchoReturnLoss(){
    	return echoReturnLoss;
    }

/**
 *
 * set Only present on audio tracks sourced from a microphone where echo cancellation is applied. Calculated in decibels.
 *
 **/
    public void setEchoReturnLoss(double echoReturnLoss){
    	this.echoReturnLoss = echoReturnLoss;
    }

/**
 *
 * get Only present on audio tracks sourced from a microphone where echo cancellation is applied.
 *
 **/
    public double getEchoReturnLossEnhancement(){
    	return echoReturnLossEnhancement;
    }

/**
 *
 * set Only present on audio tracks sourced from a microphone where echo cancellation is applied.
 *
 **/
    public void setEchoReturnLossEnhancement(double echoReturnLossEnhancement){
    	this.echoReturnLossEnhancement = echoReturnLossEnhancement;
    }

}

