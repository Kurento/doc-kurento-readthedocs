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
public class RTCDataChannelStats extends RTCStats {

/**
 *
 * The RTCDatachannel label.
 *
 **/
    private String label;
/**
 *
 * The protocol used.
 *
 **/
    private String protocol;
/**
 *
 * The RTCDatachannel identifier.
 *
 **/
    private long datachannelid;
/**
 *
 * The state of the RTCDatachannel.
 *
 **/
    private org.kurento.client.RTCDataChannelState state;
/**
 *
 * Represents the total number of API 'message' events sent.
 *
 **/
    private long messagesSent;
/**
 *
 * Represents the total number of payload bytes sent on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    private long bytesSent;
/**
 *
 * Represents the total number of API 'message' events received.
 *
 **/
    private long messagesReceived;
/**
 *
 * Represents the total number of bytes received on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    private long bytesReceived;

/**
 *
 * Create a RTCDataChannelStats
 *
 **/
    public RTCDataChannelStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("label") String label, @org.kurento.client.internal.server.Param("protocol") String protocol, @org.kurento.client.internal.server.Param("datachannelid") long datachannelid, @org.kurento.client.internal.server.Param("state") org.kurento.client.RTCDataChannelState state, @org.kurento.client.internal.server.Param("messagesSent") long messagesSent, @org.kurento.client.internal.server.Param("bytesSent") long bytesSent, @org.kurento.client.internal.server.Param("messagesReceived") long messagesReceived, @org.kurento.client.internal.server.Param("bytesReceived") long bytesReceived) {

	super(
id, 
type, 
timestamp);

        this.label = label;
        this.protocol = protocol;
        this.datachannelid = datachannelid;
        this.state = state;
        this.messagesSent = messagesSent;
        this.bytesSent = bytesSent;
        this.messagesReceived = messagesReceived;
        this.bytesReceived = bytesReceived;
    }

/**
 *
 * get The RTCDatachannel label.
 *
 **/
    public String getLabel(){
    	return label;
    }

/**
 *
 * set The RTCDatachannel label.
 *
 **/
    public void setLabel(String label){
    	this.label = label;
    }

/**
 *
 * get The protocol used.
 *
 **/
    public String getProtocol(){
    	return protocol;
    }

/**
 *
 * set The protocol used.
 *
 **/
    public void setProtocol(String protocol){
    	this.protocol = protocol;
    }

/**
 *
 * get The RTCDatachannel identifier.
 *
 **/
    public long getDatachannelid(){
    	return datachannelid;
    }

/**
 *
 * set The RTCDatachannel identifier.
 *
 **/
    public void setDatachannelid(long datachannelid){
    	this.datachannelid = datachannelid;
    }

/**
 *
 * get The state of the RTCDatachannel.
 *
 **/
    public org.kurento.client.RTCDataChannelState getState(){
    	return state;
    }

/**
 *
 * set The state of the RTCDatachannel.
 *
 **/
    public void setState(org.kurento.client.RTCDataChannelState state){
    	this.state = state;
    }

/**
 *
 * get Represents the total number of API 'message' events sent.
 *
 **/
    public long getMessagesSent(){
    	return messagesSent;
    }

/**
 *
 * set Represents the total number of API 'message' events sent.
 *
 **/
    public void setMessagesSent(long messagesSent){
    	this.messagesSent = messagesSent;
    }

/**
 *
 * get Represents the total number of payload bytes sent on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    public long getBytesSent(){
    	return bytesSent;
    }

/**
 *
 * set Represents the total number of payload bytes sent on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    public void setBytesSent(long bytesSent){
    	this.bytesSent = bytesSent;
    }

/**
 *
 * get Represents the total number of API 'message' events received.
 *
 **/
    public long getMessagesReceived(){
    	return messagesReceived;
    }

/**
 *
 * set Represents the total number of API 'message' events received.
 *
 **/
    public void setMessagesReceived(long messagesReceived){
    	this.messagesReceived = messagesReceived;
    }

/**
 *
 * get Represents the total number of bytes received on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    public long getBytesReceived(){
    	return bytesReceived;
    }

/**
 *
 * set Represents the total number of bytes received on this RTCDatachannel, i.e., not including headers or padding.
 *
 **/
    public void setBytesReceived(long bytesReceived){
    	this.bytesReceived = bytesReceived;
    }

}

