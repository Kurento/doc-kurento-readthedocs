/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A {@link module:core/abstracts.Hub Hub} that mixes the {@link #MediaType.AUDIO} stream of its connected sources and constructs a grid with the {@link #MediaType.VIDEO} streams of its connected sources into its sink
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface Composite extends Hub {


    



    public class Builder extends AbstractBuilder<Composite> {

/**
 *
 * Creates a Builder for Composite
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(Composite.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}