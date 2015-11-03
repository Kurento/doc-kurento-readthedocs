/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates that an object has been destroyed on the mediaserver
 *
 **/
public class ObjectDestroyedEvent extends RaiseBaseEvent {

/**
 *
 * The id of the object that has been destroyed
 *
 **/
	private String objectId;

/**
 *
 * Indicates that an object has been destroyed on the mediaserver
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param objectId
 *       The id of the object that has been destroyed
 *
 **/
  public ObjectDestroyedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("objectId") String objectId) {
    super(source, timestamp, tags);
    this.objectId = objectId;
  }

/**
 *
 * Getter for the objectId property
 * @return The id of the object that has been destroyed *
 **/
	public String getObjectId() {
		return objectId;
	}

/**
 *
 * Setter for the objectId property
 *
 * @param objectId
 *       The id of the object that has been destroyed
 *
 **/
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

}
