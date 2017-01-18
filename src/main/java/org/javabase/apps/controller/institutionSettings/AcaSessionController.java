package org.javabase.apps.controller.institutionSettings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.AcaSession;
import org.javabase.apps.service.AcaSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/acaSession")
public class AcaSessionController {

	@Autowired
	AcaSessionService acaSessionService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/acaSession";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allAcaSession() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<AcaSession> acaSessiontList = acaSessionService.getAllAcaSessions(); 
			
		response.put("success", true);
		response.put("data", acaSessiontList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addAcaSession", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody AcaSession acaSessiont) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = acaSessionService.addAcaSession(acaSessiont);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Session Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Session Failed");
			return response;
		}
		
	}
	
}
