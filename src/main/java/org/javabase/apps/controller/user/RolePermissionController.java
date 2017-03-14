/**
 * 
 */
package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RolePermission;
import org.javabase.apps.service.RolePermissionService;
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
@RequestMapping(value="dashboard/rolepermssion")
public class RolePermissionController {
    
    private static final Logger log = LoggerFactory.getLogger(RolePermissionController.class);
    
    @Autowired
    RolePermissionService rolePermissionService;
    
    @ResponseBody
    @RequestMapping(value="load", method=RequestMethod.GET)
    public Map<String, Object> loadRolePermission(){
        Map<String, Object> response = new HashMap<>();
        
        List<RolePermission> rolepermList = rolePermissionService.getAllByList();
        
        response.put("success", true);
        response.put("data", rolepermList);
        log.debug(rolepermList.toString());
        return response;
    }
}
