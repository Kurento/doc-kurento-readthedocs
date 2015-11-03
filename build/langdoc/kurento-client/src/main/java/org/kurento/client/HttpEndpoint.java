/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * Endpoint that enables Kurento to work as an HTTP server, allowing peer HTTP clients to access media.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface HttpEndpoint extends SessionEndpoint {



/**
 *
 * Obtains the URL associated to this endpoint
 * @return The url as a String *
 **/
  String getUrl();

/**
 *
 * Asynchronous version of getUrl:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see HttpEndpoint#getUrl
 *
 **/
    void getUrl(Continuation<String> cont);

/**
 *
 * Obtains the URL associated to this endpoint
 * @return The url as a String *
 **/
    TFuture<String> getUrl(Transaction tx);

    




}