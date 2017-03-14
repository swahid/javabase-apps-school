/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.RolePermission;
import org.javabase.apps.mapper.RolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Service
public class RolePermissionServiceImpl implements RolePermissionService{
    
    @Autowired
    RolePermissionMapper mapper;

    @Override
    @Transactional(readOnly=true)
    public List<RolePermission> getAllByList() {
        return mapper.getAllByList();
    }

}
