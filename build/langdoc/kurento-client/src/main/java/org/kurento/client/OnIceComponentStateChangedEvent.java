/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Notify about the change of an ICE component state.
 *
 **/
public class OnIceComponentStateChangedEvent extends MediaEvent {

/**
 *
 * The ID of the stream
 *
 **/
	private int streamId;
/**
 *
 * The ID of the component
 *
 **/
	private int componentId;
/**
 *
 * The state of the component
 *
 **/
	private org.kurento.client.IceComponentState state;

/**
 *
 * Notify about the change of an ICE component state.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param streamId
 *       The ID of the stream
 * @param componentId
 *       The ID of the component
 * @param state
 *       The state of the component
 *
 **/
  public OnIceComponentStateChangedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("streamId") int streamId, @org.kurento.client.internal.server.Param("componentId") int componentId, @org.kurento.client.internal.server.Param("state") org.kurento.client.IceComponentState state) {
    super(source, timestamp, tags, type);
    this.streamId = streamId;
    this.componentId = componentId;
    this.state = state;
  }

/**
 *
 * Getter for the streamId property
 * @return The ID of the stream *
 **/
	public int getStreamId() {
		return streamId;
	}

/**
 *
 * Setter for the streamId property
 *
 * @param streamId
 *       The ID of the stream
 *
 **/
	public void setStreamId(int streamId) {
		this.streamId = streamId;
	}

/**
 *
 * Getter for the componentId property
 * @return The ID of the component *
 **/
	public int getComponentId() {
		return componentId;
	}

/**
 *
 * Setter for the componentId property
 *
 * @param componentId
 *       The ID of the component
 *
 **/
	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

/**
 *
 * Getter for the state property
 * @return The state of the component *
 **/
	public org.kurento.client.IceComponentState getState() {
		return state;
	}

/**
 *
 * Setter for the state property
 *
 * @param state
 *       The state of the component
 *
 **/
	public void setState(org.kurento.client.IceComponentState state) {
		this.state = state;
	}

}
