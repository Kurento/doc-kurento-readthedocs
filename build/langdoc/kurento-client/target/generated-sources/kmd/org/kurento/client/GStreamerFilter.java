/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This is a generic filter interface, that creates GStreamer filters in the media server.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface GStreamerFilter extends Filter {

     String getCommand();

     void getCommand(Continuation<String> cont);

     TFuture<String> getCommand(Transaction tx);


    



    public class Builder extends AbstractBuilder<GStreamerFilter> {

/**
 *
 * Creates a Builder for GStreamerFilter
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline, String command){

      super(GStreamerFilter.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
      props.add("command",command);
    }

/**
 *
 * Sets a value for filterType in Builder for GStreamerFilter.
 *
 * @param filterType
 *       Filter type that define if the filter is set as audio, video or autodetect
 *
 **/
    public Builder withFilterType(org.kurento.client.FilterType filterType){
      props.add("filterType",filterType);
      return this;
    }
    }


}