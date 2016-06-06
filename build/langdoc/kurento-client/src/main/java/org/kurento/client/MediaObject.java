/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * <p>Base interface used to manage capabilities common to all Kurento elements. This includes both: {@link module:core/abstracts.MediaElement MediaElement} and {@link module:core.MediaPipeline MediaPipeline}</p>
 *       <h4>Properties</h4>
 *       <ul>
 *         <li><b>id</b>: unique identifier assigned to this <code>MediaObject</code> at instantiation time. {@link module:core.MediaPipeline MediaPipeline} IDs are generated with a GUID followed by suffix <code>_kurento.MediaPipeline</code>. {@link module:core/abstracts.MediaElement MediaElement} IDs are also a GUID with suffix <code>_kurento.elemenType</code> and prefixed by parent's ID.
 *           <blockquote>
 *           <dl>
 *             <dt><i>MediaPipeline ID example</i></dt>
 *             <dd><code>907cac3a-809a-4bbe-a93e-ae7e944c5cae_kurento.MediaPipeline</code></dd>
 *             <dt><i>MediaElement ID example</i></dt> <dd><code>907cac3a-809a-4bbe-a93e-ae7e944c5cae_kurento.MediaPipeline/403da25a-805b-4cf1-8c55-f190588e6c9b_kurento.WebRtcEndpoint</code></dd>
 *           </dl>
 *           </blockquote>
 *         </li>
 *         <li><b>name</b>: free text intended to provide a friendly name for this <code>MediaObject</code>. Its default value is the same as the ID.</li>
 *         <li><b>tags</b>: key-value pairs intended for applications to associate metadata to this <code>MediaObject</code> instance.</li>
 *       </ul>
 *       <p>
 *       <h4>Events</h4>
 *       <ul>
 *         <li>`ErrorEvent`: reports asynchronous error events. It is recommended to always subscribe a listener to this event, as regular error from the pipeline will be notified through it, instead of through an exception when invoking a method.</li>
 *       </ul>
 *       
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaObject extends KurentoObject {

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this <code>MediaObject</code> belongs. It returns itself when invoked for a pipeline object.
 *
 **/
     org.kurento.client.MediaPipeline getMediaPipeline();

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this <code>MediaObject</code> belongs. It returns itself when invoked for a pipeline object.
 *
 **/
     void getMediaPipeline(Continuation<org.kurento.client.MediaPipeline> cont);

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this <code>MediaObject</code> belongs. It returns itself when invoked for a pipeline object.
 *
 **/
     TFuture<org.kurento.client.MediaPipeline> getMediaPipeline(Transaction tx);

/**
 *
 * Get parent of this <code>MediaObject</code>. The parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null.
 *
 **/
     org.kurento.client.MediaObject getParent();

/**
 *
 * Get parent of this <code>MediaObject</code>. The parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null.
 *
 **/
     void getParent(Continuation<org.kurento.client.MediaObject> cont);

/**
 *
 * Get parent of this <code>MediaObject</code>. The parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null.
 *
 **/
     TFuture<org.kurento.client.MediaObject> getParent(Transaction tx);

/**
 *
 * Get unique identifier of this <code>MediaObject</code>. It's a synthetic identifier composed by a GUID and <code>MediaObject</code> type. The ID is prefixed with the parent ID when the object has parent: <i>ID_parent/ID_media-object</i>.
 *
 **/
     String getId();

/**
 *
 * Get unique identifier of this <code>MediaObject</code>. It's a synthetic identifier composed by a GUID and <code>MediaObject</code> type. The ID is prefixed with the parent ID when the object has parent: <i>ID_parent/ID_media-object</i>.
 *
 **/
     void getId(Continuation<String> cont);

/**
 *
 * Get unique identifier of this <code>MediaObject</code>. It's a synthetic identifier composed by a GUID and <code>MediaObject</code> type. The ID is prefixed with the parent ID when the object has parent: <i>ID_parent/ID_media-object</i>.
 *
 **/
     TFuture<String> getId(Transaction tx);

/**
 *
 * @deprecated
 * Get  (Use children instead) children of this <code>MediaObject</code>.
 *
 **/
     java.util.List<org.kurento.client.MediaObject> getChilds();

/**
 *
 * @deprecated
 * Get  (Use children instead) children of this <code>MediaObject</code>.
 *
 **/
     void getChilds(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

/**
 *
 * @deprecated
 * Get  (Use children instead) children of this <code>MediaObject</code>.
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaObject>> getChilds(Transaction tx);

/**
 *
 * Get children of this <code>MediaObject</code>.
 *
 **/
     java.util.List<org.kurento.client.MediaObject> getChildren();

/**
 *
 * Get children of this <code>MediaObject</code>.
 *
 **/
     void getChildren(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

/**
 *
 * Get children of this <code>MediaObject</code>.
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaObject>> getChildren(Transaction tx);

/**
 *
 * Get this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     String getName();

/**
 *
 * Get this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     void getName(Continuation<String> cont);

/**
 *
 * Get this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     TFuture<String> getName(Transaction tx);

/**
 *
 * Set this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name);

/**
 *
 * Set this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Continuation<Void> cont);

/**
 *
 * Set this <code>MediaObject</code>'s name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's ID.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Transaction tx);
/**
 *
 * Get flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     boolean getSendTagsInEvents();

/**
 *
 * Get flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     void getSendTagsInEvents(Continuation<Boolean> cont);

/**
 *
 * Get flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     TFuture<Boolean> getSendTagsInEvents(Transaction tx);

/**
 *
 * Set flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents);

/**
 *
 * Set flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Continuation<Void> cont);

/**
 *
 * Set flag activating or deactivating sending the element's tags in fired events.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Transaction tx);
/**
 *
 * Get <code>MediaObject</code> creation time in seconds since Epoch.
 *
 **/
     int getCreationTime();

/**
 *
 * Get <code>MediaObject</code> creation time in seconds since Epoch.
 *
 **/
     void getCreationTime(Continuation<Integer> cont);

/**
 *
 * Get <code>MediaObject</code> creation time in seconds since Epoch.
 *
 **/
     TFuture<Integer> getCreationTime(Transaction tx);



/**
 *
 * Adds a new tag to this <code>MediaObject</code>. If the tag is already present, it changes the value.
 *
 * @param key
 *       Tag name.
 * @param value
 *       Value associated to this tag.
 *
 **/
  void addTag(@org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value);

/**
 *
 * Asynchronous version of addTag:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaObject#addTag
 *
 * @param key
 *       Tag name.
 * @param value
 *       Value associated to this tag.
 *
 **/
    void addTag(@org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value, Continuation<Void> cont);

/**
 *
 * Adds a new tag to this <code>MediaObject</code>. If the tag is already present, it changes the value.
 *
 * @param key
 *       Tag name.
 * @param value
 *       Value associated to this tag.
 *
 **/
    void addTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value);


/**
 *
 * Removes an existing tag. Exists silently with no error if tag is not defined.
 *
 * @param key
 *       Tag name to be removed
 *
 **/
  void removeTag(@org.kurento.client.internal.server.Param("key") String key);

/**
 *
 * Asynchronous version of removeTag:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaObject#removeTag
 *
 * @param key
 *       Tag name to be removed
 *
 **/
    void removeTag(@org.kurento.client.internal.server.Param("key") String key, Continuation<Void> cont);

/**
 *
 * Removes an existing tag. Exists silently with no error if tag is not defined.
 *
 * @param key
 *       Tag name to be removed
 *
 **/
    void removeTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns the value of given tag, or MEDIA_OBJECT_TAG_KEY_NOT_FOUND if tag is not defined.
 *
 * @param key
 *       Tag key.
 * @return The value associated to the given key. *
 **/
  String getTag(@org.kurento.client.internal.server.Param("key") String key);

/**
 *
 * Asynchronous version of getTag:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaObject#getTag
 *
 * @param key
 *       Tag key.
 *
 **/
    void getTag(@org.kurento.client.internal.server.Param("key") String key, Continuation<String> cont);

/**
 *
 * Returns the value of given tag, or MEDIA_OBJECT_TAG_KEY_NOT_FOUND if tag is not defined.
 *
 * @param key
 *       Tag key.
 * @return The value associated to the given key. *
 **/
    TFuture<String> getTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns all tags attached to this <code>MediaObject</code>.
 * @return An array containing all key-value pairs associated with this <code>MediaObject</code>. *
 **/
  java.util.List<org.kurento.client.Tag> getTags();

/**
 *
 * Asynchronous version of getTags:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see MediaObject#getTags
 *
 **/
    void getTags(Continuation<java.util.List<org.kurento.client.Tag>> cont);

/**
 *
 * Returns all tags attached to this <code>MediaObject</code>.
 * @return An array containing all key-value pairs associated with this <code>MediaObject</code>. *
 **/
    TFuture<java.util.List<org.kurento.client.Tag>> getTags(Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link ErrorEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ErrorEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ErrorEvent.class)
    ListenerSubscription addErrorListener(EventListener<ErrorEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ErrorEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ErrorEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ErrorEvent.class)
    void addErrorListener(EventListener<ErrorEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ErrorEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ErrorEvent.class)
    void removeErrorListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ErrorEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ErrorEvent.class)
    void removeErrorListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}