package org.javabase.apps.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "dashboard/student")
public class StudentController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "student/students";
    }
	
}
