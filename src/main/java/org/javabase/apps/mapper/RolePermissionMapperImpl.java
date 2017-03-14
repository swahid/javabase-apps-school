/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class RolePermissionMapperImpl implements RolePermissionMapper{
    
    @Autowired
    SessionFactory session;

    @Override
    public List<RolePermission> getAllByList() {
        return session.getCurrentSession().createCriteria(RolePermission.class).list();
    }
    
    

}
