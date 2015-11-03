/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates that the state of the media has changed
 *
 **/
public class MediaStateChangedEvent extends MediaEvent {

/**
 *
 * The previous state
 *
 **/
	private org.kurento.client.MediaState oldState;
/**
 *
 * The new state
 *
 **/
	private org.kurento.client.MediaState newState;

/**
 *
 * Indicates that the state of the media has changed
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param oldState
 *       The previous state
 * @param newState
 *       The new state
 *
 **/
  public MediaStateChangedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("oldState") org.kurento.client.MediaState oldState, @org.kurento.client.internal.server.Param("newState") org.kurento.client.MediaState newState) {
    super(source, timestamp, tags, type);
    this.oldState = oldState;
    this.newState = newState;
  }

/**
 *
 * Getter for the oldState property
 * @return The previous state *
 **/
	public org.kurento.client.MediaState getOldState() {
		return oldState;
	}

/**
 *
 * Setter for the oldState property
 *
 * @param oldState
 *       The previous state
 *
 **/
	public void setOldState(org.kurento.client.MediaState oldState) {
		this.oldState = oldState;
	}

/**
 *
 * Getter for the newState property
 * @return The new state *
 **/
	public org.kurento.client.MediaState getNewState() {
		return newState;
	}

/**
 *
 * Setter for the newState property
 *
 * @param newState
 *       The new state
 *
 **/
	public void setNewState(org.kurento.client.MediaState newState) {
		this.newState = newState;
	}

}
