/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Interface for endpoints the require a URI to work. An example of this, would be a :rom:cls:`PlayerEndpoint` whose URI property could be used to locate a file to stream
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface UriEndpoint extends Endpoint {

     String getUri();

     void getUri(Continuation<String> cont);

     TFuture<String> getUri(Transaction tx);



/**
 *
 * Pauses the feed
 *
 **/
  void pause();

/**
 *
 * Asynchronous version of pause:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see UriEndpoint#pause
 *
 **/
    void pause(Continuation<Void> cont);

/**
 *
 * Pauses the feed
 *
 **/
    void pause(Transaction tx);


/**
 *
 * Stops the feed
 *
 **/
  void stop();

/**
 *
 * Asynchronous version of stop:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see UriEndpoint#stop
 *
 **/
    void stop(Continuation<Void> cont);

/**
 *
 * Stops the feed
 *
 **/
    void stop(Transaction tx);

    




}