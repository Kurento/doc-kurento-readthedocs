/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Indicates that an element has been disconnected
 *
 **/
public class ElementDisconnectedEvent extends MediaEvent {

/**
 *
 * sink element in previous connection
 *
 **/
	private org.kurento.client.MediaElement sink;
/**
 *
 * Media type of the previous connection
 *
 **/
	private org.kurento.client.MediaType mediaType;
/**
 *
 * Description of the source media
 *
 **/
	private String sourceMediaDescription;
/**
 *
 * Description of the sink media
 *
 **/
	private String sinkMediaDescription;

/**
 *
 * Indicates that an element has been disconnected
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param sink
 *       sink element in previous connection
 * @param mediaType
 *       Media type of the previous connection
 * @param sourceMediaDescription
 *       Description of the source media
 * @param sinkMediaDescription
 *       Description of the sink media
 *
 **/
  public ElementDisconnectedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription) {
    super(source, timestamp, tags, type);
    this.sink = sink;
    this.mediaType = mediaType;
    this.sourceMediaDescription = sourceMediaDescription;
    this.sinkMediaDescription = sinkMediaDescription;
  }

/**
 *
 * Getter for the sink property
 * @return sink element in previous connection *
 **/
	public org.kurento.client.MediaElement getSink() {
		return sink;
	}

/**
 *
 * Setter for the sink property
 *
 * @param sink
 *       sink element in previous connection
 *
 **/
	public void setSink(org.kurento.client.MediaElement sink) {
		this.sink = sink;
	}

/**
 *
 * Getter for the mediaType property
 * @return Media type of the previous connection *
 **/
	public org.kurento.client.MediaType getMediaType() {
		return mediaType;
	}

/**
 *
 * Setter for the mediaType property
 *
 * @param mediaType
 *       Media type of the previous connection
 *
 **/
	public void setMediaType(org.kurento.client.MediaType mediaType) {
		this.mediaType = mediaType;
	}

/**
 *
 * Getter for the sourceMediaDescription property
 * @return Description of the source media *
 **/
	public String getSourceMediaDescription() {
		return sourceMediaDescription;
	}

/**
 *
 * Setter for the sourceMediaDescription property
 *
 * @param sourceMediaDescription
 *       Description of the source media
 *
 **/
	public void setSourceMediaDescription(String sourceMediaDescription) {
		this.sourceMediaDescription = sourceMediaDescription;
	}

/**
 *
 * Getter for the sinkMediaDescription property
 * @return Description of the sink media *
 **/
	public String getSinkMediaDescription() {
		return sinkMediaDescription;
	}

/**
 *
 * Setter for the sinkMediaDescription property
 *
 * @param sinkMediaDescription
 *       Description of the sink media
 *
 **/
	public void setSinkMediaDescription(String sinkMediaDescription) {
		this.sinkMediaDescription = sinkMediaDescription;
	}

}
