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

/**
 *
 * Get GStreamer command.
 *
 **/
     String getCommand();

/**
 *
 * Get GStreamer command.
 *
 **/
     void getCommand(Continuation<String> cont);

/**
 *
 * Get GStreamer command.
 *
 **/
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

	public Builder withProperties(Properties properties) {
    	return (Builder)super.withProperties(properties);
  	}

	public Builder with(String name, Object value) {
		return (Builder)super.with(name, value);
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