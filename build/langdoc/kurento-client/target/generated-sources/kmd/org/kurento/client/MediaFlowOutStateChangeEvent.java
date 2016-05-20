/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Fired when the outgoing media flow begins or ends. The event contains:
 *       <ul>
 *         <li>State: whether the endpoint is sending media (FLOWING) or not (NOT_FLOWING).</li>
 *         <li>padName. The name of the pad that changed state.</li>
 *         <li>MediaType: The type of media flowing.</li>
 *       </ul>
 *
 **/
public class MediaFlowOutStateChangeEvent extends MediaEvent {

/**
 *
 * Current media state
 *
 **/
	private org.kurento.client.MediaFlowState state;
/**
 *
 * Name of the pad which has media
 *
 **/
	private String padName;
/**
 *
 * Type of media that is flowing
 *
 **/
	private org.kurento.client.MediaType mediaType;

/**
 *
 * Fired when the outgoing media flow begins or ends. The event contains:
 *       <ul>
 *         <li>State: whether the endpoint is sending media (FLOWING) or not (NOT_FLOWING).</li>
 *         <li>padName. The name of the pad that changed state.</li>
 *         <li>MediaType: The type of media flowing.</li>
 *       </ul>
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
 *       Current media state
 * @param padName
 *       Name of the pad which has media
 * @param mediaType
 *       Type of media that is flowing
 *
 **/
  public MediaFlowOutStateChangeEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("state") org.kurento.client.MediaFlowState state, @org.kurento.client.internal.server.Param("padName") String padName, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType) {
    super(source, timestamp, tags, type);
    this.state = state;
    this.padName = padName;
    this.mediaType = mediaType;
  }

/**
 *
 * Getter for the state property
 * @return Current media state *
 **/
	public org.kurento.client.MediaFlowState getState() {
		return state;
	}

/**
 *
 * Setter for the state property
 *
 * @param state
 *       Current media state
 *
 **/
	public void setState(org.kurento.client.MediaFlowState state) {
		this.state = state;
	}

/**
 *
 * Getter for the padName property
 * @return Name of the pad which has media *
 **/
	public String getPadName() {
		return padName;
	}

/**
 *
 * Setter for the padName property
 *
 * @param padName
 *       Name of the pad which has media
 *
 **/
	public void setPadName(String padName) {
		this.padName = padName;
	}

/**
 *
 * Getter for the mediaType property
 * @return Type of media that is flowing *
 **/
	public org.kurento.client.MediaType getMediaType() {
		return mediaType;
	}

/**
 *
 * Setter for the mediaType property
 *
 * @param mediaType
 *       Type of media that is flowing
 *
 **/
	public void setMediaType(org.kurento.client.MediaType mediaType) {
		this.mediaType = mediaType;
	}

}
