/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics for the RTP stream
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCRTPStreamStats extends RTCStats {

/**
 *
 * The synchronized source SSRC
 *
 **/
    private String ssrc;
/**
 *
 * The associateStatsId is used for looking up the corresponding (local/remote) RTCStats object for a given SSRC.
 *
 **/
    private String associateStatsId;
/**
 *
 * false indicates that the statistics are measured locally, while true indicates that the measurements were done at the remote endpoint and reported in an RTCP RR/XR.
 *
 **/
    private boolean isRemote;
/**
 *
 * Track identifier.
 *
 **/
    private String mediaTrackId;
/**
 *
 * It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this RTP stream.
 *
 **/
    private String transportId;
/**
 *
 * The codec identifier
 *
 **/
    private String codecId;
/**
 *
 * Count the total number of Full Intra Request (FIR) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    private long firCount;
/**
 *
 * Count the total number of Packet Loss Indication (PLI) packets received by the sender and is sent by receiver.
 *
 **/
    private long pliCount;
/**
 *
 * Count the total number of Negative ACKnowledgement (NACK) packets received by the sender and is sent by receiver.
 *
 **/
    private long nackCount;
/**
 *
 * Count the total number of Slice Loss Indication (SLI) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    private long sliCount;
/**
 *
 * The Receiver Estimated Maximum Bitrate (REMB). This metric is only valid for video.
 *
 **/
    private long remb;
/**
 *
 * Total number of RTP packets lost for this SSRC.
 *
 **/
    private long packetsLost;
/**
 *
 * The fraction packet loss reported for this SSRC.
 *
 **/
    private double fractionLost;

/**
 *
 * Create a RTCRTPStreamStats
 *
 **/
    public RTCRTPStreamStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("ssrc") String ssrc, @org.kurento.client.internal.server.Param("associateStatsId") String associateStatsId, @org.kurento.client.internal.server.Param("isRemote") boolean isRemote, @org.kurento.client.internal.server.Param("mediaTrackId") String mediaTrackId, @org.kurento.client.internal.server.Param("transportId") String transportId, @org.kurento.client.internal.server.Param("codecId") String codecId, @org.kurento.client.internal.server.Param("firCount") long firCount, @org.kurento.client.internal.server.Param("pliCount") long pliCount, @org.kurento.client.internal.server.Param("nackCount") long nackCount, @org.kurento.client.internal.server.Param("sliCount") long sliCount, @org.kurento.client.internal.server.Param("remb") long remb, @org.kurento.client.internal.server.Param("packetsLost") long packetsLost, @org.kurento.client.internal.server.Param("fractionLost") double fractionLost) {

	super(
id, 
type, 
timestamp);

        this.ssrc = ssrc;
        this.associateStatsId = associateStatsId;
        this.isRemote = isRemote;
        this.mediaTrackId = mediaTrackId;
        this.transportId = transportId;
        this.codecId = codecId;
        this.firCount = firCount;
        this.pliCount = pliCount;
        this.nackCount = nackCount;
        this.sliCount = sliCount;
        this.remb = remb;
        this.packetsLost = packetsLost;
        this.fractionLost = fractionLost;
    }

/**
 *
 * get The synchronized source SSRC
 *
 **/
    public String getSsrc(){
    	return ssrc;
    }

/**
 *
 * set The synchronized source SSRC
 *
 **/
    public void setSsrc(String ssrc){
    	this.ssrc = ssrc;
    }

/**
 *
 * get The associateStatsId is used for looking up the corresponding (local/remote) RTCStats object for a given SSRC.
 *
 **/
    public String getAssociateStatsId(){
    	return associateStatsId;
    }

/**
 *
 * set The associateStatsId is used for looking up the corresponding (local/remote) RTCStats object for a given SSRC.
 *
 **/
    public void setAssociateStatsId(String associateStatsId){
    	this.associateStatsId = associateStatsId;
    }

/**
 *
 * get false indicates that the statistics are measured locally, while true indicates that the measurements were done at the remote endpoint and reported in an RTCP RR/XR.
 *
 **/
    public boolean getIsRemote(){
    	return isRemote;
    }

/**
 *
 * set false indicates that the statistics are measured locally, while true indicates that the measurements were done at the remote endpoint and reported in an RTCP RR/XR.
 *
 **/
    public void setIsRemote(boolean isRemote){
    	this.isRemote = isRemote;
    }

/**
 *
 * get Track identifier.
 *
 **/
    public String getMediaTrackId(){
    	return mediaTrackId;
    }

/**
 *
 * set Track identifier.
 *
 **/
    public void setMediaTrackId(String mediaTrackId){
    	this.mediaTrackId = mediaTrackId;
    }

/**
 *
 * get It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this RTP stream.
 *
 **/
    public String getTransportId(){
    	return transportId;
    }

/**
 *
 * set It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this RTP stream.
 *
 **/
    public void setTransportId(String transportId){
    	this.transportId = transportId;
    }

/**
 *
 * get The codec identifier
 *
 **/
    public String getCodecId(){
    	return codecId;
    }

/**
 *
 * set The codec identifier
 *
 **/
    public void setCodecId(String codecId){
    	this.codecId = codecId;
    }

/**
 *
 * get Count the total number of Full Intra Request (FIR) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    public long getFirCount(){
    	return firCount;
    }

/**
 *
 * set Count the total number of Full Intra Request (FIR) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    public void setFirCount(long firCount){
    	this.firCount = firCount;
    }

/**
 *
 * get Count the total number of Packet Loss Indication (PLI) packets received by the sender and is sent by receiver.
 *
 **/
    public long getPliCount(){
    	return pliCount;
    }

/**
 *
 * set Count the total number of Packet Loss Indication (PLI) packets received by the sender and is sent by receiver.
 *
 **/
    public void setPliCount(long pliCount){
    	this.pliCount = pliCount;
    }

/**
 *
 * get Count the total number of Negative ACKnowledgement (NACK) packets received by the sender and is sent by receiver.
 *
 **/
    public long getNackCount(){
    	return nackCount;
    }

/**
 *
 * set Count the total number of Negative ACKnowledgement (NACK) packets received by the sender and is sent by receiver.
 *
 **/
    public void setNackCount(long nackCount){
    	this.nackCount = nackCount;
    }

/**
 *
 * get Count the total number of Slice Loss Indication (SLI) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    public long getSliCount(){
    	return sliCount;
    }

/**
 *
 * set Count the total number of Slice Loss Indication (SLI) packets received by the sender. This metric is only valid for video and is sent by receiver.
 *
 **/
    public void setSliCount(long sliCount){
    	this.sliCount = sliCount;
    }

/**
 *
 * get The Receiver Estimated Maximum Bitrate (REMB). This metric is only valid for video.
 *
 **/
    public long getRemb(){
    	return remb;
    }

/**
 *
 * set The Receiver Estimated Maximum Bitrate (REMB). This metric is only valid for video.
 *
 **/
    public void setRemb(long remb){
    	this.remb = remb;
    }

/**
 *
 * get Total number of RTP packets lost for this SSRC.
 *
 **/
    public long getPacketsLost(){
    	return packetsLost;
    }

/**
 *
 * set Total number of RTP packets lost for this SSRC.
 *
 **/
    public void setPacketsLost(long packetsLost){
    	this.packetsLost = packetsLost;
    }

/**
 *
 * get The fraction packet loss reported for this SSRC.
 *
 **/
    public double getFractionLost(){
    	return fractionLost;
    }

/**
 *
 * set The fraction packet loss reported for this SSRC.
 *
 **/
    public void setFractionLost(double fractionLost){
    	this.fractionLost = fractionLost;
    }

}

