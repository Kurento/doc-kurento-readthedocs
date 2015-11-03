/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates that the state of the connection has changed
 *
 **/
public class ConnectionStateChangedEvent extends MediaEvent {

/**
 *
 * The previous state
 *
 **/
	private org.kurento.client.ConnectionState oldState;
/**
 *
 * The new state
 *
 **/
	private org.kurento.client.ConnectionState newState;

/**
 *
 * Indicates that the state of the connection has changed
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
  public ConnectionStateChangedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("oldState") org.kurento.client.ConnectionState oldState, @org.kurento.client.internal.server.Param("newState") org.kurento.client.ConnectionState newState) {
    super(source, timestamp, tags, type);
    this.oldState = oldState;
    this.newState = newState;
  }

/**
 *
 * Getter for the oldState property
 * @return The previous state *
 **/
	public org.kurento.client.ConnectionState getOldState() {
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
	public void setOldState(org.kurento.client.ConnectionState oldState) {
		this.oldState = oldState;
	}

/**
 *
 * Getter for the newState property
 * @return The new state *
 **/
	public org.kurento.client.ConnectionState getNewState() {
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
	public void setNewState(org.kurento.client.ConnectionState newState) {
		this.newState = newState;
	}

}
