/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * A dictionary that represents the stats gathered in the media element.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class ElementStats extends Stats {

/**
 *
 * @deprecated
 * Audio average measured on the sink pad in nano seconds
 *
 **/
    private double inputAudioLatency;
/**
 *
 * @deprecated
 * Video average measured on the sink pad in nano seconds
 *
 **/
    private double inputVideoLatency;
/**
 *
 * The average time that buffers take to get on the input pads of this element in nano seconds
 *
 **/
    private java.util.List<org.kurento.client.MediaLatencyStat> inputLatency;

/**
 *
 * Create a ElementStats
 *
 **/
    public ElementStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("inputAudioLatency") double inputAudioLatency, @org.kurento.client.internal.server.Param("inputVideoLatency") double inputVideoLatency, @org.kurento.client.internal.server.Param("inputLatency") java.util.List<org.kurento.client.MediaLatencyStat> inputLatency) {

	super(
id, 
type, 
timestamp);

        this.inputAudioLatency = inputAudioLatency;
        this.inputVideoLatency = inputVideoLatency;
        this.inputLatency = inputLatency;
    }

/**
 *
 * get @deprecated
 * Audio average measured on the sink pad in nano seconds
 *
 **/
    public double getInputAudioLatency(){
    	return inputAudioLatency;
    }

/**
 *
 * set @deprecated
 * Audio average measured on the sink pad in nano seconds
 *
 **/
    public void setInputAudioLatency(double inputAudioLatency){
    	this.inputAudioLatency = inputAudioLatency;
    }

/**
 *
 * get @deprecated
 * Video average measured on the sink pad in nano seconds
 *
 **/
    public double getInputVideoLatency(){
    	return inputVideoLatency;
    }

/**
 *
 * set @deprecated
 * Video average measured on the sink pad in nano seconds
 *
 **/
    public void setInputVideoLatency(double inputVideoLatency){
    	this.inputVideoLatency = inputVideoLatency;
    }

/**
 *
 * get The average time that buffers take to get on the input pads of this element in nano seconds
 *
 **/
    public java.util.List<org.kurento.client.MediaLatencyStat> getInputLatency(){
    	return inputLatency;
    }

/**
 *
 * set The average time that buffers take to get on the input pads of this element in nano seconds
 *
 **/
    public void setInputLatency(java.util.List<org.kurento.client.MediaLatencyStat> inputLatency){
    	this.inputLatency = inputLatency;
    }

}

