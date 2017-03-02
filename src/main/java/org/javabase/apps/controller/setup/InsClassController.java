package org.javabase.apps.controller.setup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
import org.javabase.apps.service.InsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/insClass")
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
		List<InsClass> insClassList = new ArrayList<>();
		
            insClassList = insClassService.getAllInsClasss();
			
		response.put("success", true);
		response.put("data", insClassList);
		return response;
		
	}
	@ResponseBody
	@RequestMapping(value = "load/{classId}",method = RequestMethod.GET)
	public Map<String, Object> loadClassById(@PathVariable int classId) {
	    Map<String, Object> response= new HashMap<String, Object>();
	    
	    InsClass insclass = insClassService.getInsClassById(classId);
	    
	    response.put("success", true);
	    response.put("data", insclass);
	    return response;
	    
	}
	@ResponseBody
    @RequestMapping(value = "loadbyShift",method = RequestMethod.GET)
    public Map<String, Object> loadbyShift(@RequestParam("shiftId") int shiftId) {
        Map<String, Object> response= new HashMap<String, Object>();
        
        List<InsClass> insClassList = insClassService.getClassByShift(shiftId);
        
        response.put("success", true);
        response.put("data", insClassList);
        return response;
        
    }
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
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
