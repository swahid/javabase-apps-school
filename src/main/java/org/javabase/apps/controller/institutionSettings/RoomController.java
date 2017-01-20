package org.javabase.apps.controller.institutionSettings;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomInfo;
import org.javabase.apps.entity.User;
import org.javabase.apps.service.RoomInfoService;
import org.javabase.apps.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/room")
public class RoomController {
	
	private static final Logger log = LoggerFactory.getLogger(RoomController.class);
	
	@Autowired
	RoomInfoService roomInfoService;
	
	@Autowired
    UserService userservice;
	public User user;
	@RequestMapping(method = RequestMethod.GET)
    public String roomPage() {
        return "institution/room";
    }
	
	@ResponseBody
	@RequestMapping(value = "/load",method = RequestMethod.GET)
	public Map<String, Object> roomInfo(@RequestParam Map<String, Object> param) {
		Map<String, Object> response= new HashMap<String, Object>();
		try {
			System.out.println(param.get("buildingId"));
			System.out.println(param.get("roomUsedId"));
			
			List<RoomInfo> roomList = roomInfoService.getAllRoomInfosByParam(param);
			
			response.put("success", true);
			response.put("data", roomList);
			response.put("draw", "1");
			response.put("recordsFiltered", "10");
			response.put("recordsTotal", "30");
			return response;
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			response.put("success", false);
			response.put("message", "unable to find");
			return response;
		}
		
	}
	@ResponseBody
	@RequestMapping(value="addNewRoom", method = RequestMethod.POST)
	public Map<String, Object> save(@RequestBody RoomInfo roomInfo) {
		Map<String, Object> response= new HashMap<String, Object>();
		try {
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			
			if (principal instanceof UserDetails) {
				String username = ((UserDetails) principal).getUsername();
				 user = userservice.getUserByUsername(username);
			}
			
//			roomInfo.setEntryUser(user.getUserid());
			roomInfo.setEntryDate(new Date());
			Boolean save = roomInfoService.addRoomInfo(roomInfo);
			
	    	
			if (save) {
				response.put("suceess", true);
				response.put("message", "Add Building Sucess");
			}else {
				response.put("error", true);
				response.put("message", "Add Building Failed");
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return response;
		
	}
	
}
