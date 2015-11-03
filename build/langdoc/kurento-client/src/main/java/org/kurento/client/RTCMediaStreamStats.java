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
public class RTCMediaStreamStats extends RTCStats {

/**
 *
 * Stream identifier.
 *
 **/
    private String streamIdentifier;
/**
 *
 * This is the id of the stats object, not the track.id.
 *
 **/
    private java.util.List<String> trackIds;

/**
 *
 * Create a RTCMediaStreamStats
 *
 **/
    public RTCMediaStreamStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("streamIdentifier") String streamIdentifier, @org.kurento.client.internal.server.Param("trackIds") java.util.List<String> trackIds) {

	super(
id, 
type, 
timestamp);

        this.streamIdentifier = streamIdentifier;
        this.trackIds = trackIds;
    }

/**
 *
 * get Stream identifier.
 *
 **/
    public String getStreamIdentifier(){
    	return streamIdentifier;
    }

/**
 *
 * set Stream identifier.
 *
 **/
    public void setStreamIdentifier(String streamIdentifier){
    	this.streamIdentifier = streamIdentifier;
    }

/**
 *
 * get This is the id of the stats object, not the track.id.
 *
 **/
    public java.util.List<String> getTrackIds(){
    	return trackIds;
    }

/**
 *
 * set This is the id of the stats object, not the track.id.
 *
 **/
    public void setTrackIds(java.util.List<String> trackIds){
    	this.trackIds = trackIds;
    }

}

