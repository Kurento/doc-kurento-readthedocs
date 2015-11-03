/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics related to the peer connection.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCPeerConnectionStats extends RTCStats {

/**
 *
 * Represents the number of unique datachannels opened.
 *
 **/
    private long dataChannelsOpened;
/**
 *
 * Represents the number of unique datachannels closed.
 *
 **/
    private long dataChannelsClosed;

/**
 *
 * Create a RTCPeerConnectionStats
 *
 **/
    public RTCPeerConnectionStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("dataChannelsOpened") long dataChannelsOpened, @org.kurento.client.internal.server.Param("dataChannelsClosed") long dataChannelsClosed) {

	super(
id, 
type, 
timestamp);

        this.dataChannelsOpened = dataChannelsOpened;
        this.dataChannelsClosed = dataChannelsClosed;
    }

/**
 *
 * get Represents the number of unique datachannels opened.
 *
 **/
    public long getDataChannelsOpened(){
    	return dataChannelsOpened;
    }

/**
 *
 * set Represents the number of unique datachannels opened.
 *
 **/
    public void setDataChannelsOpened(long dataChannelsOpened){
    	this.dataChannelsOpened = dataChannelsOpened;
    }

/**
 *
 * get Represents the number of unique datachannels closed.
 *
 **/
    public long getDataChannelsClosed(){
    	return dataChannelsClosed;
    }

/**
 *
 * set Represents the number of unique datachannels closed.
 *
 **/
    public void setDataChannelsClosed(long dataChannelsClosed){
    	this.dataChannelsClosed = dataChannelsClosed;
    }

}

