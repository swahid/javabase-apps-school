package org.javabase.apps.controller.institutionSettings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/acaSession")
public class AcaSessionController {

	/*@Autowired
	AcaSessionService acaSessionService;*/
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/acaSession";
    }
	
	/*@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allAcaSession() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<AcaSession> acaSessiontList = acaSessiontService.getAllAcaSessions(); 
			
		response.put("success", true);
		response.put("data", acaSessiontList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="addAcaSession", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody AcaSession acaSessiont) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = acaSessiontService.addAcaSession(acaSessiont);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Session Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Session Failed");
			return response;
		}
		
	}*/
	
}
