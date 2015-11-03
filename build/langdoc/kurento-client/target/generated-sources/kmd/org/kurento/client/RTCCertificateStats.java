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
public class RTCCertificateStats extends RTCStats {

/**
 *
 * Only use the fingerprint value as defined in Section 5 of [RFC4572].
 *
 **/
    private String fingerprint;
/**
 *
 * For instance, 'sha-256'.
 *
 **/
    private String fingerprintAlgorithm;
/**
 *
 * For example, DER-encoded, base-64 representation of a certifiate.
 *
 **/
    private String base64Certificate;
/**
 *
 *
 **/
    private String issuerCertificateId;

/**
 *
 * Create a RTCCertificateStats
 *
 **/
    public RTCCertificateStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp, @org.kurento.client.internal.server.Param("fingerprint") String fingerprint, @org.kurento.client.internal.server.Param("fingerprintAlgorithm") String fingerprintAlgorithm, @org.kurento.client.internal.server.Param("base64Certificate") String base64Certificate, @org.kurento.client.internal.server.Param("issuerCertificateId") String issuerCertificateId) {

	super(
id, 
type, 
timestamp);

        this.fingerprint = fingerprint;
        this.fingerprintAlgorithm = fingerprintAlgorithm;
        this.base64Certificate = base64Certificate;
        this.issuerCertificateId = issuerCertificateId;
    }

/**
 *
 * get Only use the fingerprint value as defined in Section 5 of [RFC4572].
 *
 **/
    public String getFingerprint(){
    	return fingerprint;
    }

/**
 *
 * set Only use the fingerprint value as defined in Section 5 of [RFC4572].
 *
 **/
    public void setFingerprint(String fingerprint){
    	this.fingerprint = fingerprint;
    }

/**
 *
 * get For instance, 'sha-256'.
 *
 **/
    public String getFingerprintAlgorithm(){
    	return fingerprintAlgorithm;
    }

/**
 *
 * set For instance, 'sha-256'.
 *
 **/
    public void setFingerprintAlgorithm(String fingerprintAlgorithm){
    	this.fingerprintAlgorithm = fingerprintAlgorithm;
    }

/**
 *
 * get For example, DER-encoded, base-64 representation of a certifiate.
 *
 **/
    public String getBase64Certificate(){
    	return base64Certificate;
    }

/**
 *
 * set For example, DER-encoded, base-64 representation of a certifiate.
 *
 **/
    public void setBase64Certificate(String base64Certificate){
    	this.base64Certificate = base64Certificate;
    }

/**
 *
 * get 
 *
 **/
    public String getIssuerCertificateId(){
    	return issuerCertificateId;
    }

/**
 *
 * set 
 *
 **/
    public void setIssuerCertificateId(String issuerCertificateId){
    	this.issuerCertificateId = issuerCertificateId;
    }

}

