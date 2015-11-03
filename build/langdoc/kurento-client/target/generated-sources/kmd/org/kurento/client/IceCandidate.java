/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * IceCandidate representation based on standard (http://www.w3.org/TR/webrtc/#rtcicecandidate-type).
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class IceCandidate  {

/**
 *
 * The candidate-attribute as defined in section 15.1 of ICE (rfc5245).
 *
 **/
    private String candidate;
/**
 *
 * If present, this contains the identifier of the 'media stream identification'.
 *
 **/
    private String sdpMid;
/**
 *
 * The index (starting at zero) of the m-line in the SDP this candidate is associated with.
 *
 **/
    private int sdpMLineIndex;

/**
 *
 * Create a IceCandidate
 *
 **/
    public IceCandidate(@org.kurento.client.internal.server.Param("candidate") String candidate, @org.kurento.client.internal.server.Param("sdpMid") String sdpMid, @org.kurento.client.internal.server.Param("sdpMLineIndex") int sdpMLineIndex) {

	super();

        this.candidate = candidate;
        this.sdpMid = sdpMid;
        this.sdpMLineIndex = sdpMLineIndex;
    }

/**
 *
 * get The candidate-attribute as defined in section 15.1 of ICE (rfc5245).
 *
 **/
    public String getCandidate(){
    	return candidate;
    }

/**
 *
 * set The candidate-attribute as defined in section 15.1 of ICE (rfc5245).
 *
 **/
    public void setCandidate(String candidate){
    	this.candidate = candidate;
    }

/**
 *
 * get If present, this contains the identifier of the 'media stream identification'.
 *
 **/
    public String getSdpMid(){
    	return sdpMid;
    }

/**
 *
 * set If present, this contains the identifier of the 'media stream identification'.
 *
 **/
    public void setSdpMid(String sdpMid){
    	this.sdpMid = sdpMid;
    }

/**
 *
 * get The index (starting at zero) of the m-line in the SDP this candidate is associated with.
 *
 **/
    public int getSdpMLineIndex(){
    	return sdpMLineIndex;
    }

/**
 *
 * set The index (starting at zero) of the m-line in the SDP this candidate is associated with.
 *
 **/
    public void setSdpMLineIndex(int sdpMLineIndex){
    	this.sdpMLineIndex = sdpMLineIndex;
    }

}

