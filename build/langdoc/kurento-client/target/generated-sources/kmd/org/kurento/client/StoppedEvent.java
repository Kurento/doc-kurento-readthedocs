/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * @deprecated</br>Fired when the recorder has been stopped and all the media has been written to storage.
 *
 **/
public class StoppedEvent extends MediaEvent {


/**
 *
 * @deprecated</br>Fired when the recorder has been stopped and all the media has been written to storage.
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
  public StoppedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type) {
    super(source, timestamp, tags, type);
  }

}
