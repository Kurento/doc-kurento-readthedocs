/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * An RTCStats dictionary represents the stats gathered.
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RTCStats extends Stats {


/**
 *
 * Create a RTCStats
 *
 **/
    public RTCStats(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("type") org.kurento.client.StatsType type, @org.kurento.client.internal.server.Param("timestamp") double timestamp) {

	super(
id, 
type, 
timestamp);

    }

}

