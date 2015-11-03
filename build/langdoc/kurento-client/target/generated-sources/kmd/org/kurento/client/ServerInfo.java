/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Description of the mediaserver
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class ServerInfo  {

/**
 *
 * MediaServer version
 *
 **/
    private String version;
/**
 *
 * Descriptor of all modules loaded by the server
 *
 **/
    private java.util.List<org.kurento.client.ModuleInfo> modules;
/**
 *
 * Describes the type of mediaserver
 *
 **/
    private org.kurento.client.ServerType type;
/**
 *
 * Describes the capabilities that this server supports
 *
 **/
    private java.util.List<String> capabilities;

/**
 *
 * Create a ServerInfo
 *
 **/
    public ServerInfo(@org.kurento.client.internal.server.Param("version") String version, @org.kurento.client.internal.server.Param("modules") java.util.List<org.kurento.client.ModuleInfo> modules, @org.kurento.client.internal.server.Param("type") org.kurento.client.ServerType type, @org.kurento.client.internal.server.Param("capabilities") java.util.List<String> capabilities) {

	super();

        this.version = version;
        this.modules = modules;
        this.type = type;
        this.capabilities = capabilities;
    }

/**
 *
 * get MediaServer version
 *
 **/
    public String getVersion(){
    	return version;
    }

/**
 *
 * set MediaServer version
 *
 **/
    public void setVersion(String version){
    	this.version = version;
    }

/**
 *
 * get Descriptor of all modules loaded by the server
 *
 **/
    public java.util.List<org.kurento.client.ModuleInfo> getModules(){
    	return modules;
    }

/**
 *
 * set Descriptor of all modules loaded by the server
 *
 **/
    public void setModules(java.util.List<org.kurento.client.ModuleInfo> modules){
    	this.modules = modules;
    }

/**
 *
 * get Describes the type of mediaserver
 *
 **/
    public org.kurento.client.ServerType getType(){
    	return type;
    }

/**
 *
 * set Describes the type of mediaserver
 *
 **/
    public void setType(org.kurento.client.ServerType type){
    	this.type = type;
    }

/**
 *
 * get Describes the capabilities that this server supports
 *
 **/
    public java.util.List<String> getCapabilities(){
    	return capabilities;
    }

/**
 *
 * set Describes the capabilities that this server supports
 *
 **/
    public void setCapabilities(java.util.List<String> capabilities){
    	this.capabilities = capabilities;
    }

}

