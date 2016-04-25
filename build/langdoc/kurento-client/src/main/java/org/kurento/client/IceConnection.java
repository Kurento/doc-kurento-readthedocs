/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * The ICE connection state for a certain stream and component.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class IceConnection  {

/**
 *
 * The ID of the stream
 *
 **/
    private String streamId;
/**
 *
 * The ID of the component
 *
 **/
    private int componentId;
/**
 *
 * The state of the component
 *
 **/
    private org.kurento.client.IceComponentState state;

/**
 *
 * Create a IceConnection
 *
 **/
    public IceConnection(@org.kurento.client.internal.server.Param("streamId") String streamId, @org.kurento.client.internal.server.Param("componentId") int componentId, @org.kurento.client.internal.server.Param("state") org.kurento.client.IceComponentState state) {

	super();

        this.streamId = streamId;
        this.componentId = componentId;
        this.state = state;
    }

/**
 *
 * get The ID of the stream
 *
 **/
    public String getStreamId(){
    	return streamId;
    }

/**
 *
 * set The ID of the stream
 *
 **/
    public void setStreamId(String streamId){
    	this.streamId = streamId;
    }

/**
 *
 * get The ID of the component
 *
 **/
    public int getComponentId(){
    	return componentId;
    }

/**
 *
 * set The ID of the component
 *
 **/
    public void setComponentId(int componentId){
    	this.componentId = componentId;
    }

/**
 *
 * get The state of the component
 *
 **/
    public org.kurento.client.IceComponentState getState(){
    	return state;
    }

/**
 *
 * set The state of the component
 *
 **/
    public void setState(org.kurento.client.IceComponentState state){
    	this.state = state;
    }

}

