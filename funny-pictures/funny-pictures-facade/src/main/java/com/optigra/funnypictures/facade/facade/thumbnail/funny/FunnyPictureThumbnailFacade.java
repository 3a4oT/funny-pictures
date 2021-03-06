package com.optigra.funnypictures.facade.facade.thumbnail.funny;

import com.optigra.funnypictures.facade.resources.search.PagedRequest;
import com.optigra.funnypictures.facade.resources.search.PagedResultResource;
import com.optigra.funnypictures.facade.resources.thumbnail.funny.FunnyPictureThumbnailResource;
import com.optigra.funnypictures.model.thumbnail.ThumbnailType;

/**
 * Facade for funny picture.
 * 
 * @author oleh.zasadnyy
 *
 */
public interface FunnyPictureThumbnailFacade {
	
	/**
	 * Method returns paged result for requested funny pictures thumbnails.
	 * 
	 * @param pagedRequest
	 *            request with offset and limit
	 * @return Paged result with funny picture thumbnail resource
	 */
	PagedResultResource<FunnyPictureThumbnailResource> getFunnyPicturesThumbnails(PagedRequest<FunnyPictureThumbnailResource> pagedRequest);
	
	/**
	 * Get funny picture thumbnail by identifier.
	 * 
	 * @param id FunnyPictureThumbnail identifier
	 * @return FunnyPictureThumbnailResource.
	 */
	FunnyPictureThumbnailResource getFunnyPictureThumbnail(Long id);
	
	/**
	 * Get funnies thumbnails for picture.
	 * 
	 * @param id Picture identifier.
	 * @param pagedRequest Paged request.
	 * @return Paged result of funnies.
	 */
	PagedResultResource<FunnyPictureThumbnailResource> getFunniesThumbnailsForPicture(Long id, PagedRequest<FunnyPictureThumbnailResource> pagedRequest);

	/**
	 * Get funny thumbnail for funny picture.
	 *
	 * @param id Picture identifier.
	 * @param thumbnailType ThumbnailType.
	 * @return FunnyPictureThumbnailResource.
	 */
	FunnyPictureThumbnailResource getFunnyThumbnailForFunnyPicture(Long id, ThumbnailType thumbnailType);
}
