package org.javabase.apps.controller.setup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomInfo;
import org.javabase.apps.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/room")
public class RoomController {
	
	@Autowired
	RoomInfoService roomInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/room";
    }
	
	@ResponseBody
	@RequestMapping(value = "/load",method = RequestMethod.GET)
	public Map<String, Object> roomInfo(@RequestParam Map<String, Object> param) {
		Map<String, Object> response= new HashMap<String, Object>();

		List<RoomInfo> roomList = roomInfoService.getAllRoomInfos();

		response.put("success", true);
		response.put("data", roomList);
		return response;
	}
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody RoomInfo roomInfo) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = roomInfoService.addRoomInfo(roomInfo);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Room Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Room Failed");
			return response;
		}
		
	}
	
}
