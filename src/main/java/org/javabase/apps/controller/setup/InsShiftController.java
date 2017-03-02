package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsShift;
import org.javabase.apps.service.InsShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/shift")
public class InsShiftController {
	
	@Autowired
	InsShiftService insShiftService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/shift";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allInsShift() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<InsShift> insShiftList = insShiftService.getAllInsShifts();
			
		response.put("success", true);
		response.put("data", insShiftList);
		return response;
		
	}
	@ResponseBody
	@RequestMapping(value = "load/{shiftId}",method = RequestMethod.GET)
	public Map<String, Object> allInsShift(@PathVariable int shiftId) {
	    Map<String, Object> response= new HashMap<String, Object>();
	    
	    InsShift insShift = insShiftService.getInsShiftById(shiftId);
	    
	    response.put("success", true);
	    response.put("data", insShift);
	    return response;
	    
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody InsShift insShift) {
		Map<String, Object> response= new HashMap<String, Object>();
		
		Boolean save = insShiftService.addInsShift(insShift);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Shift Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Shift Failed");
			return response;
		}
		
	}
	
}
