/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics that represents the measurement metrics for the incoming media stream.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCInboundRTPStreamStats extends RTCRTPStreamStats {

/**
 *
 * Total number of RTP packets received for this SSRC.
 *
 **/
    private long packetsReceived;
/**
 *
 * Total number of bytes received for this SSRC.
 *
 **/
    private long bytesReceived;
/**
 *
 * Packet Jitter measured in seconds for this SSRC.
 *
 **/
    private double jitter;

/**
 *
 * Create a RTCInboundRTPStreamStats
 *
 **/
    public RTCInboundRTPStreamStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("ssrc") String ssrc, @org.kurento.client.internal.server.Param("associateStatsId") String associateStatsId, @org.kurento.client.internal.server.Param("isRemote") boolean isRemote, @org.kurento.client.internal.server.Param("mediaTrackId") String mediaTrackId, @org.kurento.client.internal.server.Param("transportId") String transportId, @org.kurento.client.internal.server.Param("codecId") String codecId, @org.kurento.client.internal.server.Param("firCount") long firCount, @org.kurento.client.internal.server.Param("pliCount") long pliCount, @org.kurento.client.internal.server.Param("nackCount") long nackCount, @org.kurento.client.internal.server.Param("sliCount") long sliCount, @org.kurento.client.internal.server.Param("remb") long remb, @org.kurento.client.internal.server.Param("packetsLost") long packetsLost, @org.kurento.client.internal.server.Param("fractionLost") double fractionLost, @org.kurento.client.internal.server.Param("packetsReceived") long packetsReceived, @org.kurento.client.internal.server.Param("bytesReceived") long bytesReceived, @org.kurento.client.internal.server.Param("jitter") double jitter) {

	super(
id, 
type, 
timestamp, 
ssrc, 
associateStatsId, 
isRemote, 
mediaTrackId, 
transportId, 
codecId, 
firCount, 
pliCount, 
nackCount, 
sliCount, 
remb, 
packetsLost, 
fractionLost);

        this.packetsReceived = packetsReceived;
        this.bytesReceived = bytesReceived;
        this.jitter = jitter;
    }

/**
 *
 * get Total number of RTP packets received for this SSRC.
 *
 **/
    public long getPacketsReceived(){
    	return packetsReceived;
    }

/**
 *
 * set Total number of RTP packets received for this SSRC.
 *
 **/
    public void setPacketsReceived(long packetsReceived){
    	this.packetsReceived = packetsReceived;
    }

/**
 *
 * get Total number of bytes received for this SSRC.
 *
 **/
    public long getBytesReceived(){
    	return bytesReceived;
    }

/**
 *
 * set Total number of bytes received for this SSRC.
 *
 **/
    public void setBytesReceived(long bytesReceived){
    	this.bytesReceived = bytesReceived;
    }

/**
 *
 * get Packet Jitter measured in seconds for this SSRC.
 *
 **/
    public double getJitter(){
    	return jitter;
    }

/**
 *
 * set Packet Jitter measured in seconds for this SSRC.
 *
 **/
    public void setJitter(double jitter){
    	this.jitter = jitter;
    }

}

