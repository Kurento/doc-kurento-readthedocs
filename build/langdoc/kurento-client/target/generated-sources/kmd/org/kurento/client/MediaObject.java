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

     org.kurento.client.MediaPipeline getMediaPipeline();

     void getMediaPipeline(Continuation<org.kurento.client.MediaPipeline> cont);

     TFuture<org.kurento.client.MediaPipeline> getMediaPipeline(Transaction tx);

     org.kurento.client.MediaObject getParent();

     void getParent(Continuation<org.kurento.client.MediaObject> cont);

     TFuture<org.kurento.client.MediaObject> getParent(Transaction tx);

     String getId();

     void getId(Continuation<String> cont);

     TFuture<String> getId(Transaction tx);

     java.util.List<org.kurento.client.MediaObject> getChilds();

     void getChilds(Continuation<java.util.List<org.kurento.client.MediaObject>> cont);

     TFuture<java.util.List<org.kurento.client.MediaObject>> getChilds(Transaction tx);

     String getName();

     void getName(Continuation<String> cont);

     TFuture<String> getName(Transaction tx);

     void setName(@org.kurento.client.internal.server.Param("name") String name);

     void setName(@org.kurento.client.internal.server.Param("name") String name, Continuation<Void> cont);

     void setName(@org.kurento.client.internal.server.Param("name") String name, Transaction tx);
     boolean getSendTagsInEvents();

     void getSendTagsInEvents(Continuation<Boolean> cont);

     TFuture<Boolean> getSendTagsInEvents(Transaction tx);

     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents);

     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Continuation<Void> cont);

     void setSendTagsInEvents(@org.kurento.client.internal.server.Param("sendTagsInEvents") boolean sendTagsInEvents, Transaction tx);
     int getCreationTime();

     void getCreationTime(Continuation<Integer> cont);

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