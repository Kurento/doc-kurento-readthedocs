/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates the new state of the endpoint
 *
 **/
public class UriEndpointStateChangedEvent extends MediaEvent {

/**
 *
 * the new state
 *
 **/
	private org.kurento.client.UriEndpointState state;

/**
 *
 * Indicates the new state of the endpoint
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param state
 *       the new state
 *
 **/
  public UriEndpointStateChangedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("state") org.kurento.client.UriEndpointState state) {
    super(source, timestamp, tags, type);
    this.state = state;
  }

/**
 *
 * Getter for the state property
 * @return the new state *
 **/
	public org.kurento.client.UriEndpointState getState() {
		return state;
	}

/**
 *
 * Setter for the state property
 *
 * @param state
 *       the new state
 *
 **/
	public void setState(org.kurento.client.UriEndpointState state) {
		this.state = state;
	}

}
