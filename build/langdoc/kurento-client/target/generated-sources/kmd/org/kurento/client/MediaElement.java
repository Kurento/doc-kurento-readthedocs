/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * <p>This is the basic building block of the media server, that can be interconnected inside a pipeline. A {@link module:core/abstracts.MediaElement MediaElement} is a module that encapsulates a specific media capability, and that is able to exchange media with other {@link module:core/abstracts.MediaElement MediaElement}s through an internal element called pad.
 *       </p>
 *       <p>
 *       A pad can be defined as an input or output interface. Input pads are called sinks, and it's where the media elements receive media from other media elements. Output interfaces are called sources, and it's the pad used by the media element to feed media to other media elements. There can be only one sink pad per media element. On the other hand, the number of source pads is unconstrained. This means that a certain media element can receive media only from one element at a time, while it can send media to many others. Pads are created on demand, when the connect method is invoked. When two media elements are connected, one media pad is created for each type of media connected. For example, if you connect AUDIO and VIDEO between two media elements, each one will need to create two new pads: one for AUDIO and one for VIDEO.
 *       </p>
 *       <p>
 *       When media elements are connected, it can be case that the encoding used by the elements is not the same, and thus it needs to be transcoded. This is something that is handled transparently by the media elements internals. In practice, the user needs not be aware that the transcodification is taking place. However, this process has a toll in the form of a higher CPU load, so connecting media elements that need media encoded in different formats is something to consider as a high load operation.
 *       </p>
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaElement extends MediaObject {

/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     int getMinOuputBitrate();

/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void getMinOuputBitrate(Continuation<Integer> cont);

/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     TFuture<Integer> getMinOuputBitrate(Transaction tx);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate, Continuation<Void> cont);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use minOutputBitrate instead of this function. Minimum video bandwidth for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOuputBitrate(@org.kurento.client.internal.server.Param("minOuputBitrate") int minOuputBitrate, Transaction tx);
/**
 *
 * Get Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     int getMinOutputBitrate();

/**
 *
 * Get Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void getMinOutputBitrate(Continuation<Integer> cont);

/**
 *
 * Get Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     TFuture<Integer> getMinOutputBitrate(Transaction tx);

/**
 *
 * Set Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOutputBitrate(@org.kurento.client.internal.server.Param("minOutputBitrate") int minOutputBitrate);

/**
 *
 * Set Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOutputBitrate(@org.kurento.client.internal.server.Param("minOutputBitrate") int minOutputBitrate, Continuation<Void> cont);

/**
 *
 * Set Minimum video bitrate for transcoding.
 *   Unit: bps(bits per second).
 *   Default value: 0
 *
 **/
     void setMinOutputBitrate(@org.kurento.client.internal.server.Param("minOutputBitrate") int minOutputBitrate, Transaction tx);
/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     int getMaxOuputBitrate();

/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void getMaxOuputBitrate(Continuation<Integer> cont);

/**
 *
 * @deprecated
 * Get Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     TFuture<Integer> getMaxOuputBitrate(Transaction tx);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate, Continuation<Void> cont);

/**
 *
 * @deprecated
 * Set Deprecated due to a typo. Use maxOutputBitrate instead of this function. Maximum video bandwidth for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOuputBitrate(@org.kurento.client.internal.server.Param("maxOuputBitrate") int maxOuputBitrate, Transaction tx);
/**
 *
 * Get Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     int getMaxOutputBitrate();

/**
 *
 * Get Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void getMaxOutputBitrate(Continuation<Integer> cont);

/**
 *
 * Get Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     TFuture<Integer> getMaxOutputBitrate(Transaction tx);

/**
 *
 * Set Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOutputBitrate(@org.kurento.client.internal.server.Param("maxOutputBitrate") int maxOutputBitrate);

/**
 *
 * Set Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOutputBitrate(@org.kurento.client.internal.server.Param("maxOutputBitrate") int maxOutputBitrate, Continuation<Void> cont);

/**
 *
 * Set Maximum video bitrate for transcoding. 0 = unlimited.
 *   Unit: bps(bits per second).
 *   Default value: MAXINT
 *
 **/
     void setMaxOutputBitrate(@org.kurento.client.internal.server.Param("maxOutputBitrate") int maxOutputBitrate, Transaction tx);


