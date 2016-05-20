/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Security Descriptions for Media Streams
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class SDES  {

/**
 *
 *  A string representing the cryptographic key used. The length varies depending on the cryptographic method used (30 bytes length for AES_128_CM, or 46 bytes length for AES_256_CM). If no key is provided a random one will be generated using the `getrandom` system call
 *
 **/
    private String key;
/**
 *
 * Selects the cryptographic suite to be used. For available values, please see the CryptoSuite enum.
 *
 **/
    private org.kurento.client.CryptoSuite crypto;

/**
 *
 * Create a SDES
 *
 **/
    public SDES() {

	super();

    }

/**
 *
 * get  A string representing the cryptographic key used. The length varies depending on the cryptographic method used (30 bytes length for AES_128_CM, or 46 bytes length for AES_256_CM). If no key is provided a random one will be generated using the `getrandom` system call
 *
 **/
    public String getKey(){
    	return key;
    }

/**
 *
 * set  A string representing the cryptographic key used. The length varies depending on the cryptographic method used (30 bytes length for AES_128_CM, or 46 bytes length for AES_256_CM). If no key is provided a random one will be generated using the `getrandom` system call
 *
 **/
    public void setKey(String key){
    	this.key = key;
    }

/**
 *
 * get Selects the cryptographic suite to be used. For available values, please see the CryptoSuite enum.
 *
 **/
    public org.kurento.client.CryptoSuite getCrypto(){
    	return crypto;
    }

/**
 *
 * set Selects the cryptographic suite to be used. For available values, please see the CryptoSuite enum.
 *
 **/
    public void setCrypto(org.kurento.client.CryptoSuite crypto){
    	this.crypto = crypto;
    }

}

