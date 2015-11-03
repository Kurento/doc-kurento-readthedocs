/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCIceCandidatePairStats extends RTCStats {

/**
 *
 * It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this candidate pair.
 *
 **/
    private String transportId;
/**
 *
 * It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the local candidate associated with this candidate pair.
 *
 **/
    private String localCandidateId;
/**
 *
 * It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the remote candidate associated with this candidate pair.
 *
 **/
    private String remoteCandidateId;
/**
 *
 * Represents the state of the checklist for the local and remote candidates in a pair.
 *
 **/
    private org.kurento.client.RTCStatsIceCandidatePairState state;
/**
 *
 * Calculated from candidate priorities as defined in [RFC5245] section 5.7.2.
 *
 **/
    private long priority;
/**
 *
 * Related to updating the nominated flag described in Section 7.1.3.2.4 of [RFC5245].
 *
 **/
    private boolean nominated;
/**
 *
 * Has gotten ACK to an ICE request.
 *
 **/
    private boolean writable;
/**
 *
 * Has gotten a valid incoming ICE request.
 *
 **/
    private boolean readable;
/**
 *
 * Represents the total number of payload bytes sent on this candidate pair, i.e., not including headers or padding.
 *
 **/
    private long bytesSent;
/**
 *
 * Represents the total number of payload bytes received on this candidate pair, i.e., not including headers or padding.
 *
 **/
    private long bytesReceived;
/**
 *
 * Represents the RTT computed by the STUN connectivity checks
 *
 **/
    private double roundTripTime;
/**
 *
 * Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    private double availableOutgoingBitrate;
/**
 *
 * Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    private double availableIncomingBitrate;

/**
 *
 * Create a RTCIceCandidatePairStats
 *
 **/
    public RTCIceCandidatePairStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("transportId") String transportId, @org.kurento.client.internal.server.Param("localCandidateId") String localCandidateId, @org.kurento.client.internal.server.Param("remoteCandidateId") String remoteCandidateId, @org.kurento.client.internal.server.Param("state") org.kurento.client.RTCStatsIceCandidatePairState state, @org.kurento.client.internal.server.Param("priority") long priority, @org.kurento.client.internal.server.Param("nominated") boolean nominated, @org.kurento.client.internal.server.Param("writable") boolean writable, @org.kurento.client.internal.server.Param("readable") boolean readable, @org.kurento.client.internal.server.Param("bytesSent") long bytesSent, @org.kurento.client.internal.server.Param("bytesReceived") long bytesReceived, @org.kurento.client.internal.server.Param("roundTripTime") double roundTripTime, @org.kurento.client.internal.server.Param("availableOutgoingBitrate") double availableOutgoingBitrate, @org.kurento.client.internal.server.Param("availableIncomingBitrate") double availableIncomingBitrate) {

	super(
id, 
type, 
timestamp);

        this.transportId = transportId;
        this.localCandidateId = localCandidateId;
        this.remoteCandidateId = remoteCandidateId;
        this.state = state;
        this.priority = priority;
        this.nominated = nominated;
        this.writable = writable;
        this.readable = readable;
        this.bytesSent = bytesSent;
        this.bytesReceived = bytesReceived;
        this.roundTripTime = roundTripTime;
        this.availableOutgoingBitrate = availableOutgoingBitrate;
        this.availableIncomingBitrate = availableIncomingBitrate;
    }

/**
 *
 * get It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this candidate pair.
 *
 **/
    public String getTransportId(){
    	return transportId;
    }

/**
 *
 * set It is a unique identifier that is associated to the object that was inspected to produce the RTCTransportStats associated with this candidate pair.
 *
 **/
    public void setTransportId(String transportId){
    	this.transportId = transportId;
    }

/**
 *
 * get It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the local candidate associated with this candidate pair.
 *
 **/
    public String getLocalCandidateId(){
    	return localCandidateId;
    }

/**
 *
 * set It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the local candidate associated with this candidate pair.
 *
 **/
    public void setLocalCandidateId(String localCandidateId){
    	this.localCandidateId = localCandidateId;
    }

