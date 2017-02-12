package org.javabase.apps.controller.parents;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "dashboard/parents")
public class ParentsController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "parents/index";
    }
	
}
