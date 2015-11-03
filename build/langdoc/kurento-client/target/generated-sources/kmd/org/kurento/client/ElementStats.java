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
 * Audio average measured on the sink pad in nano seconds
 *
 **/
    private double inputAudioLatency;
/**
 *
 * Video average measured on the sink pad in nano seconds
 *
 **/
    private double inputVideoLatency;

/**
 *
 * Create a ElementStats
 *
 **/
    public ElementStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("inputAudioLatency") double inputAudioLatency, @org.kurento.client.internal.server.Param("inputVideoLatency") double inputVideoLatency) {

	super(
id, 
type, 
timestamp);

        this.inputAudioLatency = inputAudioLatency;
        this.inputVideoLatency = inputVideoLatency;
    }

/**
 *
 * get Audio average measured on the sink pad in nano seconds
 *
 **/
    public double getInputAudioLatency(){
    	return inputAudioLatency;
    }

/**
 *
 * set Audio average measured on the sink pad in nano seconds
 *
 **/
    public void setInputAudioLatency(double inputAudioLatency){
    	this.inputAudioLatency = inputAudioLatency;
    }

/**
 *
 * get Video average measured on the sink pad in nano seconds
 *
 **/
    public double getInputVideoLatency(){
    	return inputVideoLatency;
    }

/**
 *
 * set Video average measured on the sink pad in nano seconds
 *
 **/
    public void setInputVideoLatency(double inputVideoLatency){
    	this.inputVideoLatency = inputVideoLatency;
    }

}

