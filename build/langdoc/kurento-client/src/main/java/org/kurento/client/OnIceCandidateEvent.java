/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Notify of a new gathered local candidate.
 *
 **/
public class OnIceCandidateEvent extends MediaEvent {

/**
 *
 * New gathered local candidate
 *
 **/
	private org.kurento.client.IceCandidate candidate;

/**
 *
 * Notify of a new gathered local candidate.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param candidate
 *       New gathered local candidate
 *
 **/
  public OnIceCandidateEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("candidate") org.kurento.client.IceCandidate candidate) {
    super(source, timestamp, tags, type);
    this.candidate = candidate;
  }

/**
 *
 * Getter for the candidate property
 * @return New gathered local candidate *
 **/
	public org.kurento.client.IceCandidate getCandidate() {
		return candidate;
	}

/**
 *
 * Setter for the candidate property
 *
 * @param candidate
 *       New gathered local candidate
 *
 **/
	public void setCandidate(org.kurento.client.IceCandidate candidate) {
		this.candidate = candidate;
	}

}
