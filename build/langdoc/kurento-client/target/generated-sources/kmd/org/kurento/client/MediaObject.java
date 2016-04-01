/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Base for all objects that can be created in the media server.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface MediaObject extends KurentoObject {

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belong, or the pipeline itself if invoked over a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     org.kurento.client.MediaPipeline getMediaPipeline();

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belong, or the pipeline itself if invoked over a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     void getMediaPipeline(Continuation<org.kurento.client.MediaPipeline> cont);

/**
 *
 * Get {@link module:core.MediaPipeline MediaPipeline} to which this MediaObject belong, or the pipeline itself if invoked over a {@link module:core.MediaPipeline MediaPipeline}
 *
 **/
     TFuture<org.kurento.client.MediaPipeline> getMediaPipeline(Transaction tx);

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, i.e. the property is null
 *
 **/
     org.kurento.client.MediaObject getParent();

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, i.e. the property is null
 *
 **/
     void getParent(Continuation<org.kurento.client.MediaObject> cont);

/**
 *
 * Get parent of this media object. The type of the parent depends on the type of the element. The parent of a :rom:cls:`MediaPad` is its {@link module:core/abstracts.MediaElement MediaElement}; the parent of a {@link module:core/abstracts.Hub Hub} or a {@link module:core/abstracts.MediaElement MediaElement} is its {@link module:core.MediaPipeline MediaPipeline}. A {@link module:core.MediaPipeline MediaPipeline} has no parent, i.e. the property is null
 *
 **/
     TFuture<org.kurento.client.MediaObject> getParent(Transaction tx);

/**
 *
 * Get unique identifier of the mediaobject.
 *
 **/
     String getId();

/**
 *
 * Get unique identifier of the mediaobject.
 *
 **/
     void getId(Continuation<String> cont);

/**
 *
 * Get unique identifier of the mediaobject.
 *
 **/
     TFuture<String> getId(Transaction tx);

/**
 *
 * Get Childs of current object, all returned objects have parent set to current object
 *
 **/
     java.util.List<org.kurento.client.MediaObject> getChilds();

/**
 *
 * Get Childs of current object, all returned objects have parent set to current object
 *
 **/
     void getChilds(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

/**
 *
 * Get Childs of current object, all returned objects have parent set to current object
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaObject>> getChilds(Transaction tx);

/**
 *
 * Get Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     String getName();

/**
 *
 * Get Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     void getName(Continuation<String> cont);

/**
 *
 * Get Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     TFuture<String> getName(Transaction tx);

/**
 *
 * Set Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name);

/**
 *
 * Set Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Continuation<Void> cont);

/**
 *
 * Set Object name. This is just a comodity to simplify developers life debugging, it is not used internally for indexing nor idenfiying the objects. By default is the object type followed by the object id.
 *
 **/
     void setName(@org.kurento.client.internal.server.Param("name") String name, Transaction tx);
/**
 *
 * Get This property allows activate/deactivate sending the element tags in all its events.
 *
 **/
     boolean getSendTagsInEvents();

/**
 *
 * Get This property allows activate/deactivate sending the element tags in all its events.
 *
 **/
     void getSendTagsInEvents(Continuation<Boolean> cont);

/**
 *
 * Get This property allows activate/deactivate sending the element tags in all its events.
 *
 **/
     TFuture<Boolean> getSendTagsInEvents(Transaction tx);

/**
 *
 * Set This property allows activate/deactivate sending the element tags in all its events.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents);

/**
 *
 * Set This property allows activate/deactivate sending the element tags in all its events.
 *
 **/
     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Continuation<Void> cont);

/**
 *
 * Set This property allows activate/deactivate sending the element tags in all its events.
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
 * Request a SessionSpec offer.
 *    This can be used to initiate a connection.
 *
 * @param key
 *       Key of the tag
 * @param value
 *       Value of the tag
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
 *       Key of the tag
 * @param value
 *       Value of the tag
 *
 **/
    void addTag(@org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value, Continuation<Void> cont);

/**
 *
 * Request a SessionSpec offer.
 *    This can be used to initiate a connection.
 *
 * @param key
 *       Key of the tag
 * @param value
 *       Value of the tag
 *
 **/
    void addTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key, @org.kurento.client.internal.server.Param("value") String value);


/**
 *
 * Remove the tag (key and value) associated to a tag
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
 * Remove the tag (key and value) associated to a tag
 *
 * @param key
 *       Key of the tag to remove
 *
 **/
    void removeTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns the value associated to the given key.
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
 * Returns the value associated to the given key.
 *
 * @param key
 *       Tag key.
 * @return The value associated to the given key. *
 **/
    TFuture<String> getTag(Transaction tx, @org.kurento.client.internal.server.Param("key") String key);


/**
 *
 * Returns all the MediaObject tags.
 * @return An array containing all pairs key-value associated to the MediaObject. *
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
 * Returns all the MediaObject tags.
 * @return An array containing all pairs key-value associated to the MediaObject. *
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