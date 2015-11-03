/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Event raised by a {@link module:filters.ZBarFilter ZBarFilter} when a code is found in the data being streamed.
 *
 **/
public class CodeFoundEvent extends MediaEvent {

/**
 *
 * type of <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code found
 *
 **/
	private String codeType;
/**
 *
 * value contained in the <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code
 *
 **/
	private String value;

/**
 *
 * Event raised by a {@link module:filters.ZBarFilter ZBarFilter} when a code is found in the data being streamed.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param codeType
 *       type of <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code found
 * @param value
 *       value contained in the <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code
 *
 **/
  public CodeFoundEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("codeType") String codeType, @org.kurento.client.internal.server.Param("value") String value) {
    super(source, timestamp, tags, type);
    this.codeType = codeType;
    this.value = value;
  }

/**
 *
 * Getter for the codeType property
 * @return type of <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code found *
 **/
	public String getCodeType() {
		return codeType;
	}

/**
 *
 * Setter for the codeType property
 *
 * @param codeType
 *       type of <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code found
 *
 **/
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

/**
 *
 * Getter for the value property
 * @return value contained in the <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code *
 **/
	public String getValue() {
		return value;
	}

/**
 *
 * Setter for the value property
 *
 * @param value
 *       value contained in the <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> code
 *
 **/
	public void setValue(String value) {
		this.value = value;
	}

}
