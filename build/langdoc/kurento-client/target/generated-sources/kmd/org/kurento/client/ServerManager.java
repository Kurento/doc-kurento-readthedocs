/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This is a standalone object for managing the MediaServer
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface ServerManager extends MediaObject {

/**
 *
 * Get Server information, version, modules, factories, etc
 *
 **/
     org.kurento.client.ServerInfo getInfo();

/**
 *
 * Get Server information, version, modules, factories, etc
 *
 **/
     void getInfo(Continuation<org.kurento.client.ServerInfo> cont);

/**
 *
 * Get Server information, version, modules, factories, etc
 *
 **/
     TFuture<org.kurento.client.ServerInfo> getInfo(Transaction tx);

/**
 *
 * Get All the pipelines available in the server
 *
 **/
     java.util.List<org.kurento.client.MediaPipeline> getPipelines();

/**
 *
 * Get All the pipelines available in the server
 *
 **/
     void getPipelines(Continuation<java.util.List<org.kurento.client.MediaPipeline>> cont);

/**
 *
 * Get All the pipelines available in the server
 *
 **/
     TFuture<java.util.List<org.kurento.client.MediaPipeline>> getPipelines(Transaction tx);

/**
 *
 * Get All active sessions in the server
 *
 **/
     java.util.List<String> getSessions();

/**
 *
 * Get All active sessions in the server
 *
 **/
     void getSessions(Continuation<java.util.List<String>> cont);

/**
 *
 * Get All active sessions in the server
 *
 **/
     TFuture<java.util.List<String>> getSessions(Transaction tx);

/**
 *
 * Get Metadata stored in the server
 *
 **/
     String getMetadata();

/**
 *
 * Get Metadata stored in the server
 *
 **/
     void getMetadata(Continuation<String> cont);

/**
 *
 * Get Metadata stored in the server
 *
 **/
     TFuture<String> getMetadata(Transaction tx);



/**
 *
 * Returns the kmd associated to a module
 *
 * @param moduleName
 *       Name of the module to get its kmd file
 * @return The kmd file *
 **/
  String getKmd(@org.kurento.client.internal.server.Param("moduleName") String moduleName);

/**
 *
 * Asynchronous version of getKmd:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see ServerManager#getKmd
 *
 * @param moduleName
 *       Name of the module to get its kmd file
 *
 **/
    void getKmd(@org.kurento.client.internal.server.Param("moduleName") String moduleName, Continuation<String> cont);

/**
 *
 * Returns the kmd associated to a module
 *
 * @param moduleName
 *       Name of the module to get its kmd file
 * @return The kmd file *
 **/
    TFuture<String> getKmd(Transaction tx, @org.kurento.client.internal.server.Param("moduleName") String moduleName);


/**
 *
 * Returns the amount of memory that the server is using in KiB
 * @return The amount of KiB of memory being used *
 **/
  long getUsedMemory();

/**
 *
 * Asynchronous version of getUsedMemory:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see ServerManager#getUsedMemory
 *
 **/
    void getUsedMemory(Continuation<Long> cont);

/**
 *
 * Returns the amount of memory that the server is using in KiB
 * @return The amount of KiB of memory being used *
 **/
    TFuture<Long> getUsedMemory(Transaction tx);

    /**
     * Add a {@link EventListener} for event {@link ObjectCreatedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ObjectCreatedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectCreatedEvent.class)
    ListenerSubscription addObjectCreatedListener(EventListener<ObjectCreatedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ObjectCreatedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ObjectCreatedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectCreatedEvent.class)
    void addObjectCreatedListener(EventListener<ObjectCreatedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ObjectCreatedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectCreatedEvent.class)
    void removeObjectCreatedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ObjectCreatedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectCreatedEvent.class)
    void removeObjectCreatedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link ObjectDestroyedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on ObjectDestroyedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectDestroyedEvent.class)
    ListenerSubscription addObjectDestroyedListener(EventListener<ObjectDestroyedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link ObjectDestroyedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on ObjectDestroyedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectDestroyedEvent.class)
    void addObjectDestroyedListener(EventListener<ObjectDestroyedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link ObjectDestroyedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectDestroyedEvent.class)
    void removeObjectDestroyedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link ObjectDestroyedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(ObjectDestroyedEvent.class)
    void removeObjectDestroyedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}