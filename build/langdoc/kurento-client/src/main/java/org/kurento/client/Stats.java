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
public class Stats  {

/**
 *
 * A unique id that is associated with the object that was inspected to produce this Stats object.
 *
 **/
    private String id;
/**
 *
 * The type of this object.
 *
 **/
    private org.kurento.client.StatsType type;
/**
 *
 * The timestamp associated with this object. The time is relative to the UNIX epoch (Jan 1, 1970, UTC).
 *
 **/
    private double timestamp;

/**
 *
 * Create a Stats
 *
 **/
    public Stats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp) {

	super();

        this.id = id;
        this.type = type;
        this.timestamp = timestamp;
    }

/**
 *
 * get A unique id that is associated with the object that was inspected to produce this Stats object.
 *
 **/
    public String getId(){
    	return id;
    }

/**
 *
 * set A unique id that is associated with the object that was inspected to produce this Stats object.
 *
 **/
    public void setId(String id){
    	this.id = id;
    }

/**
 *
 * get The type of this object.
 *
 **/
    public org.kurento.client.StatsType getType(){
    	return type;
    }

/**
 *
 * set The type of this object.
 *
 **/
    public void setType(org.kurento.client.StatsType type){
    	this.type = type;
    }

/**
 *
 * get The timestamp associated with this object. The time is relative to the UNIX epoch (Jan 1, 1970, UTC).
 *
 **/
    public double getTimestamp(){
    	return timestamp;
    }

/**
 *
 * set The timestamp associated with this object. The time is relative to the UNIX epoch (Jan 1, 1970, UTC).
 *
 **/
    public void setTimestamp(double timestamp){
    	this.timestamp = timestamp;
    }

}

