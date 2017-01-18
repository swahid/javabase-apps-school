package org.javabase.apps.controller.institutionSettings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
import org.javabase.apps.service.InsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/insClass")
public class InsClassController {
	
	@Autowired
	InsClassService insClassService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/insClass";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allInsClass() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<InsClass> insClassList = insClassService.getAllInsClasss(); 
			
		response.put("success", true);
		response.put("data", insClassList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addInsClass", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody InsClass insClass) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = insClassService.addInsClass(insClass);
		
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
