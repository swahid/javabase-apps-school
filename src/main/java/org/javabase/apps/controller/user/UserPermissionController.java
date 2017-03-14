/**
 * 
 */
package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.UserPermission;
import org.javabase.apps.service.UserPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Controller
@RequestMapping(value="dashboard/userpermssion")
public class UserPermissionController {
    
    private static final Logger log = LoggerFactory.getLogger(UserPermissionController.class);
    
    @Autowired
    UserPermissionService userPermisisonService;
    
    @ResponseBody
    @RequestMapping(value="load", method=RequestMethod.GET)
    public Map<String, Object> loadUserPermission(){
        Map<String, Object> response = new HashMap<>();
        
        List<UserPermission> userPermList = userPermisisonService.getAllByList();
        
        response.put("success", true);
        response.put("data", userPermList);
        log.debug(userPermList.toString());
        return response;
    }

}
