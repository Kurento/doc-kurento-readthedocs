/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Pair key-value with info about a MediaObject
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class Tag  {

/**
 *
 * Tag key
 *
 **/
    private String key;
/**
 *
 * Tag Value
 *
 **/
    private String value;

/**
 *
 * Create a Tag
 *
 **/
    public Tag(@org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value) {

	super();

        this.key = key;
        this.value = value;
    }

/**
 *
 * get Tag key
 *
 **/
    public String getKey(){
    	return key;
    }

/**
 *
 * set Tag key
 *
 **/
    public void setKey(String key){
    	this.key = key;
    }

/**
 *
 * get Tag Value
 *
 **/
    public String getValue(){
    	return value;
    }

/**
 *
 * set Tag Value
 *
 **/
    public void setValue(String value){
    	this.value = value;
    }

}

