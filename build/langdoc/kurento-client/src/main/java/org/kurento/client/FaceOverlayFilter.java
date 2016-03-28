/**
 * This file is generated with Kurento-maven-plugin.
 * Please don't edit.
 */
package org.kurento.client;


/**
 *
 * FaceOverlayFilter interface. This type of {@link module:core/abstracts.Filter Filter} detects faces in a video feed. The face is then overlaid with an image.
 *
 **/
@org.kurento.client.internal.RemoteClass
public interface FaceOverlayFilter extends Filter {



/**
 *
 * Clear the image to be shown over each detected face. Stops overlaying the faces.
 *
 **/
  void unsetOverlayedImage();

/**
 *
 * Asynchronous version of unsetOverlayedImage:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see FaceOverlayFilter#unsetOverlayedImage
 *
 **/
    void unsetOverlayedImage(Continuation<Void> cont);

/**
 *
 * Clear the image to be shown over each detected face. Stops overlaying the faces.
 *
 **/
    void unsetOverlayedImage(Transaction tx);


/**
 *
 * Sets the image to use as overlay on the detected faces.
 *
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       the offset applied to the image, from the X coordinate of the detected face upper right corner. A positive value indicates right displacement, while a negative value moves the overlaid image to the left. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s X coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param offsetYPercent
 *       the offset applied to the image, from the Y coordinate of the detected face upper right corner. A positive value indicates up displacement, while a negative value moves the overlaid image down. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s Y coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param widthPercent
 *       proportional width of the overlaid image, relative to the width of the detected face. A value of 1.0 implies that the overlaid image will have the same width as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param heightPercent
 *       proportional height of the overlaid image, relative to the height of the detected face. A value of 1.0 implies that the overlaid image will have the same height as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 *
 **/
  void setOverlayedImage(@org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent);

/**
 *
 * Asynchronous version of setOverlayedImage:
 * {@link Continuation#onSuccess} is called when the action is
 * done. If an error occurs, {@link Continuation#onError} is called.
 * @see FaceOverlayFilter#setOverlayedImage
 *
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       the offset applied to the image, from the X coordinate of the detected face upper right corner. A positive value indicates right displacement, while a negative value moves the overlaid image to the left. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s X coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param offsetYPercent
 *       the offset applied to the image, from the Y coordinate of the detected face upper right corner. A positive value indicates up displacement, while a negative value moves the overlaid image down. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s Y coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param widthPercent
 *       proportional width of the overlaid image, relative to the width of the detected face. A value of 1.0 implies that the overlaid image will have the same width as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param heightPercent
 *       proportional height of the overlaid image, relative to the height of the detected face. A value of 1.0 implies that the overlaid image will have the same height as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 *
 **/
    void setOverlayedImage(@org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent, Continuation<Void> cont);

/**
 *
 * Sets the image to use as overlay on the detected faces.
 *
 * @param uri
 *       URI where the image is located
 * @param offsetXPercent
 *       the offset applied to the image, from the X coordinate of the detected face upper right corner. A positive value indicates right displacement, while a negative value moves the overlaid image to the left. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s X coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param offsetYPercent
 *       the offset applied to the image, from the Y coordinate of the detected face upper right corner. A positive value indicates up displacement, while a negative value moves the overlaid image down. This offset is specified as a percentage of the face width.
 *       
 *       For example, to cover the detected face with the overlaid image, the parameter has to be <code>0.0</code>. Values of <code>1.0</code> or <code>-1.0</code> indicate that the image upper right corner will be at the face´s Y coord, +- the face´s width.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param widthPercent
 *       proportional width of the overlaid image, relative to the width of the detected face. A value of 1.0 implies that the overlaid image will have the same width as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 * @param heightPercent
 *       proportional height of the overlaid image, relative to the height of the detected face. A value of 1.0 implies that the overlaid image will have the same height as the detected face. Values greater than 1.0 are allowed, while negative values are forbidden.
 *       
 *       <hr/><b>Note</b>
 *       
 *           The parameter name is misleading, the value is not a percent but a ratio
 *
 **/
    void setOverlayedImage(Transaction tx, @org.kurento.client.internal.server.Param("uri") String uri, @org.kurento.client.internal.server.Param("offsetXPercent") float offsetXPercent, @org.kurento.client.internal.server.Param("offsetYPercent") float offsetYPercent, @org.kurento.client.internal.server.Param("widthPercent") float widthPercent, @org.kurento.client.internal.server.Param("heightPercent") float heightPercent);

    



    public class Builder extends AbstractBuilder<FaceOverlayFilter> {

/**
 *
 * Creates a Builder for FaceOverlayFilter
 *
 **/
    public Builder(org.kurento.client.MediaPipeline mediaPipeline){

      super(FaceOverlayFilter.class,mediaPipeline);

      props.add("mediaPipeline",mediaPipeline);
    }

    }


}