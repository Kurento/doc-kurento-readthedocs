/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This {@link module:core/abstracts.MediaElement MediaElement} specifies a connection with a {@link module:core/abstracts.Hub Hub}
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface HubPort extends MediaElement {


    



    public class Builder extends AbstractBuilder<HubPort> {

/**
 *
 * Creates a Builder for HubPort
 *
 **/
    public Builder(org.kurento.client.Hub hub){

      super(HubPort.class,hub);

      props.add("hub",hub);
    }

    }


}