/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * ImageOverlayFilter interface. This type of {@link module:core/abstracts.Filter Filter} draws an image in a configured position over a video feed.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface ImageOverlayFilter extends Filter {



/**
 *
 * Remove the image with the given ID.
 *
 * @param id
 *       Image ID to be removed
 *
 **/
  void removeImage(@org.kurento.client.internal.server.Param("id") String id);

/**
 *
 * Asynchronous version of removeImage:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see ImageOverlayFilter#removeImage
 *
 * @param id
 *       Image ID to be removed
 *
 **/
    void removeImage(@org.kurento.client.internal.server.Param("id") String id, Continuation<Void> cont);

/**
 *
 * Remove the image with the given ID.
 *
 * @param id
 *       Image ID to be removed
 *
 **/
    void removeImage(Transaction tx, @org.kurento.client.internal.server.Param("id") String id);


/**
 *
 * Add an image to be used as overlay.
 *
 * @param id
 *       image ID
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       Percentage relative to the image width to calculate the X coordinate of the position (left upper corner) [0..1]
 * @param offsetYPercent
 *       Percentage relative to the image height to calculate the Y coordinate of the position (left upper corner) [0..1]
 * @param widthPercent
 *       Proportional width of the overlaid image, relative to the width of the video [0..1].
 * @param heightPercent
 *       Proportional height of the overlaid image, relative to the height of the video [0..1].
 * @param keepAspectRatio
 *       Keep the aspect ratio of the original image.
 * @param center
 *       If the image doesn't fit in the dimensions, the image will be center into the region defined by height and width.
 *
 **/
  void addImage(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent, @org.kurento.client.internal.server.Param("keepAspectRatio") boolean keepAspectRatio, @org.kurento.client.internal.server.Param("center") boolean center);

/**
 *
 * Asynchronous version of addImage:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see ImageOverlayFilter#addImage
 *
 * @param id
 *       image ID
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       Percentage relative to the image width to calculate the X coordinate of the position (left upper corner) [0..1]
 * @param offsetYPercent
 *       Percentage relative to the image height to calculate the Y coordinate of the position (left upper corner) [0..1]
 * @param widthPercent
 *       Proportional width of the overlaid image, relative to the width of the video [0..1].
 * @param heightPercent
 *       Proportional height of the overlaid image, relative to the height of the video [0..1].
 * @param keepAspectRatio
 *       Keep the aspect ratio of the original image.
 * @param center
 *       If the image doesn't fit in the dimensions, the image will be center into the region defined by height and width.
 *
 **/
    void addImage(@org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent, @org.kurento.client.internal.server.Param("keepAspectRatio") boolean keepAspectRatio, @org.kurento.client.internal.server.Param("center") boolean center, Continuation<Void> cont);

/**
 *
 * Add an image to be used as overlay.
 *
 * @param id
 *       image ID
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       Percentage relative to the image width to calculate the X coordinate of the position (left upper corner) [0..1]
 * @param offsetYPercent
 *       Percentage relative to the image height to calculate the Y coordinate of the position (left upper corner) [0..1]
 * @param widthPercent
 *       Proportional width of the overlaid image, relative to the width of the video [0..1].
 * @param heightPercent
 *       Proportional height of the overlaid image, relative to the height of the video [0..1].
 * @param keepAspectRatio
 *       Keep the aspect ratio of the original image.
 * @param center
 *       If the image doesn't fit in the dimensions, the image will be center into the region defined by height and width.
 *
 **/
    void addImage(Transaction tx, @org.kurento.client.internal.server.Param("id") String id, @org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent, @org.kurento.client.internal.server.Param("keepAspectRatio") boolean keepAspectRatio, @org.kurento.client.internal.server.Param("center") boolean center);

    



    public class Builder extends AbstractBuilder<ImageOverlayFilter> {

/**
 *
 * Creates a Builder for ImageOverlayFilter
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(ImageOverlayFilter.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}