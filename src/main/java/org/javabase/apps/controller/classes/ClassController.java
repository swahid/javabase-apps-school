/**
 * 
 */
package org.javabase.apps.controller.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
import org.javabase.apps.service.InsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author OITI
 *
 */
@Controller
@RequestMapping(value = "dashboard/class")
public class ClassController {
	
	@Autowired
	InsClassService insClassService;
	
	@RequestMapping(value="manage",method = RequestMethod.GET)
	private String clases(){
		return "class/class";
	}
	
	@ResponseBody
	@RequestMapping(value = "load", method = RequestMethod.GET)
	public Map<String, Object> classInfo() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<InsClass> classList = insClassService.getAllInsClasss();
		
		response.put("success", true);
		response.put("data", classList);
		return response;
		
	}

}
