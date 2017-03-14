/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class PermissionMapperImpl implements PermissionMapper{
    
    @Autowired
    SessionFactory session;

    @Override
    public List<Permission> getAllbyList() {
        return session.getCurrentSession().createCriteria(Permission.class).list();
    }

}
