/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Description of a loaded modules
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class ModuleInfo  {

/**
 *
 * Module version
 *
 **/
    private String version;
/**
 *
 * Module name
 *
 **/
    private String name;
/**
 *
 * Module available factories
 *
 **/
    private java.util.List<String> factories;

/**
 *
 * Create a ModuleInfo
 *
 **/
    public ModuleInfo(@org.kurento.client.internal.server.Param("version") String version, @org.kurento.client.internal.server.Param("name") String name, @org.kurento.client.internal.server.Param("factories") java.util.List<String> factories) {

	super();

        this.version = version;
        this.name = name;
        this.factories = factories;
    }

/**
 *
 * get Module version
 *
 **/
    public String getVersion(){
    	return version;
    }

/**
 *
 * set Module version
 *
 **/
    public void setVersion(String version){
    	this.version = version;
    }

/**
 *
 * get Module name
 *
 **/
    public String getName(){
    	return name;
    }

/**
 *
 * set Module name
 *
 **/
    public void setName(String name){
    	this.name = name;
    }

/**
 *
 * get Module available factories
 *
 **/
    public java.util.List<String> getFactories(){
    	return factories;
    }

/**
 *
 * set Module available factories
 *
 **/
    public void setFactories(java.util.List<String> factories){
    	this.factories = factories;
    }

}

