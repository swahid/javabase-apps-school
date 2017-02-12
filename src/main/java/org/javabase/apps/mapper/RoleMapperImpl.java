/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@SuppressWarnings("unchecked")
@Repository
public class RoleMapperImpl implements RoleMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	@Override
	@Transactional(readOnly=true)
	public List<Role> getAllUsers() {
		String hql = "FROM Role";
		return (List<Role>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public Role getRoleById(int roleId) {
		return hibernateTemplate.get(Role.class, roleId);
	}

	@Override
	@Transactional
	public boolean addRole(Role role) {
			hibernateTemplate.save(role);
		return false;
	}

	
	@Override
	@Transactional(readOnly=true)
	public boolean roleExists(String roleName) {
		String hql = "FROM Role";
		List<Role> roleList =  (List<Role>) hibernateTemplate.find(hql);
		return roleList.size()>0 ? true : false;
	}

}
