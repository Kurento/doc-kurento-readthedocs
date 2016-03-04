/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;


/**
 *
 * Notify of the new pair of ICE candidates used by the ice library.
 *
 **/
public class NewCandidatePairSelectedEvent extends MediaEvent {

/**
 *
 * The new pair of candidates
 *
 **/
	private org.kurento.client.IceCandidatePair candidatePair;

/**
 *
 * Notify of the new pair of ICE candidates used by the ice library.
 *
 * @param source
 *       Object that raised the event
 * @param timestamp
 *       
 * @param tags
 *       
 * @param type
 *       Type of event that was raised
 * @param candidatePair
 *       The new pair of candidates
 *
 **/
  public NewCandidatePairSelectedEvent(@org.kurento.client.internal.server.Param("source") org.kurento.client.MediaObject source, @org.kurento.client.internal.server.Param("timestamp") String timestamp, @org.kurento.client.internal.server.Param("tags") java.util.List<org.kurento.client.Tag> tags, @org.kurento.client.internal.server.Param("type") String type, @org.kurento.client.internal.server.Param("candidatePair") org.kurento.client.IceCandidatePair candidatePair) {
    super(source, timestamp, tags, type);
    this.candidatePair = candidatePair;
  }

/**
 *
 * Getter for the candidatePair property
 * @return The new pair of candidates *
 **/
	public org.kurento.client.IceCandidatePair getCandidatePair() {
		return candidatePair;
	}

/**
 *
 * Setter for the candidatePair property
 *
 * @param candidatePair
 *       The new pair of candidates
 *
 **/
	public void setCandidatePair(org.kurento.client.IceCandidatePair candidatePair) {
		this.candidatePair = candidatePair;
	}

}
