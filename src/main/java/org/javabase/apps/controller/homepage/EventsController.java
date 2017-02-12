package org.javabase.apps.controller.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/events" )
public class EventsController {

	@RequestMapping(method = RequestMethod.GET)
	private String contactArchive(){
		
		return "homepage/events-archive";
	}
}
