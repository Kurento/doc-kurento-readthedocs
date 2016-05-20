/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Fired when encryption is used and any stream reached the soft key usage limit, which means it will expire soon.
 *
 **/
public class OnKeySoftLimitEvent extends MediaEvent {

/**
 *
 * The media stream
 *
 **/
	private org.kurento.client.MediaType mediaType;

/**
 *
 * Fired when encryption is used and any stream reached the soft key usage limit, which means it will expire soon.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param mediaType
 *       The media stream
 *
 **/
  public OnKeySoftLimitEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType) {
    super(source, timestamp, tags, type);
    this.mediaType = mediaType;
  }

/**
 *
 * Getter for the mediaType property
 * @return The media stream *
 **/
	public org.kurento.client.MediaType getMediaType() {
		return mediaType;
	}

/**
 *
 * Setter for the mediaType property
 *
 * @param mediaType
 *       The media stream
 *
 **/
	public void setMediaType(org.kurento.client.MediaType mediaType) {
		this.mediaType = mediaType;
	}

}
