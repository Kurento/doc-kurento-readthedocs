/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * The ICE candidate pair used by the ice library.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class IceCandidatePair  {

/**
 *
 * Stream ID of the ice connection
 *
 **/
    private String streamID;
/**
 *
 * Component ID of the ice connection
 *
 **/
    private int componentID;
/**
 *
 * The local candidate used by the ice library.
 *
 **/
    private String localCandidate;
/**
 *
 * The remote candidate used by the ice library.
 *
 **/
    private String remoteCandidate;

/**
 *
 * Create a IceCandidatePair
 *
 **/
    public IceCandidatePair(@org.kurento.client.internal.server.Param("streamID") String streamID, @org.kurento.client.internal.server.Param("componentID") int componentID, @org.kurento.client.internal.server.Param("localCandidate") String localCandidate, @org.kurento.client.internal.server.Param("remoteCandidate") String remoteCandidate) {

	super();

        this.streamID = streamID;
        this.componentID = componentID;
        this.localCandidate = localCandidate;
        this.remoteCandidate = remoteCandidate;
    }

/**
 *
 * get Stream ID of the ice connection
 *
 **/
    public String getStreamID(){
    	return streamID;
    }

/**
 *
 * set Stream ID of the ice connection
 *
 **/
    public void setStreamID(String streamID){
    	this.streamID = streamID;
    }

/**
 *
 * get Component ID of the ice connection
 *
 **/
    public int getComponentID(){
    	return componentID;
    }

/**
 *
 * set Component ID of the ice connection
 *
 **/
    public void setComponentID(int componentID){
    	this.componentID = componentID;
    }

/**
 *
 * get The local candidate used by the ice library.
 *
 **/
    public String getLocalCandidate(){
    	return localCandidate;
    }

/**
 *
 * set The local candidate used by the ice library.
 *
 **/
    public void setLocalCandidate(String localCandidate){
    	this.localCandidate = localCandidate;
    }

/**
 *
 * get The remote candidate used by the ice library.
 *
 **/
    public String getRemoteCandidate(){
    	return remoteCandidate;
    }

/**
 *
 * set The remote candidate used by the ice library.
 *
 **/
    public void setRemoteCandidate(String remoteCandidate){
    	this.remoteCandidate = remoteCandidate;
    }

}

