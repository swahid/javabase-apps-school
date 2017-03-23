/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.javabase.apps.entity.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class RoleMapperImpl implements RoleMapper{

	@Autowired
	private SessionFactory session;
	private static final Logger log = LoggerFactory.getLogger(RoleMapperImpl.class);
	
	@Override
	public List<Role> getAllRoles() {
		return session.getCurrentSession().createCriteria(Role.class).list();
	}
	
	@Override
	public List<Role> getAllRolesByParam(Map<String, Object> params) {
		return session.getCurrentSession().createCriteria(Role.class).list();
	}

	@Override
	public Role getRoleById(int roleId) {
		return (Role) session.getCurrentSession().get(Role.class, roleId);
	}

	@Override
	public boolean addRole(Role role) {
		try {
			session.getCurrentSession().save(role);
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	public boolean updateRole(Role role) {
		try {
			session.getCurrentSession().update(role);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	public boolean deleteRole(int roleId) {
		try {
			session.getCurrentSession().delete(roleId);
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	public boolean isRoleExist(String roleName) {
		try {
		    String hql = "From Role where roleName = :  roleName";
			Query query = session.getCurrentSession().createQuery(hql);
			
			query.setParameter("roleName", roleName);
			
			List<Role> roelList = query.list();
			if (roelList.size()>0) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
	}

}
