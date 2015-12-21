/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class VideoInfo  {

/**
 *
 * Seek is possible in video source
 *
 **/
    private boolean isSeekable;
/**
 *
 * First video position to do seek in ms
 *
 **/
    private long seekableInit;
/**
 *
 * Last video position to do seek in ms
 *
 **/
    private long seekableEnd;
/**
 *
 * Video duration in ms
 *
 **/
    private long duration;

/**
 *
 * Create a VideoInfo
 *
 **/
    public VideoInfo(@org.kurento.client.internal.server.Param("isSeekable") boolean isSeekable, @org.kurento.client.internal.server.Param("seekableInit") long seekableInit, @org.kurento.client.internal.server.Param("seekableEnd") long seekableEnd, @org.kurento.client.internal.server.Param("duration") long duration) {

	super();

        this.isSeekable = isSeekable;
        this.seekableInit = seekableInit;
        this.seekableEnd = seekableEnd;
        this.duration = duration;
    }

/**
 *
 * get Seek is possible in video source
 *
 **/
    public boolean getIsSeekable(){
    	return isSeekable;
    }

/**
 *
 * set Seek is possible in video source
 *
 **/
    public void setIsSeekable(boolean isSeekable){
    	this.isSeekable = isSeekable;
    }

/**
 *
 * get First video position to do seek in ms
 *
 **/
    public long getSeekableInit(){
    	return seekableInit;
    }

/**
 *
 * set First video position to do seek in ms
 *
 **/
    public void setSeekableInit(long seekableInit){
    	this.seekableInit = seekableInit;
    }

/**
 *
 * get Last video position to do seek in ms
 *
 **/
    public long getSeekableEnd(){
    	return seekableEnd;
    }

/**
 *
 * set Last video position to do seek in ms
 *
 **/
    public void setSeekableEnd(long seekableEnd){
    	this.seekableEnd = seekableEnd;
    }

/**
 *
 * get Video duration in ms
 *
 **/
    public long getDuration(){
    	return duration;
    }

/**
 *
 * set Video duration in ms
 *
 **/
    public void setDuration(long duration){
    	this.duration = duration;
    }

}

