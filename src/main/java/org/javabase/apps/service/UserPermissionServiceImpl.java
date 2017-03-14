/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.UserPermission;
import org.javabase.apps.mapper.UserPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Service
public class UserPermissionServiceImpl implements UserPermissionService{
    
    @Autowired
    UserPermissionMapper mapper;

    @Override
    @Transactional(readOnly=true)
    public List<UserPermission> getAllByList() {
        return mapper.getAllByList();
    }

}