/**
 *
 * get It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the remote candidate associated with this candidate pair.
 *
 **/
    public String getRemoteCandidateId(){
    	return remoteCandidateId;
    }

/**
 *
 * set It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidateAttributes for the remote candidate associated with this candidate pair.
 *
 **/
    public void setRemoteCandidateId(String remoteCandidateId){
    	this.remoteCandidateId = remoteCandidateId;
    }

/**
 *
 * get Represents the state of the checklist for the local and remote candidates in a pair.
 *
 **/
    public org.kurento.client.RTCStatsIceCandidatePairState getState(){
    	return state;
    }

/**
 *
 * set Represents the state of the checklist for the local and remote candidates in a pair.
 *
 **/
    public void setState(org.kurento.client.RTCStatsIceCandidatePairState state){
    	this.state = state;
    }

/**
 *
 * get Calculated from candidate priorities as defined in [RFC5245] section 5.7.2.
 *
 **/
    public long getPriority(){
    	return priority;
    }

/**
 *
 * set Calculated from candidate priorities as defined in [RFC5245] section 5.7.2.
 *
 **/
    public void setPriority(long priority){
    	this.priority = priority;
    }

/**
 *
 * get Related to updating the nominated flag described in Section 7.1.3.2.4 of [RFC5245].
 *
 **/
    public boolean getNominated(){
    	return nominated;
    }

/**
 *
 * set Related to updating the nominated flag described in Section 7.1.3.2.4 of [RFC5245].
 *
 **/
    public void setNominated(boolean nominated){
    	this.nominated = nominated;
    }

/**
 *
 * get Has gotten ACK to an ICE request.
 *
 **/
    public boolean getWritable(){
    	return writable;
    }

/**
 *
 * set Has gotten ACK to an ICE request.
 *
 **/
    public void setWritable(boolean writable){
    	this.writable = writable;
    }

/**
 *
 * get Has gotten a valid incoming ICE request.
 *
 **/
    public boolean getReadable(){
    	return readable;
    }

/**
 *
 * set Has gotten a valid incoming ICE request.
 *
 **/
    public void setReadable(boolean readable){
    	this.readable = readable;
    }

/**
 *
 * get Represents the total number of payload bytes sent on this candidate pair, i.e., not including headers or padding.
 *
 **/
    public long getBytesSent(){
    	return bytesSent;
    }

/**
 *
 * set Represents the total number of payload bytes sent on this candidate pair, i.e., not including headers or padding.
 *
 **/
    public void setBytesSent(long bytesSent){
    	this.bytesSent = bytesSent;
    }

/**
 *
 * get Represents the total number of payload bytes received on this candidate pair, i.e., not including headers or padding.
 *
 **/
    public long getBytesReceived(){
    	return bytesReceived;
    }

/**
 *
 * set Represents the total number of payload bytes received on this candidate pair, i.e., not including headers or padding.
 *
 **/
    public void setBytesReceived(long bytesReceived){
    	this.bytesReceived = bytesReceived;
    }

/**
 *
 * get Represents the RTT computed by the STUN connectivity checks
 *
 **/
    public double getRoundTripTime(){
    	return roundTripTime;
    }

/**
 *
 * set Represents the RTT computed by the STUN connectivity checks
 *
 **/
    public void setRoundTripTime(double roundTripTime){
    	this.roundTripTime = roundTripTime;
    }

/**
 *
 * get Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    public double getAvailableOutgoingBitrate(){
    	return availableOutgoingBitrate;
    }

/**
 *
 * set Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    public void setAvailableOutgoingBitrate(double availableOutgoingBitrate){
    	this.availableOutgoingBitrate = availableOutgoingBitrate;
    }

/**
 *
 * get Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    public double getAvailableIncomingBitrate(){
    	return availableIncomingBitrate;
    }

/**
 *
 * set Measured in Bits per second, and is implementation dependent. It may be calculated by the underlying congestion control.
 *
 **/
    public void setAvailableIncomingBitrate(double availableIncomingBitrate){
    	this.availableIncomingBitrate = availableIncomingBitrate;
    }

}

