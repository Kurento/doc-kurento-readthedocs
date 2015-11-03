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
public class ElementConnectionData  {

/**
 *
 * The source element in the connection
 *
 **/
    private org.kurento.client.MediaElement source;
/**
 *
 * The sink element in the connection
 *
 **/
    private org.kurento.client.MediaElement sink;
/**
 *
 * MediaType of the connection
 *
 **/
    private org.kurento.client.MediaType type;
/**
 *
 * Description of source media. Could be emty.
 *
 **/
    private String sourceDescription;
/**
 *
 * Description of sink media. Could be emty.
 *
 **/
    private String sinkDescription;

/**
 *
 * Create a ElementConnectionData
 *
 **/
    public ElementConnectionData(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaElement source, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("type") org.kurento.client.MediaType type, @org.kurento.client.internal.server.Param("sourceDescription") String sourceDescription, @org.kurento.client.internal.server.Param("sinkDescription") String sinkDescription) {

	super();

        this.source = source;
        this.sink = sink;
        this.type = type;
        this.sourceDescription = sourceDescription;
        this.sinkDescription = sinkDescription;
    }

/**
 *
 * get The source element in the connection
 *
 **/
    public org.kurento.client.MediaElement getSource(){
    	return source;
    }

/**
 *
 * set The source element in the connection
 *
 **/
    public void setSource(org.kurento.client.MediaElement source){
    	this.source = source;
    }

/**
 *
 * get The sink element in the connection
 *
 **/
    public org.kurento.client.MediaElement getSink(){
    	return sink;
    }

/**
 *
 * set The sink element in the connection
 *
 **/
    public void setSink(org.kurento.client.MediaElement sink){
    	this.sink = sink;
    }

/**
 *
 * get MediaType of the connection
 *
 **/
    public org.kurento.client.MediaType getType(){
    	return type;
    }

/**
 *
 * set MediaType of the connection
 *
 **/
    public void setType(org.kurento.client.MediaType type){
    	this.type = type;
    }

/**
 *
 * get Description of source media. Could be emty.
 *
 **/
    public String getSourceDescription(){
    	return sourceDescription;
    }

/**
 *
 * set Description of source media. Could be emty.
 *
 **/
    public void setSourceDescription(String sourceDescription){
    	this.sourceDescription = sourceDescription;
    }

/**
 *
 * get Description of sink media. Could be emty.
 *
 **/
    public String getSinkDescription(){
    	return sinkDescription;
    }

/**
 *
 * set Description of sink media. Could be emty.
 *
 **/
    public void setSinkDescription(String sinkDescription){
    	this.sinkDescription = sinkDescription;
    }

}

