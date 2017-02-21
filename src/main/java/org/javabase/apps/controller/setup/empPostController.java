package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.EmpPost;
import org.javabase.apps.service.EmpPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/empPost")
public class empPostController {
	
	@Autowired
	EmpPostService impPostService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/empPost";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allEmpPost() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<EmpPost> impPostList = impPostService.getAllEmpPosts(); 
			
		response.put("success", true);
		response.put("data", impPostList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody EmpPost impPost) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = impPostService.addEmpPost(impPost);
		
		System.out.println("Calling ............");
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Post Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Post Failed");
			return response;
		}
		
	}
	
}
