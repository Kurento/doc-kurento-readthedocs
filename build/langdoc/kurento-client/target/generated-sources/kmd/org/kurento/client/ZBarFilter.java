/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * This filter detects <a href="http://www.kurento.org/docs/current/glossary.html#term-qr">QR</a> codes in a video feed. When a code is found, the filter raises a :rom:evnt:`CodeFound` event.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface ZBarFilter extends Filter {


    /**
     * Add a {@link EventListener} for event {@link CodeFoundEvent}. Synchronous call.
     *
     * @param  listener Listener to be called on CodeFoundEvent
     * @return ListenerSubscription for the given Listener
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CodeFoundEvent.class)
    ListenerSubscription addCodeFoundListener(EventListener<CodeFoundEvent> listener);
    /**
     * Add a {@link EventListener} for event {@link CodeFoundEvent}. Asynchronous call.
     * Calls Continuation&lt;ListenerSubscription&gt; when it has been added.
     *
     * @param listener Listener to be called on CodeFoundEvent
     * @param cont     Continuation to be called when the listener is registered
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CodeFoundEvent.class)
    void addCodeFoundListener(EventListener<CodeFoundEvent> listener, Continuation<ListenerSubscription> cont);
    
	/**
     * Remove a {@link ListenerSubscription} for event {@link CodeFoundEvent}. Synchronous call.
     *
     * @param listenerSubscription Listener subscription to be removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CodeFoundEvent.class)
    void removeCodeFoundListener(ListenerSubscription listenerSubscription);
    /**
     * Remove a {@link ListenerSubscription} for event {@link CodeFoundEvent}. Asynchronous call.
     * Calls Continuation&lt;Void&gt; when it has been removed.
     *
     * @param listenerSubscription Listener subscription to be removed
     * @param cont                 Continuation to be called when the listener is removed
     *
     **/
    @org.kurento.client.internal.server.EventSubscription(CodeFoundEvent.class)
    void removeCodeFoundListener(ListenerSubscription listenerSubscription, Continuation<Void> cont);
    



    public class Builder extends AbstractBuilder<ZBarFilter> {

/**
 *
 * Creates a Builder for ZBarFilter
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(ZBarFilter.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}