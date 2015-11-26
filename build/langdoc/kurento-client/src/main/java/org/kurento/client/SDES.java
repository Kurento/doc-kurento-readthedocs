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
 * The cryptographic master key. It should be 30 bytes length when AES_128_CM cipher is used or 46 bytes length for AES_256_CM cipher), If no key is provided a random one will be used
 *
 **/
    private String key;
/**
 *
 * The crypto-suite used
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
 * get The cryptographic master key. It should be 30 bytes length when AES_128_CM cipher is used or 46 bytes length for AES_256_CM cipher), If no key is provided a random one will be used
 *
 **/
    public String getKey(){
    	return key;
    }

/**
 *
 * set The cryptographic master key. It should be 30 bytes length when AES_128_CM cipher is used or 46 bytes length for AES_256_CM cipher), If no key is provided a random one will be used
 *
 **/
    public void setKey(String key){
    	this.key = key;
    }

/**
 *
 * get The crypto-suite used
 *
 **/
    public org.kurento.client.CryptoSuite getCrypto(){
    	return crypto;
    }

/**
 *
 * set The crypto-suite used
 *
 **/
    public void setCrypto(org.kurento.client.CryptoSuite crypto){
    	this.crypto = crypto;
    }

}