/**
 *
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
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
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
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
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
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
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @param description
 *       A textual description of the media source. Currently not used, aimed mainly for {@link #MediaType.DATA} sources
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("description") String description);


/**
 *
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Sets the type of data for the audio stream. MediaElements that do not support configuration of audio capabilities will throw a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR exception.
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
 * Sets the type of data for the audio stream. MediaElements that do not support configuration of audio capabilities will throw a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR exception.
 *
 * @param caps
 *       The format for the stream of audio
 *
 **/
    void setAudioFormat(Transaction tx, @org.kurento.client.internal.server.Param("caps") org.kurento.client.AudioCaps caps);


/**
 *
 * Sets the type of data for the video stream. MediaElements that do not support configuration of video capabilities will throw a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR exception
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
 * Sets the type of data for the video stream. MediaElements that do not support configuration of video capabilities will throw a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR exception
 *
 * @param caps
 *       The format for the stream of video
 *
 **/
    void setVideoFormat(Transaction tx, @org.kurento.client.internal.server.Param("caps") org.kurento.client.VideoCaps caps);


/**
 *
 * This method returns a .dot file describing the topology of the media element. The element can be queried for certain type of data
 *           <ul>
 *             <li>SHOW_ALL: default value</li>
 *             <li>SHOW_CAPS_DETAILS</li>
 *             <li>SHOW_FULL_PARAMS</li>
 *             <li>SHOW_MEDIA_TYPE</li>
 *             <li>SHOW_NON_DEFAULT_PARAMS</li>
 *             <li>SHOW_STATES</li>
 *             <li>SHOW_VERBOSE</li>
 *           </ul>
 *           
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
 * This method returns a .dot file describing the topology of the media element. The element can be queried for certain type of data
 *           <ul>
 *             <li>SHOW_ALL: default value</li>
 *             <li>SHOW_CAPS_DETAILS</li>
 *             <li>SHOW_FULL_PARAMS</li>
 *             <li>SHOW_MEDIA_TYPE</li>
 *             <li>SHOW_NON_DEFAULT_PARAMS</li>
 *             <li>SHOW_STATES</li>
 *             <li>SHOW_VERBOSE</li>
 *           </ul>
 *           
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
 * Gets the statistics related to an endpoint. If no media type is specified, it returns statistics for all available types.
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
 * Gets the statistics related to an endpoint. If no media type is specified, it returns statistics for all available types.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
    TFuture<java.util.Map<String,org.kurento.client.Stats>> getStats(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * This method indicates whether the media element is receiving media of a certain type. The media sink pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sinkMediaDescription
 *       Description of the sink
 * @return TRUE if there is media, FALSE in other case *
 **/
  boolean isMediaFlowingIn(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);

/**
 *
 * Asynchronous version of isMediaFlowingIn:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#isMediaFlowingIn
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sinkMediaDescription
 *       Description of the sink
 *
 **/
    void isMediaFlowingIn(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription, Continuation<Boolean> cont);

