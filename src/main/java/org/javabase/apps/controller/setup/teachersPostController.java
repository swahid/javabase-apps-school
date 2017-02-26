package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherPost;
import org.javabase.apps.service.TeacherPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/teachersPost")
public class teachersPostController {
	
	@Autowired
	TeacherPostService teacherPostService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/teachersPost";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allTeacherPost() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<TeacherPost> teacherPostList = teacherPostService.getAllTeacherPosts(); 
			
		response.put("success", true);
		response.put("data", teacherPostList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody TeacherPost teacherPost) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = teacherPostService.addTeacherPost(teacherPost);
		
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
