/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Statistics related to RTC data channels.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCTransportStats extends RTCStats {

/**
 *
 * Represents the total number of payload bytes sent on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    private long bytesSent;
/**
 *
 * Represents the total number of bytes received on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    private long bytesReceived;
/**
 *
 * If RTP and RTCP are not multiplexed, this is the id of the transport that gives stats for the RTCP component, and this record has only the RTP component stats.
 *
 **/
    private String rtcpTransportStatsId;
/**
 *
 * Set to true when transport is active.
 *
 **/
    private boolean activeConnection;
/**
 *
 * It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidatePairStats associated with this transport.
 *
 **/
    private String selectedCandidatePairId;
/**
 *
 * For components where DTLS is negotiated, give local certificate.
 *
 **/
    private String localCertificateId;
/**
 *
 * For components where DTLS is negotiated, give remote certificate.
 *
 **/
    private String remoteCertificateId;

/**
 *
 * Create a RTCTransportStats
 *
 **/
    public RTCTransportStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("bytesSent") long bytesSent, @org.kurento.client.internal.server.Param("bytesReceived") long bytesReceived, @org.kurento.client.internal.server.Param("rtcpTransportStatsId") String rtcpTransportStatsId, @org.kurento.client.internal.server.Param("activeConnection") boolean activeConnection, @org.kurento.client.internal.server.Param("selectedCandidatePairId") String selectedCandidatePairId, @org.kurento.client.internal.server.Param("localCertificateId") String localCertificateId, @org.kurento.client.internal.server.Param("remoteCertificateId") String remoteCertificateId) {

	super(
id, 
type, 
timestamp);

        this.bytesSent = bytesSent;
        this.bytesReceived = bytesReceived;
        this.rtcpTransportStatsId = rtcpTransportStatsId;
        this.activeConnection = activeConnection;
        this.selectedCandidatePairId = selectedCandidatePairId;
        this.localCertificateId = localCertificateId;
        this.remoteCertificateId = remoteCertificateId;
    }

/**
 *
 * get Represents the total number of payload bytes sent on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    public long getBytesSent(){
    	return bytesSent;
    }

/**
 *
 * set Represents the total number of payload bytes sent on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    public void setBytesSent(long bytesSent){
    	this.bytesSent = bytesSent;
    }

/**
 *
 * get Represents the total number of bytes received on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    public long getBytesReceived(){
    	return bytesReceived;
    }

/**
 *
 * set Represents the total number of bytes received on this PeerConnection, i.e., not including headers or padding.
 *
 **/
    public void setBytesReceived(long bytesReceived){
    	this.bytesReceived = bytesReceived;
    }

/**
 *
 * get If RTP and RTCP are not multiplexed, this is the id of the transport that gives stats for the RTCP component, and this record has only the RTP component stats.
 *
 **/
    public String getRtcpTransportStatsId(){
    	return rtcpTransportStatsId;
    }

/**
 *
 * set If RTP and RTCP are not multiplexed, this is the id of the transport that gives stats for the RTCP component, and this record has only the RTP component stats.
 *
 **/
    public void setRtcpTransportStatsId(String rtcpTransportStatsId){
    	this.rtcpTransportStatsId = rtcpTransportStatsId;
    }

/**
 *
 * get Set to true when transport is active.
 *
 **/
    public boolean getActiveConnection(){
    	return activeConnection;
    }

/**
 *
 * set Set to true when transport is active.
 *
 **/
    public void setActiveConnection(boolean activeConnection){
    	this.activeConnection = activeConnection;
    }

/**
 *
 * get It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidatePairStats associated with this transport.
 *
 **/
    public String getSelectedCandidatePairId(){
    	return selectedCandidatePairId;
    }

/**
 *
 * set It is a unique identifier that is associated to the object that was inspected to produce the RTCIceCandidatePairStats associated with this transport.
 *
 **/
    public void setSelectedCandidatePairId(String selectedCandidatePairId){
    	this.selectedCandidatePairId = selectedCandidatePairId;
    }

/**
 *
 * get For components where DTLS is negotiated, give local certificate.
 *
 **/
    public String getLocalCertificateId(){
    	return localCertificateId;
    }

/**
 *
 * set For components where DTLS is negotiated, give local certificate.
 *
 **/
    public void setLocalCertificateId(String localCertificateId){
    	this.localCertificateId = localCertificateId;
    }

/**
 *
 * get For components where DTLS is negotiated, give remote certificate.
 *
 **/
    public String getRemoteCertificateId(){
    	return remoteCertificateId;
    }

/**
 *
 * set For components where DTLS is negotiated, give remote certificate.
 *
 **/
    public void setRemoteCertificateId(String remoteCertificateId){
    	this.remoteCertificateId = remoteCertificateId;
    }

}

