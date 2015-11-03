/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * An error related to the MediaObject has occurred
 *
 **/
public class ErrorEvent extends RaiseBaseEvent {

/**
 *
 * Textual description of the error
 *
 **/
	private String description;
/**
 *
 * Server side integer error code
 *
 **/
	private int errorCode;
/**
 *
 * Integer code as a String
 *
 **/
	private String type;

/**
 *
 * An error related to the MediaObject has occurred
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param description
 *       Textual description of the error
 * @param errorCode
 *       Server side integer error code
 * @param type
 *       Integer code as a String
 *
 **/
  public ErrorEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("description") String description, @org.kurento.client.internal.server.Param("errorCode") int errorCode, @org.kurento.client.internal.server.Param("type") String type) {
    super(source, timestamp, tags);
    this.description = description;
    this.errorCode = errorCode;
    this.type = type;
  }

/**
 *
 * Getter for the description property
 * @return Textual description of the error *
 **/
	public String getDescription() {
		return description;
	}

/**
 *
 * Setter for the description property
 *
 * @param description
 *       Textual description of the error
 *
 **/
	public void setDescription(String description) {
		this.description = description;
	}

/**
 *
 * Getter for the errorCode property
 * @return Server side integer error code *
 **/
	public int getErrorCode() {
		return errorCode;
	}

/**
 *
 * Setter for the errorCode property
 *
 * @param errorCode
 *       Server side integer error code
 *
 **/
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

/**
 *
 * Getter for the type property
 * @return Integer code as a String *
 **/
	public String getType() {
		return type;
	}

/**
 *
 * Setter for the type property
 *
 * @param type
 *       Integer code as a String
 *
 **/
	public void setType(String type) {
		this.type = type;
	}

}
