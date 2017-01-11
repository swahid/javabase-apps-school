package org.javabase.apps.controller.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "teacher/teacher";
    }
	
}
