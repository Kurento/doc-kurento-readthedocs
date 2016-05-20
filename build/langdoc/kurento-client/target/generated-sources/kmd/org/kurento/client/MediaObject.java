/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * <p>This is the base interface for all elements. It is used to manage properties common to all Kurento objects:
 *       <ul>
 *         <li>ID: every object has a unique identifier based on a GUID and the suffix `_kurento.elemenType`. In the case of pipelines, this ID would be GUID_kurento.MediaPipeline. For the rest of media elements, it is prefixed with the MediaPipeline's ID where the endpoint was created. For instance, a WebRtcEndpoint would be GUID_kureto.MediaPipeline/GUID_kureto.WebRtcEndpoint. Needless to say, both GUIDs are different in each case.</li>
 *         <li>name: This is a free text that can be used to provide a firendly name for the endpoint. By default, it's the same as the ID</li>
 *         <li>tags: This is metadata that can be attached to the media element. </li>
 *       </ul>
 *       </p>
 *       <p>
 *       <h2>Events fired:</h2>
 *       <ul><li>ErrorEvent: In case something goes wrong. Since most errors are asynchronous, it is recommended to suscribe to this event.</li></ul>
 *       </p>
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaObject extends KurentoObject {

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belongs, or the pipeline itself if invoked on a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     org.kurento.client.MediaPipeline getMediaPipeline();

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belongs, or the pipeline itself if invoked on a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     void getMediaPipeline(Continuation<org.kurento.client.MediaPipeline> cont);

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belongs, or the pipeline itself if invoked on a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     TFuture<org.kurento.client.MediaPipeline> getMediaPipeline(Transaction tx);

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null
 *
 **/
     org.kurento.client.MediaObject getParent();

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null
 *
 **/
     void getParent(Continuation<org.kurento.client.MediaObject> cont);

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, so this property will be null
 *
 **/
     TFuture<org.kurento.client.MediaObject> getParent(Transaction tx);

/**
 *
 * Get unique identifier of the mediaobject. It's a synthetic identifier composed by a GUID and the name of the type of the object. In case of media objects that have a parent, the ID of the parent is added to the generated ID, separated by `/`: ID_parent/ID_media-object
 *
 **/
     String getId();

/**
 *
 * Get unique identifier of the mediaobject. It's a synthetic identifier composed by a GUID and the name of the type of the object. In case of media objects that have a parent, the ID of the parent is added to the generated ID, separated by `/`: ID_parent/ID_media-object
 *
 **/
     void getId(Continuation<String> cont);

/**
 *
 * Get unique identifier of the mediaobject. It's a synthetic identifier composed by a GUID and the name of the type of the object. In case of media objects that have a parent, the ID of the parent is added to the generated ID, separated by `/`: ID_parent/ID_media-object
 *
 **/
     TFuture<String> getId(Transaction tx);

/**
 *
 * @deprecated
 * Get Use children instead. Children of current object, all returned objects have parent set to current object
 *
 **/
     java.util.List<org.kurento.client.MediaObject> getChilds();

/**
 *
 * @deprecated
 * Get Use children instead. Children of current object, all returned objects have parent set to current object
 *
 **/
     void getChilds(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

/**
 *
 * @deprecated
 * Get Use children instead. Children of current object, all returned objects have parent set to current object
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaObject>> getChilds(Transaction tx);

/**
 *
 * Get Children of current object. All returned objects have parent set to current object
 *
 **/
     java.util.List<org.kurento.client.MediaObject> getChildren();

/**
 *
 * Get Children of current object. All returned objects have parent set to current object
 *
 **/
     void getChildren(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

/**
 *
 * Get Children of current object. All returned objects have parent set to current object
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaObject>> getChildren(Transaction tx);

/**
 *
 * Get Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     String getName();

/**
 *
 * Get Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     void getName(Continuation<String> cont);

/**
 *
 * Get Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     TFuture<String> getName(Transaction tx);

/**
 *
 * Set Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name);

/**
 *
 * Set Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Continuation<Void> cont);

/**
 *
 * Set Object name. This is just a comodity to simplify developers' life debugging, it is not used internally for indexing nor idenfiying the objects. By default, it's the object's id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Transaction tx);
/**
 *
 * Get This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     boolean getSendTagsInEvents();

/**
 *
 * Get This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     void getSendTagsInEvents(Continuation<Boolean> cont);

/**
 *
 * Get This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     TFuture<Boolean> getSendTagsInEvents(Transaction tx);

/**
 *
 * Set This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents);

/**
 *
 * Set This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Continuation<Void> cont);

/**
 *
 * Set This property activates or deactivates sending the element's tags in all events fired.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Transaction tx);
/**
 *
 * Get Number of seconds since Epoch when the element was created
 *
 **/
     int getCreationTime();

/**
 *
 * Get Number of seconds since Epoch when the element was created
 *
 **/
     void getCreationTime(Continuation<Integer> cont);

/**
 *
 * Get Number of seconds since Epoch when the element was created
 *
 **/
     TFuture<Integer> getCreationTime(Transaction tx);



/**
 *
 * Adds a new tag to the media object. If the tag is already present, it changes the value.
 *
 * @param key
 *       Key of the tag.
 * @param value
 *       Value assoicated to the key.
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
 *       Key of the tag.
 * @param value
 *       Value assoicated to the key.
 *
 **/
    void addTag(@org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value, Continuation<Void> cont);

/**
 *
 * Adds a new tag to the media object. If the tag is already present, it changes the value.
 *
 * @param key
 *       Key of the tag.
 * @param value
 *       Value assoicated to the key.
 *
 **/
    void addTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value);


/**
 *
 * Removes an existing tag. If the tag was not defined before, nothing happens.
 *
 * @param key
 *       Key of the tag to remove
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
 *       Key of the tag to remove
 *
 **/
    void removeTag(@org.kurento.client.internal.server.Param("key") String key, Continuation<Void> cont);

/**
 *
 * Removes an existing tag. If the tag was not defined before, nothing happens.
 *
 * @param key
 *       Key of the tag to remove
 *
 **/
    void removeTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns the value of a certain tag. If the key is not defined, it returns a MEDIA_OBJECT_TAG_KEY_NOT_FOUND
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
 * Returns the value of a certain tag. If the key is not defined, it returns a MEDIA_OBJECT_TAG_KEY_NOT_FOUND
 *
 * @param key
 *       Tag key.
 * @return The value associated to the given key. *
 **/
    TFuture<String> getTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns all this MediaObject's tags.
 * @return An array containing all key-value pairs associated with the MediaObject. *
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
 * Returns all this MediaObject's tags.
 * @return An array containing all key-value pairs associated with the MediaObject. *
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