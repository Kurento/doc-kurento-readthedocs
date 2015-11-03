/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Base for all events raised by elements in the Kurento media server.
 *
 **/
public class MediaEvent extends RaiseBaseEvent {

/**
 *
 * Type of event that was raised
 *
 **/
	private String type;

/**
 *
 * Base for all events raised by elements in the Kurento media server.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 *
 **/
  public MediaEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type) {
    super(source, timestamp, tags);
    this.type = type;
  }

/**
 *
 * Getter for the type property
 * @return Type of event that was raised *
 **/
	public String getType() {
		return type;
	}

/**
 *
 * Setter for the type property
 *
 * @param type
 *       Type of event that was raised
 *
 **/
	public void setType(String type) {
		this.type = type;
	}

}
