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
public class RaiseBaseEvent implements Event {

/**
 *
 * Object that raised the event
 *
 **/
	private org.kurento.client.MediaObject source;
/**
 *
 *
 **/
	private String timestamp;
/**
 *
 *
 **/
	private java.util.List<org.kurento.client.Tag> tags;

/**
 *
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 *
 **/
  public RaiseBaseEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags) {
    super();
    this.source = source;
    this.timestamp = timestamp;
    this.tags = tags;
  }

/**
 *
 * Getter for the source property
 * @return Object that raised the event *
 **/
	public org.kurento.client.MediaObject getSource() {
		return source;
	}

/**
 *
 * Setter for the source property
 *
 * @param source
 *       Object that raised the event
 *
 **/
	public void setSource(org.kurento.client.MediaObject source) {
		this.source = source;
	}

/**
 *
 * Getter for the timestamp property
 * @return  *
 **/
	public String getTimestamp() {
		return timestamp;
	}

/**
 *
 * Setter for the timestamp property
 *
 * @param timestamp
 *       
 *
 **/
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

/**
 *
 * Getter for the tags property
 * @return  *
 **/
	public java.util.List<org.kurento.client.Tag> getTags() {
		return tags;
	}

/**
 *
 * Setter for the tags property
 *
 * @param tags
 *       
 *
 **/
	public void setTags(java.util.List<org.kurento.client.Tag> tags) {
		this.tags = tags;
	}

}
