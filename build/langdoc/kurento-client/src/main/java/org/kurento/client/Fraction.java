/**
 * This file is generated with Kurento ktool-rom-processor.
 * Please don't edit. Changes should go to kms-interface-rom and
 * ktool-rom-processor templates.
 */
package org.kurento.client;

/**
 *
 * Type that represents a fraction of an integer numerator over an integer denominator
 *
 **/
@org.kurento.client.internal.ModuleName ("kurento")
public class Fraction  {

/**
 *
 * the numerator of the fraction
 *
 **/
    private int numerator;
/**
 *
 * the denominator of the fraction
 *
 **/
    private int denominator;

/**
 *
 * Create a Fraction
 *
 **/
    public Fraction(@org.kurento.client.internal.server.Param("numerator") int numerator, @org.kurento.client.internal.server.Param("denominator") int denominator) {

	super();

        this.numerator = numerator;
        this.denominator = denominator;
    }

/**
 *
 * get the numerator of the fraction
 *
 **/
    public int getNumerator(){
    	return numerator;
    }

/**
 *
 * set the numerator of the fraction
 *
 **/
    public void setNumerator(int numerator){
    	this.numerator = numerator;
    }

/**
 *
 * get the denominator of the fraction
 *
 **/
    public int getDenominator(){
    	return denominator;
    }

/**
 *
 * set the denominator of the fraction
 *
 **/
    public void setDenominator(int denominator){
    	this.denominator = denominator;
    }

}

