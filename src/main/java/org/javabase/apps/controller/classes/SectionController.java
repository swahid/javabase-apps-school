package org.javabase.apps.controller.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassSection;
import org.javabase.apps.service.ClassSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/class/section")
public class SectionController {
	
	@Autowired
	ClassSectionService classSectionService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String section() {
        return "class/section";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allClassSection() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<ClassSection> classSectionList = classSectionService.getAllClassSections();
		
		response.put("success", true);
		response.put("data", classSectionList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addInsClassSection", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody ClassSection classSection) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = classSectionService.addClassSection(classSection);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Section Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Section Failed");
			return response;
		}
		
	}
	
}
