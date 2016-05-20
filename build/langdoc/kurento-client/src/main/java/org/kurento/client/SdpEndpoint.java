/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This interface is implemented by Endpoints that require an SDP negotiation for the setup of a networked media session with remote peers. The API provides the following functionality:
 *       <ul>
 *         <li>Generate SDP offers.</li>
 *         <li>Process SDP offers.</li>
 *         <li>Configure SDP related params.</li>
 *       </ul>
 *       
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface SdpEndpoint extends SessionEndpoint {

/**
 *
 * Get  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     int getMaxVideoRecvBandwidth();

/**
 *
 * Get  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void getMaxVideoRecvBandwidth(Continuation<Integer> cont);

/**
 *
 * Get  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     TFuture<Integer> getMaxVideoRecvBandwidth(Transaction tx);

/**
 *
 * Set  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxVideoRecvBandwidth(@org.kurento.client.internal.server.Param("maxVideoRecvBandwidth") int maxVideoRecvBandwidth);

/**
 *
 * Set  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxVideoRecvBandwidth(@org.kurento.client.internal.server.Param("maxVideoRecvBandwidth") int maxVideoRecvBandwidth, Continuation<Void> cont);

/**
 *
 * Set  Maximum bandwidth for video reception, in kbps. The default value is 500. A value of 0 sets this as unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxVideoRecvBandwidth(@org.kurento.client.internal.server.Param("maxVideoRecvBandwidth") int maxVideoRecvBandwidth, Transaction tx);
/**
 *
 * Get  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     int getMaxAudioRecvBandwidth();

/**
 *
 * Get  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void getMaxAudioRecvBandwidth(Continuation<Integer> cont);

/**
 *
 * Get  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     TFuture<Integer> getMaxAudioRecvBandwidth(Transaction tx);

/**
 *
 * Set  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxAudioRecvBandwidth(@org.kurento.client.internal.server.Param("maxAudioRecvBandwidth") int maxAudioRecvBandwidth);

/**
 *
 * Set  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxAudioRecvBandwidth(@org.kurento.client.internal.server.Param("maxAudioRecvBandwidth") int maxAudioRecvBandwidth, Continuation<Void> cont);

/**
 *
 * Set  Maximum bandwidth for audio reception, in kbps. The default value is 500. A value of 0 sets this as leaves this unconstrained. <hr/><b>Note</b> This has to be set before the SDP is generated.
 *
 **/
     void setMaxAudioRecvBandwidth(@org.kurento.client.internal.server.Param("maxAudioRecvBandwidth") int maxAudioRecvBandwidth, Transaction tx);


/**
 *
 *  Generates an SDP offer with  media capabilities of the Endpoint.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_GENERATE_OFFER_ERROR if the generated offer is empty. This is most likely due to an internal error.
 *             </li>
 *           </ul>
 * @return The SDP offer. *
 **/
  String generateOffer();

/**
 *
 * Asynchronous version of generateOffer:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see SdpEndpoint#generateOffer
 *
 **/
    void generateOffer(Continuation<String> cont);

/**
 *
 *  Generates an SDP offer with  media capabilities of the Endpoint.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_GENERATE_OFFER_ERROR if the generated offer is empty. This is most likely due to an internal error.
 *             </li>
 *           </ul>
 * @return The SDP offer. *
 **/
    TFuture<String> generateOffer(Transaction tx);


/**
 *
 *  Processes SDP offer of the remote peer, and generates an SDP answer based on the endpoint's capabilities. If no matching capabilities are found, the SDP will contain no codecs.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_PARSE_ERROR If the offer is empty or has errors.
 *             </li>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_PROCESS_OFFER_ERROR if the generated offer is empty. This is most likely due to an internal error.
 *             </li>
 *           </ul>
 *
 * @param offer
 *       SessionSpec offer from the remote User Agent
 * @return The chosen configuration from the ones stated in the SDP offer *
 **/
  String processOffer(@org.kurento.client.internal.server.Param("offer") String offer);

/**
 *
 * Asynchronous version of processOffer:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see SdpEndpoint#processOffer
 *
 * @param offer
 *       SessionSpec offer from the remote User Agent
 *
 **/
    void processOffer(@org.kurento.client.internal.server.Param("offer") String offer, Continuation<String> cont);

/**
 *
 *  Processes SDP offer of the remote peer, and generates an SDP answer based on the endpoint's capabilities. If no matching capabilities are found, the SDP will contain no codecs.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_PARSE_ERROR If the offer is empty or has errors.
 *             </li>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_PROCESS_OFFER_ERROR if the generated offer is empty. This is most likely due to an internal error.
 *             </li>
 *           </ul>
 *
 * @param offer
 *       SessionSpec offer from the remote User Agent
 * @return The chosen configuration from the ones stated in the SDP offer *
 **/
    TFuture<String> processOffer(Transaction tx, @org.kurento.client.internal.server.Param("offer") String offer);


/**
 *
 *  Generates an SDP offer with  media capabilities of the Endpoint.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_PARSE_ERROR If the offer is empty or has errors.
 *             </li>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_PROCESS_ANSWER_ERROR if the result of processing the answer is an empty string. This is most likely due to an internal error.
 *             </li>
 *             <li>
 *               SDP_END_POINT_NOT_OFFER_GENERATED If the method is invoked before the generateOffer method.
 *             </li>
 *           </ul>
 *
 * @param answer
 *       SessionSpec answer from the remote User Agent
 * @return Updated SDP offer, based on the answer received. *
 **/
  String processAnswer(@org.kurento.client.internal.server.Param("answer") String answer);

/**
 *
 * Asynchronous version of processAnswer:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see SdpEndpoint#processAnswer
 *
 * @param answer
 *       SessionSpec answer from the remote User Agent
 *
 **/
    void processAnswer(@org.kurento.client.internal.server.Param("answer") String answer, Continuation<String> cont);

/**
 *
 *  Generates an SDP offer with  media capabilities of the Endpoint.
 *           Exceptions
 *           <ul>
 *             <li>
 *               SDP_PARSE_ERROR If the offer is empty or has errors.
 *             </li>
 *             <li>
 *               SDP_END_POINT_ALREADY_NEGOTIATED If the endpoint is already negotiated.
 *             </li>
 *             <li>
 *               SDP_END_POINT_PROCESS_ANSWER_ERROR if the result of processing the answer is an empty string. This is most likely due to an internal error.
 *             </li>
 *             <li>
 *               SDP_END_POINT_NOT_OFFER_GENERATED If the method is invoked before the generateOffer method.
 *             </li>
 *           </ul>
 *
 * @param answer
 *       SessionSpec answer from the remote User Agent
 * @return Updated SDP offer, based on the answer received. *
 **/
    TFuture<String> processAnswer(Transaction tx, @org.kurento.client.internal.server.Param("answer") String answer);


/**
 *
 * This method returns the local SDP. The output depends on the negotiation stage:
 *           <ul>
 *             <li>
 *               No offer has been generated: returns null.
 *             </li>
 *             <li>
 *               Offer has been generated: return the SDP offer.
 *             </li>
 *             <li>
 *               Offer has been generated and answer processed: retruns the agreed SDP.
 *             </li>
 *           </ul>
 * @return The last agreed SessionSpec *
 **/
  String getLocalSessionDescriptor();

/**
 *
 * Asynchronous version of getLocalSessionDescriptor:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see SdpEndpoint#getLocalSessionDescriptor
 *
 **/
    void getLocalSessionDescriptor(Continuation<String> cont);

/**
 *
 * This method returns the local SDP. The output depends on the negotiation stage:
 *           <ul>
 *             <li>
 *               No offer has been generated: returns null.
 *             </li>
 *             <li>
 *               Offer has been generated: return the SDP offer.
 *             </li>
 *             <li>
 *               Offer has been generated and answer processed: retruns the agreed SDP.
 *             </li>
 *           </ul>
 * @return The last agreed SessionSpec *
 **/
    TFuture<String> getLocalSessionDescriptor(Transaction tx);


/**
 *
 * This method returns the remote SDP. If the negotiation process is not complete, it will return NULL.
 * @return The last agreed User Agent session description *
 **/
  String getRemoteSessionDescriptor();

/**
 *
 * Asynchronous version of getRemoteSessionDescriptor:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see SdpEndpoint#getRemoteSessionDescriptor
 *
 **/
    void getRemoteSessionDescriptor(Continuation<String> cont);

/**
 *
 * This method returns the remote SDP. If the negotiation process is not complete, it will return NULL.
 * @return The last agreed User Agent session description *
 **/
    TFuture<String> getRemoteSessionDescriptor(Transaction tx);

    




}