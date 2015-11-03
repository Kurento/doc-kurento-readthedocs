/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Defines specific configuration for codecs
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class CodecConfiguration  {

/**
 *
 * Name of the codec defined as <encoding name>/<clock rate>[/<encoding parameters>]
 *
 **/
    private String name;
/**
 *
 * String used for tuning codec properties
 *
 **/
    private java.util.Map<String,String> properties;

/**
 *
 * Create a CodecConfiguration
 *
 **/
    public CodecConfiguration(@org.kurento.client.internal.server.Param("name") String name) {

	super();

        this.name = name;
    }

/**
 *
 * get Name of the codec defined as <encoding name>/<clock rate>[/<encoding parameters>]
 *
 **/
    public String getName(){
    	return name;
    }

/**
 *
 * set Name of the codec defined as <encoding name>/<clock rate>[/<encoding parameters>]
 *
 **/
    public void setName(String name){
    	this.name = name;
    }

/**
 *
 * get String used for tuning codec properties
 *
 **/
    public java.util.Map<String,String> getProperties(){
    	return properties;
    }

/**
 *
 * set String used for tuning codec properties
 *
 **/
    public void setProperties(java.util.Map<String,String> properties){
    	this.properties = properties;
    }

}

