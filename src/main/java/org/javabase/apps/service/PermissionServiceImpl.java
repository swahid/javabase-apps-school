/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Permission;
import org.javabase.apps.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Service
public class PermissionServiceImpl implements PermissionService{
    
    @Autowired
    PermissionMapper mapper;

    @Override
    @Transactional(readOnly=true)
    public List<Permission> getAllbyList() {
        return mapper.getAllbyList();
    }

}
