package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomUsedType;
import org.javabase.apps.service.RoomUsedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/roomUsed")
public class RoomUsedController {
	
	@Autowired
	RoomUsedTypeService roomUsedTypeService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/roomUsed";
    }
	
	@ResponseBody
	@RequestMapping(value = "load",method = RequestMethod.GET)
	public Map<String, Object> allRoomUsed() {
		Map<String, Object> response= new HashMap<String, Object>();
		
		List<RoomUsedType> roomUsedList = roomUsedTypeService.getAllRoomUsedTypes();
			
		response.put("success", true);
		response.put("data", roomUsedList);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody RoomUsedType roomUsedType) {
		Map<String, Object> response= new HashMap<String, Object>();
		
		Boolean save = roomUsedTypeService.addRoomUsedType(roomUsedType);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Building Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Building Failed");
			return response;
		}
		
	}
	
}
