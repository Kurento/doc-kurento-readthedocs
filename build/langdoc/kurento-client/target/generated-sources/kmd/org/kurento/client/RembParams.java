/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Defines values for parameters of congestion control
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class RembParams  {

/**
 *
 * Size of the RTP packets history to smooth fraction-lost.
 * Units: num of packets
 *
 **/
    private Integer packetsRecvIntervalTop;
/**
 *
 * Factor used to increase exponentially the next REMB when it is below the threshold.
 * REMB[i+1] = REMB[i] * (1 + exponentialFactor)
 *
 **/
    private Float exponentialFactor;
/**
 *
 * Set the min of the factor used to increase linearly the next REMB when it is over the threshold.
 * Units: bps (bits per second).
 * REMB[i+1] = REMB[i] + MIN (linealFactorMin, linealFactor)
 *
 **/
    private Integer linealFactorMin;
/**
 *
 * Determine the value of the next linearFactor based on the threshold and the current REMB. Taking into account that the frequency of updating is 500ms, the default value makes that the last REMB is reached in 60secs.
 * linealFactor = (REMB - TH) / linealFactorGrade
 *
 **/
    private Float linealFactorGrade;
/**
 *
 * Determine how much is decreased the current REMB when too losses are detected.
 * REMB[i+1] = REMB[i] * decrementFactor
 *
 **/
    private Float decrementFactor;
/**
 *
 * Determine the next threshold (TH) when too losses are detected.
 * TH[i+1] = REMB[i] * thresholdFactor
 *
 **/
    private Float thresholdFactor;
/**
 *
 * Max fraction-lost to no determine too losses. This value is the denominator of the fraction N/256, so the default value is about 4% of losses (12/256)
 *
 **/
    private Integer upLosses;
/**
 *
 * REMB propagated upstream when video sending is started in a new connected endpoint.
 *   Unit: bps(bits per second)
 *
 **/
    private Integer rembOnConnect;

/**
 *
 * Create a RembParams
 *
 **/
    public RembParams() {

	super();

    }

/**
 *
 * get Size of the RTP packets history to smooth fraction-lost.
 * Units: num of packets
 *
 **/
    public Integer getPacketsRecvIntervalTop(){
    	return packetsRecvIntervalTop;
    }

/**
 *
 * set Size of the RTP packets history to smooth fraction-lost.
 * Units: num of packets
 *
 **/
    public void setPacketsRecvIntervalTop(Integer packetsRecvIntervalTop){
    	this.packetsRecvIntervalTop = packetsRecvIntervalTop;
    }

/**
 *
 * get Factor used to increase exponentially the next REMB when it is below the threshold.
 * REMB[i+1] = REMB[i] * (1 + exponentialFactor)
 *
 **/
    public Float getExponentialFactor(){
    	return exponentialFactor;
    }

/**
 *
 * set Factor used to increase exponentially the next REMB when it is below the threshold.
 * REMB[i+1] = REMB[i] * (1 + exponentialFactor)
 *
 **/
    public void setExponentialFactor(Float exponentialFactor){
    	this.exponentialFactor = exponentialFactor;
    }

/**
 *
 * get Set the min of the factor used to increase linearly the next REMB when it is over the threshold.
 * Units: bps (bits per second).
 * REMB[i+1] = REMB[i] + MIN (linealFactorMin, linealFactor)
 *
 **/
    public Integer getLinealFactorMin(){
    	return linealFactorMin;
    }

/**
 *
 * set Set the min of the factor used to increase linearly the next REMB when it is over the threshold.
 * Units: bps (bits per second).
 * REMB[i+1] = REMB[i] + MIN (linealFactorMin, linealFactor)
 *
 **/
    public void setLinealFactorMin(Integer linealFactorMin){
    	this.linealFactorMin = linealFactorMin;
    }

/**
 *
 * get Determine the value of the next linearFactor based on the threshold and the current REMB. Taking into account that the frequency of updating is 500ms, the default value makes that the last REMB is reached in 60secs.
 * linealFactor = (REMB - TH) / linealFactorGrade
 *
 **/
    public Float getLinealFactorGrade(){
    	return linealFactorGrade;
    }

/**
 *
 * set Determine the value of the next linearFactor based on the threshold and the current REMB. Taking into account that the frequency of updating is 500ms, the default value makes that the last REMB is reached in 60secs.
 * linealFactor = (REMB - TH) / linealFactorGrade
 *
 **/
    public void setLinealFactorGrade(Float linealFactorGrade){
    	this.linealFactorGrade = linealFactorGrade;
    }

/**
 *
 * get Determine how much is decreased the current REMB when too losses are detected.
 * REMB[i+1] = REMB[i] * decrementFactor
 *
 **/
    public Float getDecrementFactor(){
    	return decrementFactor;
    }

/**
 *
 * set Determine how much is decreased the current REMB when too losses are detected.
 * REMB[i+1] = REMB[i] * decrementFactor
 *
 **/
    public void setDecrementFactor(Float decrementFactor){
    	this.decrementFactor = decrementFactor;
    }

/**
 *
 * get Determine the next threshold (TH) when too losses are detected.
 * TH[i+1] = REMB[i] * thresholdFactor
 *
 **/
    public Float getThresholdFactor(){
    	return thresholdFactor;
    }

/**
 *
 * set Determine the next threshold (TH) when too losses are detected.
 * TH[i+1] = REMB[i] * thresholdFactor
 *
 **/
    public void setThresholdFactor(Float thresholdFactor){
    	this.thresholdFactor = thresholdFactor;
    }

/**
 *
 * get Max fraction-lost to no determine too losses. This value is the denominator of the fraction N/256, so the default value is about 4% of losses (12/256)
 *
 **/
    public Integer getUpLosses(){
    	return upLosses;
    }

/**
 *
 * set Max fraction-lost to no determine too losses. This value is the denominator of the fraction N/256, so the default value is about 4% of losses (12/256)
 *
 **/
    public void setUpLosses(Integer upLosses){
    	this.upLosses = upLosses;
    }

/**
 *
 * get REMB propagated upstream when video sending is started in a new connected endpoint.
 *   Unit: bps(bits per second)
 *
 **/
    public Integer getRembOnConnect(){
    	return rembOnConnect;
    }

/**
 *
 * set REMB propagated upstream when video sending is started in a new connected endpoint.
 *   Unit: bps(bits per second)
 *
 **/
    public void setRembOnConnect(Integer rembOnConnect){
    	this.rembOnConnect = rembOnConnect;
    }

}

