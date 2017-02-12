package org.javabase.apps.controller.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/course" )
public class CourseArchiveController {

	@RequestMapping(method = RequestMethod.GET)
	private String courseArchive(){
		
		return "homepage/course-archive";
	}
}
