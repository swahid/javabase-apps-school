package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Subject;
import org.javabase.apps.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/subject")
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String institutionPage() {
        return "institution/subject";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allBuilding() {
		Map<String, Object> response= new HashMap<String, Object>();

		List<Subject> subjectList = subjectService.getAllSubjects();

		response.put("success", true);
		response.put("data", subjectList);
		return response;
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody Subject subject) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = subjectService.addSubject(subject);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Subject Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Subject Failed");
			return response;
		}
		
	}
	
	
}
