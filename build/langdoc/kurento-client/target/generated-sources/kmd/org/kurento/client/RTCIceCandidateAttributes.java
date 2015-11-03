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
public class RTCIceCandidateAttributes extends RTCStats {

/**
 *
 * It is the IP address of the candidate, allowing for IPv4 addresses, IPv6 addresses, and fully qualified domain names (FQDNs).
 *
 **/
    private String ipAddress;
/**
 *
 * It is the port number of the candidate.
 *
 **/
    private long portNumber;
/**
 *
 * Valid values for transport is one of udp and tcp. Based on the 'transport' defined in [RFC5245] section 15.1.
 *
 **/
    private String transport;
/**
 *
 * The enumeration RTCStatsIceCandidateType is based on the cand-type defined in [RFC5245] section 15.1.
 *
 **/
    private org.kurento.client.RTCStatsIceCandidateType candidateType;
/**
 *
 * Represents the priority of the candidate
 *
 **/
    private long priority;
/**
 *
 * The URL of the TURN or STUN server indicated in the RTCIceServers that translated this IP address.
 *
 **/
    private String addressSourceUrl;

/**
 *
 * Create a RTCIceCandidateAttributes
 *
 **/
    public RTCIceCandidateAttributes(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("ipAddress") String ipAddress, @org.kurento.client.internal.server.Param("portNumber") long portNumber, @org.kurento.client.internal.server.Param("transport") String transport, @org.kurento.client.internal.server.Param("candidateType") org.kurento.client.RTCStatsIceCandidateType candidateType, @org.kurento.client.internal.server.Param("priority") long priority, @org.kurento.client.internal.server.Param("addressSourceUrl") String addressSourceUrl) {

	super(
id, 
type, 
timestamp);

        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.transport = transport;
        this.candidateType = candidateType;
        this.priority = priority;
        this.addressSourceUrl = addressSourceUrl;
    }

/**
 *
 * get It is the IP address of the candidate, allowing for IPv4 addresses, IPv6 addresses, and fully qualified domain names (FQDNs).
 *
 **/
    public String getIpAddress(){
    	return ipAddress;
    }

/**
 *
 * set It is the IP address of the candidate, allowing for IPv4 addresses, IPv6 addresses, and fully qualified domain names (FQDNs).
 *
 **/
    public void setIpAddress(String ipAddress){
    	this.ipAddress = ipAddress;
    }

/**
 *
 * get It is the port number of the candidate.
 *
 **/
    public long getPortNumber(){
    	return portNumber;
    }

/**
 *
 * set It is the port number of the candidate.
 *
 **/
    public void setPortNumber(long portNumber){
    	this.portNumber = portNumber;
    }

/**
 *
 * get Valid values for transport is one of udp and tcp. Based on the 'transport' defined in [RFC5245] section 15.1.
 *
 **/
    public String getTransport(){
    	return transport;
    }

/**
 *
 * set Valid values for transport is one of udp and tcp. Based on the 'transport' defined in [RFC5245] section 15.1.
 *
 **/
    public void setTransport(String transport){
    	this.transport = transport;
    }

/**
 *
 * get The enumeration RTCStatsIceCandidateType is based on the cand-type defined in [RFC5245] section 15.1.
 *
 **/
    public org.kurento.client.RTCStatsIceCandidateType getCandidateType(){
    	return candidateType;
    }

/**
 *
 * set The enumeration RTCStatsIceCandidateType is based on the cand-type defined in [RFC5245] section 15.1.
 *
 **/
    public void setCandidateType(org.kurento.client.RTCStatsIceCandidateType candidateType){
    	this.candidateType = candidateType;
    }

/**
 *
 * get Represents the priority of the candidate
 *
 **/
    public long getPriority(){
    	return priority;
    }

/**
 *
 * set Represents the priority of the candidate
 *
 **/
    public void setPriority(long priority){
    	this.priority = priority;
    }

/**
 *
 * get The URL of the TURN or STUN server indicated in the RTCIceServers that translated this IP address.
 *
 **/
    public String getAddressSourceUrl(){
    	return addressSourceUrl;
    }

/**
 *
 * set The URL of the TURN or STUN server indicated in the RTCIceServers that translated this IP address.
 *
 **/
    public void setAddressSourceUrl(String addressSourceUrl){
    	this.addressSourceUrl = addressSourceUrl;
    }

}

