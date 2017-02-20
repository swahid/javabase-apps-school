package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassOnShift;
import org.javabase.apps.service.ClassOnShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/classOnShift")
public class ClassOnShiftController {
	
	@Autowired
	ClassOnShiftService classOnShiftService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/classOnShift";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allClassOnShift() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<ClassOnShift> classOnShiftList = classOnShiftService.getAllClassOnShifts();
			
		response.put("success", true);
		response.put("data", classOnShiftList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody ClassOnShift classOnShift) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = classOnShiftService.addClassOnShift(classOnShift);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Class Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Class Failed");
			return response;
		}
		
	}
	
}
