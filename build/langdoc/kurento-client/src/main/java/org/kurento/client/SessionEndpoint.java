/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Session based endpoint. A session is considered to be started when the media exchange starts. On the other hand, sessions terminate when a timeout, defined by the developer, takes place after the connection is lost.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface SessionEndpoint extends Endpoint {


    /**
     * Add a {@link EventListener} for event {@link MediaSessionTerminatedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on MediaSessionTerminatedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionTerminatedEvent.class)
    ListenerSubscription addMediaSessionTerminatedListener(EventListener<MediaSessionTerminatedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link MediaSessionTerminatedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on MediaSessionTerminatedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionTerminatedEvent.class)
    void addMediaSessionTerminatedListener(EventListener<MediaSessionTerminatedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link MediaSessionTerminatedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionTerminatedEvent.class)
    void removeMediaSessionTerminatedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link MediaSessionTerminatedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionTerminatedEvent.class)
    void removeMediaSessionTerminatedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    /**
     * Add a {@link EventListener} for event {@link MediaSessionStartedEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on MediaSessionStartedEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionStartedEvent.class)
    ListenerSubscription addMediaSessionStartedListener(EventListener<MediaSessionStartedEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link MediaSessionStartedEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on MediaSessionStartedEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionStartedEvent.class)
    void addMediaSessionStartedListener(EventListener<MediaSessionStartedEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link MediaSessionStartedEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionStartedEvent.class)
    void removeMediaSessionStartedListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link MediaSessionStartedEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(MediaSessionStartedEvent.class)
    void removeMediaSessionStartedListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    




}