/**
 *
 * This method indicates whether the media element is receiving media of a certain type. The media sink pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sinkMediaDescription
 *       Description of the sink
 * @return TRUE if there is media, FALSE in other case *
 **/
    TFuture<Boolean> isMediaFlowingIn(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sinkMediaDescription") String sinkMediaDescription);


/**
 *
 * This method indicates whether the media element is emitting media of a certain type. The media source pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sourceMediaDescription
 *       Description of the source
 * @return TRUE if there is media, FALSE in other case *
 **/
  boolean isMediaFlowingOut(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);

/**
 *
 * Asynchronous version of isMediaFlowingOut:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#isMediaFlowingOut
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sourceMediaDescription
 *       Description of the source
 *
 **/
    void isMediaFlowingOut(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription, Continuation<Boolean> cont);

/**
 *
 * This method indicates whether the media element is emitting media of a certain type. The media source pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @param sourceMediaDescription
 *       Description of the source
 * @return TRUE if there is media, FALSE in other case *
 **/
    TFuture<Boolean> isMediaFlowingOut(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, @org.kurento.client.internal.server.Param("sourceMediaDescription") String sourceMediaDescription);


/**
 *
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
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
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSourceConnections(Transaction tx);


/**
 *
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
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
 * Gets information about the sink pads of this media element. Since sink pads are the interface through which a media element gets it's media, whatever is connected to an element's sink pad is formally a source of media. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that are sending media to this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSourceConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
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
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx);


/**
 *
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
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
 * Gets information about the source pads of this media element. Since source pads connect to other media element's sinks, this is formally the sink of media from the element's perspective. Media can be filtered by type, or by the description given to the pad though which both elements are connected.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO}, {@link #MediaType.VIDEO} or {@link #MediaType.DATA}
 * @return A list of the connections information that are receiving media from this element. The list will be empty if no sources are found. *
 **/
    TFuture<java.util.List<org.kurento.client.ElementConnectionData>> getSinkConnections(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will receive media
 *
 **/
    void connect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);


/**
 *
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * <p>Connects two elements, with the media flowing from left to right: the elements that invokes the connect wil be the source of media, creating one sink pad for each type of media connected. The element given as parameter to the method will be the sink, and it will create one sink pad per media type connected.
 *           </p>
 *           <p>
 *           If otherwise not specified, all types of media are connected by default (AUDIO, VIDEO and DATA). It is recommended to connect the specific types of media if not all of them will be used. For this purpose, the connect method can be invoked more than once on the same two elements, but with different media types.
 *           </p>
 *           <p>
 *           The connection is unidirectional. If a bidirectional connection is desired, the position of the media elements must be inverted. For instance, webrtc1.connect(webrtc2) is connecting webrtc1 as source of webrtc2. In order to create a WebRTC one-2one conversation, the user would need to especify the connection on the other direction with webrtc2.connect(webrtc1).
 *           </p>
 *           <p>
 *           Even though one media element can have one sink pad per type of media, only one media element can be connected to another at a given time. If a media element is connected to another, the former will become the source of the sink media element, regardles whether there was another element connected or not.
 *           </p>
 *           
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
 *
 * @param sink
 *       the target {@link module:core/abstracts.MediaElement MediaElement} that will stop receiving media
 *
 **/
    void disconnect(Transaction tx, @org.kurento.client.internal.server.Param("sink") org.kurento.client.MediaElement sink);


/**
 *
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * Disconnectes two media elements. This will release the source pads of the source media element, and the sink pads of the sink media element.
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
 * This method returns a .dot file describing the topology of the media element. The element can be queried for certain type of data
 *           <ul>
 *             <li>SHOW_ALL: default value</li>
 *             <li>SHOW_CAPS_DETAILS</li>
 *             <li>SHOW_FULL_PARAMS</li>
 *             <li>SHOW_MEDIA_TYPE</li>
 *             <li>SHOW_NON_DEFAULT_PARAMS</li>
 *             <li>SHOW_STATES</li>
 *             <li>SHOW_VERBOSE</li>
 *           </ul>
 *           
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
 * This method returns a .dot file describing the topology of the media element. The element can be queried for certain type of data
 *           <ul>
 *             <li>SHOW_ALL: default value</li>
 *             <li>SHOW_CAPS_DETAILS</li>
 *             <li>SHOW_FULL_PARAMS</li>
 *             <li>SHOW_MEDIA_TYPE</li>
 *             <li>SHOW_NON_DEFAULT_PARAMS</li>
 *             <li>SHOW_STATES</li>
 *             <li>SHOW_VERBOSE</li>
 *           </ul>
 *           
 * @return The dot graph *
 **/
    TFuture<String> getGstreamerDot(Transaction tx);


/**
 *
 * Gets the statistics related to an endpoint. If no media type is specified, it returns statistics for all available types.
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
 * Gets the statistics related to an endpoint. If no media type is specified, it returns statistics for all available types.
 * @return Delivers a successful result in the form of a RTC stats report. A RTC stats report represents a map between strings, identifying the inspected objects (RTCStats.id), and their corresponding RTCStats objects. *
 **/
    TFuture<java.util.Map<String,org.kurento.client.Stats>> getStats(Transaction tx);


/**
 *
 * This method indicates whether the media element is receiving media of a certain type. The media sink pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return TRUE if there is media, FALSE in other case *
 **/
  boolean isMediaFlowingIn(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of isMediaFlowingIn:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#isMediaFlowingIn
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 *
 **/
    void isMediaFlowingIn(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<Boolean> cont);

/**
 *
 * This method indicates whether the media element is receiving media of a certain type. The media sink pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return TRUE if there is media, FALSE in other case *
 **/
    TFuture<Boolean> isMediaFlowingIn(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);


/**
 *
 * This method indicates whether the media element is emitting media of a certain type. The media source pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return TRUE if there is media, FALSE in other case *
 **/
  boolean isMediaFlowingOut(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

/**
 *
 * Asynchronous version of isMediaFlowingOut:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaElement#isMediaFlowingOut
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 *
 **/
    void isMediaFlowingOut(@org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType, Continuation<Boolean> cont);

/**
 *
 * This method indicates whether the media element is emitting media of a certain type. The media source pad can be identified individually, if needed. It is only supported for AUDIO and VIDEO types, raising a MEDIA_OBJECT_ILLEGAL_PARAM_ERROR otherwise. If the pad indicated does not exist, if will return false.
 *
 * @param mediaType
 *       One of {@link #MediaType.AUDIO} or {@link #MediaType.VIDEO}
 * @return TRUE if there is media, FALSE in other case *
 **/
    TFuture<Boolean> isMediaFlowingOut(Transaction tx, @org.kurento.client.internal.server.Param("mediaType") org.kurento.client.MediaType mediaType);

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
    /**
     * Add a {@link EventListener} for event {@link MediaFlowOutStateChangeEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on MediaFlowOutStateChangeEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowOutStateChangeEvent.class)
    ListenerSubscription addMediaFlowOutStateChangeListener(EventListener<MediaFlowOutStateChangeEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link MediaFlowOutStateChangeEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on MediaFlowOutStateChangeEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowOutStateChangeEvent.class)
    void addMediaFlowOutStateChangeListener(EventListener<MediaFlowOutStateChangeEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link MediaFlowOutStateChangeEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowOutStateChangeEvent.class)
    void removeMediaFlowOutStateChangeListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link MediaFlowOutStateChangeEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowOutStateChangeEvent.class)
    void removeMediaFlowOutStateChangeListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link MediaFlowInStateChangeEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on MediaFlowInStateChangeEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowInStateChangeEvent.class)
    ListenerSubscription addMediaFlowInStateChangeListener(EventListener<MediaFlowInStateChangeEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link MediaFlowInStateChangeEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on MediaFlowInStateChangeEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowInStateChangeEvent.class)
    void addMediaFlowInStateChangeListener(EventListener<MediaFlowInStateChangeEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link MediaFlowInStateChangeEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowInStateChangeEvent.class)
    void removeMediaFlowInStateChangeListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link MediaFlowInStateChangeEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaFlowInStateChangeEvent.class)
    void removeMediaFlowInStateChangeListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}