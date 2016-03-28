/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This {@link module:core/abstracts.MediaElement MediaElement} that just passes media through
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface PassThrough extends MediaElement {


    



    public class Builder extends AbstractBuilder<PassThrough> {

/**
 *
 * Creates a Builder for PassThrough
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(PassThrough.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}