package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InstitutionInfo;
import org.javabase.apps.service.InstitutionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/institution")
public class InstitutionController {
	
	@Autowired
	InstitutionInfoService institutionInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String institutionPage() {
        return "institution/institution";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allBuilding() {
		Map<String, Object> response= new HashMap<String, Object>();

		List<InstitutionInfo> institutionList = institutionInfoService.getAllInstitutionInfos();

		response.put("success", true);
		response.put("data", institutionList);
		return response;
	}
	
	@ResponseBody
	@RequestMapping(value="addNewInstitution", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody InstitutionInfo institutionInfo) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = institutionInfoService.addInstitutionInfo(institutionInfo);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Institution Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Institution Failed");
			return response;
		}
	}
	
}
