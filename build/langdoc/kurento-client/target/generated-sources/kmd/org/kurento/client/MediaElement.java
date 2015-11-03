/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Basic building blocks of the media server, that can be interconnected through the API. A {@link module:core/abstracts.MediaElement MediaElement} is a module that encapsulates a specific media capability. They can be connected to create media pipelines where those capabilities are applied, in sequence, to the stream going through the pipeline.
 *    {@link module:core/abstracts.MediaElement MediaElement} objects are classified by its supported media type (audio, video, etc.)
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaElement extends MediaObject {

     int getMinOuputBitrate();

     void getMinOuputBitrate(Continuation<Integer> cont);

     TFuture<Integer> getMinOuputBitrate(Transaction tx);

     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate);

     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate, Continuation<Void> cont);

     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate, Transaction tx);
     int getMaxOuputBitrate();

     void getMaxOuputBitrate(Continuation<Integer> cont);

     TFuture<Integer> getMaxOuputBitrate(Transaction tx);

     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate);

     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate, Continuation<Void> cont);

     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate, Transaction tx);


/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSourceConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description);

/**
 *
 * Asynchronous version of getSourceConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSourceConnections
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void getSourceConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description, Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSourceConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description);


/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSinkConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description);

/**
 *
 * Asynchronous version of getSinkConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSinkConnections
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void getSinkConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description, Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description);


/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#connect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription, Continuation<Void> cont);

/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);


/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
  void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);

/**
 *
 * Asynchronous version of disconnect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#disconnect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription, Continuation<Void> cont);

/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @param sinkMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);


/**
 *
 * Sets the type of data for the audio stream. MediaElements that do not support configuration of audio capabilities will raise an exception
 *
 * @param caps
 *       The format for the stream of audio
 *
 **/
  void setAudioFormat(@org.kurento.client.internal.server.Param("caps") org.kurento.client.AudioCaps caps);

/**
 *
 * Asynchronous version of setAudioFormat:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#setAudioFormat
 *
 * @param caps
 *       The format for the stream of audio
 *
 **/
    void setAudioFormat(@org.kurento.client.internal.server.Param("caps") org.kurento.client.AudioCaps caps, Continuation<Void> cont);

/**
 *
 * Sets the type of data for the audio stream. MediaElements that do not support configuration of audio capabilities will raise an exception
 *
 * @param caps
 *       The format for the stream of audio
 *
 **/
    void setAudioFormat(Transaction tx, @org.kurento.client.internal.server.Param("caps") org.kurento.client.AudioCaps caps);


/**
 *
 * Sets the type of data for the video stream. MediaElements that do not support configuration of video capabilities will raise an exception
 *
 * @param caps
 *       The format for the stream of video
 *
 **/
  void setVideoFormat(@org.kurento.client.internal.server.Param("caps") org.kurento.client.VideoCaps caps);

/**
 *
 * Asynchronous version of setVideoFormat:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#setVideoFormat
 *
 * @param caps
 *       The format for the stream of video
 *
 **/
    void setVideoFormat(@org.kurento.client.internal.server.Param("caps") org.kurento.client.VideoCaps caps, Continuation<Void> cont);

/**
 *
 * Sets the type of data for the video stream. MediaElements that do not support configuration of video capabilities will raise an exception
 *
 * @param caps
 *       The format for the stream of video
 *
 **/
    void setVideoFormat(Transaction tx, @org.kurento.client.internal.server.Param("caps") org.kurento.client.VideoCaps caps);


/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside
 *
 * @param details
 *       Details of graph
 * @return The dot graph *
 **/
  String getGstreamerDot(@org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details);

/**
 *
 * Asynchronous version of getGstreamerDot:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getGstreamerDot
 *
 * @param details
 *       Details of graph
 *
 **/
    void getGstreamerDot(@org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details, Continuation<String> cont);

/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside
 *
 * @param details
 *       Details of graph
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx, @org.kurento.client.internal.server.Param("details") org.kurento.client.GstreamerDotDetails details);


/**
 *
 * @deprecated
 * Allows change the target bitrate for the media output, if the media is encoded using VP8 or H264. This method only works if it is called before the media starts to flow.
 *
 * @param bitrate
 *       Configure the enconding media bitrate in bps
 *
 **/
  void setOutputBitrate(@org.kurento.client.internal.server.Param("bitrate") int bitrate);

/**
 *
 * Asynchronous version of setOutputBitrate:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#setOutputBitrate
 *
 * @param bitrate
 *       Configure the enconding media bitrate in bps
 *
 **/
    void setOutputBitrate(@org.kurento.client.internal.server.Param("bitrate") int bitrate, Continuation<Void> cont);

