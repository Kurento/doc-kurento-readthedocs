/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * A dictionary that represents the stats gathered.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class MediaLatencyStat  {

/**
 *
 * The pad name
 *
 **/
    private String name;
/**
 *
 * Type of media stream
 *
 **/
    private org.kurento.client.MediaType type;
/**
 *
 * The average time that buffers take to get on the input pad of this element
 *
 **/
    private double avg;

/**
 *
 * Create a MediaLatencyStat
 *
 **/
    public MediaLatencyStat(@org.kurento.client.internal.server.Param("name") String name, @org.kurento.client.internal.server.Param("type") org.kurento.client.MediaType type, @org.kurento.client.internal.server.Param("avg") double avg) {

	super();

        this.name = name;
        this.type = type;
        this.avg = avg;
    }

/**
 *
 * get The pad name
 *
 **/
    public String getName(){
    	return name;
    }

/**
 *
 * set The pad name
 *
 **/
    public void setName(String name){
    	this.name = name;
    }

/**
 *
 * get Type of media stream
 *
 **/
    public org.kurento.client.MediaType getType(){
    	return type;
    }

/**
 *
 * set Type of media stream
 *
 **/
    public void setType(org.kurento.client.MediaType type){
    	this.type = type;
    }

/**
 *
 * get The average time that buffers take to get on the input pad of this element
 *
 **/
    public double getAvg(){
    	return avg;
    }

/**
 *
 * set The average time that buffers take to get on the input pad of this element
 *
 **/
    public void setAvg(double avg){
    	this.avg = avg;
    }

}

