/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates that an object has been created on the mediaserver
 *
 **/
public class ObjectCreatedEvent extends RaiseBaseEvent {

/**
 *
 * The object that has been created
 *
 **/
	private org.kurento.client.MediaObject object;

/**
 *
 * Indicates that an object has been created on the mediaserver
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param object
 *       The object that has been created
 *
 **/
  public ObjectCreatedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("object") org.kurento.client.MediaObject object) {
    super(source, timestamp, tags);
    this.object = object;
  }

/**
 *
 * Getter for the object property
 * @return The object that has been created *
 **/
	public org.kurento.client.MediaObject getObject() {
		return object;
	}

/**
 *
 * Setter for the object property
 *
 * @param object
 *       The object that has been created
 *
 **/
	public void setObject(org.kurento.client.MediaObject object) {
		this.object = object;
	}

}
