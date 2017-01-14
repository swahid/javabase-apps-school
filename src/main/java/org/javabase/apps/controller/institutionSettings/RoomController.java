package org.javabase.apps.controller.institutionSettings;

import java.util.HashMap;
import java.util.Map;

import org.javabase.apps.entity.RoomInfo;
import org.javabase.apps.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/room")
public class RoomController {
	
	@Autowired
	RoomInfoService roomInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/room";
    }
	
	@ResponseBody
	@RequestMapping(value="addNewRoom", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody RoomInfo roomInfo) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = roomInfoService.addRoomInfo(roomInfo);
		
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
