package com.optigra.funnypictures.facade.facade.content;

import com.optigra.funnypictures.facade.resources.content.ContentResource;

public interface ContentFacade {

	ContentResource getContent(String uri);
	
	ContentResource storeContent(ContentResource resource);
}