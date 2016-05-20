/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Fired when the recoding effectively starts. ie: Media is received by the recorder and record method has been called.
 *
 **/
public class RecordingEvent extends MediaEvent {


/**
 *
 * Fired when the recoding effectively starts. ie: Media is received by the recorder and record method has been called.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 *
 **/
  public RecordingEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type) {
    super(source, timestamp, tags, type);
  }

}
