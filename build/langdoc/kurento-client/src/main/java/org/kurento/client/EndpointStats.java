/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * A dictionary that represents the stats gathered in the endpoint element.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class EndpointStats extends ElementStats {

/**
 *
 * End-to-end audio latency measured in nano seconds
 *
 **/
    private double audioE2ELatency;
/**
 *
 * End-to-end video latency measured in nano seconds
 *
 **/
    private double videoE2ELatency;

/**
 *
 * Create a EndpointStats
 *
 **/
    public EndpointStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("inputAudioLatency") double inputAudioLatency, @org.kurento.client.internal.server.Param("inputVideoLatency") double inputVideoLatency, @org.kurento.client.internal.server.Param("audioE2ELatency") double audioE2ELatency, @org.kurento.client.internal.server.Param("videoE2ELatency") double videoE2ELatency) {

	super(
id, 
type, 
timestamp, 
inputAudioLatency, 
inputVideoLatency);

        this.audioE2ELatency = audioE2ELatency;
        this.videoE2ELatency = videoE2ELatency;
    }

/**
 *
 * get End-to-end audio latency measured in nano seconds
 *
 **/
    public double getAudioE2ELatency(){
    	return audioE2ELatency;
    }

/**
 *
 * set End-to-end audio latency measured in nano seconds
 *
 **/
    public void setAudioE2ELatency(double audioE2ELatency){
    	this.audioE2ELatency = audioE2ELatency;
    }

/**
 *
 * get End-to-end video latency measured in nano seconds
 *
 **/
    public double getVideoE2ELatency(){
    	return videoE2ELatency;
    }

/**
 *
 * set End-to-end video latency measured in nano seconds
 *
 **/
    public void setVideoE2ELatency(double videoE2ELatency){
    	this.videoE2ELatency = videoE2ELatency;
    }

}

