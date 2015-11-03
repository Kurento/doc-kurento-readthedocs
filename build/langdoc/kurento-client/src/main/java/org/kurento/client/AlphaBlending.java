/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * A {@link module:core/abstracts.Hub Hub} that mixes the {@link #MediaType.AUDIO} stream of its connected sources and constructs one output with {@link #MediaType.VIDEO} streams of its connected sources into its sink
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface AlphaBlending extends Hub {



/**
 *
 * Sets the source port that will be the master entry to the mixer
 *
 * @param source
 *       The reference to the HubPort setting as master port
 * @param zOrder
 *       The order in z to draw the master image
 *
 **/
  void setMaster(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("zOrder") int zOrder);

/**
 *
 * Asynchronous version of setMaster:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see AlphaBlending#setMaster
 *
 * @param source
 *       The reference to the HubPort setting as master port
 * @param zOrder
 *       The order in z to draw the master image
 *
 **/
    void setMaster(@org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("zOrder") int zOrder, Continuation<Void> cont);

/**
 *
 * Sets the source port that will be the master entry to the mixer
 *
 * @param source
 *       The reference to the HubPort setting as master port
 * @param zOrder
 *       The order in z to draw the master image
 *
 **/
    void setMaster(Transaction tx, @org.kurento.client.internal.server.Param("source") org.kurento.client.HubPort source, @org.kurento.client.internal.server.Param("zOrder") int zOrder);


/**
 *
 * Configure the blending mode of one port.
 *
 * @param relativeX
 *       The x position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param relativeY
 *       The y position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param zOrder
 *       The order in z to draw the images. The greatest value of z is in the top.
 * @param relativeWidth
 *       The image width relative to the master port width. Values from 0 to 1 are accepted.
 * @param relativeHeight
 *       The image height relative to the master port height. Values from 0 to 1 are accepted.
 * @param port
 *       The reference to the confingured port.
 *
 **/
  void setPortProperties(@org.kurento.client.internal.server.Param("relativeX") float relativeX, @org.kurento.client.internal.server.Param("relativeY") float relativeY, @org.kurento.client.internal.server.Param("zOrder") int zOrder, @org.kurento.client.internal.server.Param("relativeWidth") float relativeWidth, @org.kurento.client.internal.server.Param("relativeHeight") float relativeHeight, @org.kurento.client.internal.server.Param("port") org.kurento.client.HubPort port);

/**
 *
 * Asynchronous version of setPortProperties:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see AlphaBlending#setPortProperties
 *
 * @param relativeX
 *       The x position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param relativeY
 *       The y position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param zOrder
 *       The order in z to draw the images. The greatest value of z is in the top.
 * @param relativeWidth
 *       The image width relative to the master port width. Values from 0 to 1 are accepted.
 * @param relativeHeight
 *       The image height relative to the master port height. Values from 0 to 1 are accepted.
 * @param port
 *       The reference to the confingured port.
 *
 **/
    void setPortProperties(@org.kurento.client.internal.server.Param("relativeX") float relativeX, @org.kurento.client.internal.server.Param("relativeY") float relativeY, @org.kurento.client.internal.server.Param("zOrder") int zOrder, @org.kurento.client.internal.server.Param("relativeWidth") float relativeWidth, @org.kurento.client.internal.server.Param("relativeHeight") float relativeHeight, @org.kurento.client.internal.server.Param("port") org.kurento.client.HubPort port, Continuation<Void> cont);

/**
 *
 * Configure the blending mode of one port.
 *
 * @param relativeX
 *       The x position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param relativeY
 *       The y position relative to the master port. Values from 0 to 1 are accepted. The value 0, indicates the coordinate 0 in the master image.
 * @param zOrder
 *       The order in z to draw the images. The greatest value of z is in the top.
 * @param relativeWidth
 *       The image width relative to the master port width. Values from 0 to 1 are accepted.
 * @param relativeHeight
 *       The image height relative to the master port height. Values from 0 to 1 are accepted.
 * @param port
 *       The reference to the confingured port.
 *
 **/
    void setPortProperties(Transaction tx, @org.kurento.client.internal.server.Param("relativeX") float relativeX, @org.kurento.client.internal.server.Param("relativeY") float relativeY, @org.kurento.client.internal.server.Param("zOrder") int zOrder, @org.kurento.client.internal.server.Param("relativeWidth") float relativeWidth, @org.kurento.client.internal.server.Param("relativeHeight") float relativeHeight, @org.kurento.client.internal.server.Param("port") org.kurento.client.HubPort port);

    



    public class Builder extends AbstractBuilder<AlphaBlending> {

/**
 *
 * Creates a Builder for AlphaBlending
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(AlphaBlending.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}