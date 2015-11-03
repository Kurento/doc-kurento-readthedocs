/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics that represents the measurement metrics for the outgoing media stream.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCOutboundRTPStreamStats extends RTCRTPStreamStats {

/**
 *
 * Total number of RTP packets sent for this SSRC.
 *
 **/
    private long packetsSent;
/**
 *
 * Total number of bytes sent for this SSRC.
 *
 **/
    private long bytesSent;
/**
 *
 * Presently configured bitrate target of this SSRC, in bits per second.
 *
 **/
    private double targetBitrate;
/**
 *
 * Estimated round trip time (seconds) for this SSRC based on the RTCP timestamp.
 *
 **/
    private double roundTripTime;

/**
 *
 * Create a RTCOutboundRTPStreamStats
 *
 **/
    public RTCOutboundRTPStreamStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("ssrc") String ssrc, @org.kurento.client.internal.server.Param("associateStatsId") String associateStatsId, @org.kurento.client.internal.server.Param("isRemote") boolean isRemote, @org.kurento.client.internal.server.Param("mediaTrackId") String mediaTrackId, @org.kurento.client.internal.server.Param("transportId") String transportId, @org.kurento.client.internal.server.Param("codecId") String codecId, @org.kurento.client.internal.server.Param("firCount") long firCount, @org.kurento.client.internal.server.Param("pliCount") long pliCount, @org.kurento.client.internal.server.Param("nackCount") long nackCount, @org.kurento.client.internal.server.Param("sliCount") long sliCount, @org.kurento.client.internal.server.Param("remb") long remb, @org.kurento.client.internal.server.Param("packetsLost") long packetsLost, @org.kurento.client.internal.server.Param("fractionLost") double fractionLost, @org.kurento.client.internal.server.Param("packetsSent") long packetsSent, @org.kurento.client.internal.server.Param("bytesSent") long bytesSent, @org.kurento.client.internal.server.Param("targetBitrate") double targetBitrate, @org.kurento.client.internal.server.Param("roundTripTime") double roundTripTime) {

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

        this.packetsSent = packetsSent;
        this.bytesSent = bytesSent;
        this.targetBitrate = targetBitrate;
        this.roundTripTime = roundTripTime;
    }

/**
 *
 * get Total number of RTP packets sent for this SSRC.
 *
 **/
    public long getPacketsSent(){
    	return packetsSent;
    }

/**
 *
 * set Total number of RTP packets sent for this SSRC.
 *
 **/
    public void setPacketsSent(long packetsSent){
    	this.packetsSent = packetsSent;
    }

/**
 *
 * get Total number of bytes sent for this SSRC.
 *
 **/
    public long getBytesSent(){
    	return bytesSent;
    }

/**
 *
 * set Total number of bytes sent for this SSRC.
 *
 **/
    public void setBytesSent(long bytesSent){
    	this.bytesSent = bytesSent;
    }

/**
 *
 * get Presently configured bitrate target of this SSRC, in bits per second.
 *
 **/
    public double getTargetBitrate(){
    	return targetBitrate;
    }

/**
 *
 * set Presently configured bitrate target of this SSRC, in bits per second.
 *
 **/
    public void setTargetBitrate(double targetBitrate){
    	this.targetBitrate = targetBitrate;
    }

/**
 *
 * get Estimated round trip time (seconds) for this SSRC based on the RTCP timestamp.
 *
 **/
    public double getRoundTripTime(){
    	return roundTripTime;
    }

/**
 *
 * set Estimated round trip time (seconds) for this SSRC based on the RTCP timestamp.
 *
 **/
    public void setRoundTripTime(double roundTripTime){
    	this.roundTripTime = roundTripTime;
    }

}

