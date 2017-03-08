/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Role;
import org.javabase.apps.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper mapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Role> getAllRoles() {
		return mapper.getAllRoles();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Role> getAllRolesByParam(Map<String, Object> params) {
		return mapper.getAllRolesByParam(params);
	}

	@Override
	@Transactional(readOnly=true)
	public Role getRoleById(int roleId) {
		return mapper.getRoleById(roleId);
	}

	@Override
	@Transactional
	public boolean addRole(Role role){
		boolean isRoleExist = mapper.isRoleExist(role.getRoleName());
		if (isRoleExist) {
			return mapper.updateRole(role);
		}else {
			return mapper.addRole(role);
		}
	}

	@Override
	@Transactional
	public boolean updateRole(Role role) {
		return mapper.updateRole(role);
	}

	@Override
	@Transactional
	public boolean deleteRole(int roleId) {
		return mapper.deleteRole(roleId);
	}

	@Override
	@Transactional(readOnly=true)
	public boolean isRoleExist(String roleName) {
		return mapper.isRoleExist(roleName);
	}

}
