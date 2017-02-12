package org.javabase.apps.controller.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/gallery" )
public class GalleryController {

	@RequestMapping(method = RequestMethod.GET)
	private String gallaryArchive(){
		
		return "homepage/gallery";
	}
}
