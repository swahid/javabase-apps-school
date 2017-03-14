/**
 * 
 */
package org.javabase.apps.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Permission;
import org.javabase.apps.service.PermissionService;
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
@RequestMapping(value="dashboard/permssion")
public class PermissionController {
    
    private static final Logger log = LoggerFactory.getLogger(PermissionController.class);
    
    @Autowired
    PermissionService permissionService;
    
    @RequestMapping(method=RequestMethod.GET)
    public String permission(){
        log.debug("permmison Controller");
        return "user/permission";
    }
    
    @ResponseBody
    @RequestMapping(value="load", method=RequestMethod.GET)
    public Map<String, Object> loadPermission(){
        Map<String, Object> response = new HashMap<>();
        
        List<Permission> permissonList = permissionService.getAllbyList();
        
        response.put("success", true);
        response.put("data", permissonList);
        log.debug(permissonList.toString());
        return response;
    }

}