/**
 *
 * @deprecated
 * Allows change the target bitrate for the media output, if the media is encoded using VP8 or H264. This method only works if it is called before the media starts to flow.
 *
 * @param bitrate
 *       Configure the enconding media bitrate in bps
 *
 **/
    void setOutputBitrate(Transaction tx, @org.kurento.client.internal.server.Param("bitrate") int bitrate);


/**
 *
 * Provides statistics collected for this endpoint
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
  java.util.Map<String,org.kurento.client.Stats> getStats(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of getStats:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getStats
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 *
 **/
    void getStats(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<java.util.Map<String,org.kurento.client.Stats>> cont);

/**
 *
 * Provides statistics collected for this endpoint
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
    TFuture<java.util.Map<String,org.kurento.client.Stats>> getStats(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSourceConnections();

/**
 *
 * Asynchronous version of getSourceConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSourceConnections
 *
 **/
    void getSourceConnections(Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSourceConnections(Transaction tx);


/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSourceConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of getSourceConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSourceConnections
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 *
 **/
    void getSourceConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Get the connections information of the elements that are sending media to this element {@link module:core/abstracts.MediaElement MediaElement}
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSourceConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSinkConnections();

/**
 *
 * Asynchronous version of getSinkConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSinkConnections
 *
 **/
    void getSinkConnections(Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx);


/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
  java.util.List<org.kurento.client.ElementConnectionData> getSinkConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of getSinkConnections:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getSinkConnections
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 *
 **/
    void getSinkConnections(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<java.util.List<org.kurento.client.ElementConnectionData>> cont);

/**
 *
 * Returns a list of the connections information of the elements that ere receiving media from this element.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that arereceiving media from this element. The list will be empty if no sinks are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#connect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, Continuation<Void> cont);

/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);


/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#connect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<Void> cont);

/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
  void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);

/**
 *
 * Asynchronous version of connect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#connect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void connect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, Continuation<Void> cont);

/**
 *
 * Connects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} will start emmit media to sink element. Connection could take place in the future, when both media element show capabilities for connecting with the given restrictions
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);


/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 *
 **/
  void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);

/**
 *
 * Asynchronous version of disconnect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#disconnect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 *
 **/
    void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, Continuation<Void> cont);

/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);


/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
  void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of disconnect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#disconnect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
    void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<Void> cont);

/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
  void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);

/**
 *
 * Asynchronous version of disconnect:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#disconnect
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void disconnect(@org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, Continuation<Void> cont);

/**
 *
 * Disconnects two elements, with the given restrictions, current {@link module:core/abstracts.MediaElement MediaElement} stops sending media to sink element. If the previously requested connection didn't took place it is also removed
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 * @param mediaType
 *       the {@link MediaType} of the pads that will be connected
 * @param sourceMediaDescription
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);


/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside
 * @return The dot graph *
 **/
  String getGstreamerDot();

/**
 *
 * Asynchronous version of getGstreamerDot:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getGstreamerDot
 *
 **/
    void getGstreamerDot(Continuation<String> cont);

/**
 *
 * Returns a string in dot (graphviz) format that represents the gstreamer elements inside
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx);


/**
 *
 * Provides statistics collected for this endpoint
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
  java.util.Map<String,org.kurento.client.Stats> getStats();

/**
 *
 * Asynchronous version of getStats:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#getStats
 *
 **/
    void getStats(Continuation<java.util.Map<String,org.kurento.client.Stats>> cont);

/**
 *
 * Provides statistics collected for this endpoint
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
    TFuture<java.util.Map<String,org.kurento.client.Stats>> getStats(Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link ElementConnectedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ElementConnectedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementConnectedEvent.class)
    ListenerSubscription addElementConnectedListener(EventListener<ElementConnectedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ElementConnectedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ElementConnectedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementConnectedEvent.class)
    void addElementConnectedListener(EventListener<ElementConnectedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ElementConnectedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementConnectedEvent.class)
    void removeElementConnectedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ElementConnectedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementConnectedEvent.class)
    void removeElementConnectedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link ElementDisconnectedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ElementDisconnectedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementDisconnectedEvent.class)
    ListenerSubscription addElementDisconnectedListener(EventListener<ElementDisconnectedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ElementDisconnectedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ElementDisconnectedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementDisconnectedEvent.class)
    void addElementDisconnectedListener(EventListener<ElementDisconnectedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ElementDisconnectedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementDisconnectedEvent.class)
    void removeElementDisconnectedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ElementDisconnectedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ElementDisconnectedEvent.class)
    void removeElementDisconnectedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}