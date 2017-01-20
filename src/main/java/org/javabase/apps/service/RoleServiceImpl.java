/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Role;
import org.javabase.apps.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleMapper rolemapper;
	
	@Override
	public List<Role> getAllUsers() {
		return rolemapper.getAllUsers();
	}

	@Override
	public Role getRoleById(int roleId) {
		return rolemapper.getRoleById(roleId);
	}

	@Override
	public boolean addRole(Role role) {
		return rolemapper.addRole(role);
	}

	@Override
	public boolean roleExists(String roleName) {
		return rolemapper.roleExists(roleName);
	}

}
