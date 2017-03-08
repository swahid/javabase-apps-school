package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Role;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface RoleMapper {
	
	public List<Role> getAllRoles();
	public List<Role> getAllRolesByParam(Map<String, Object> params);
	public Role getRoleById(int roleId);
	public boolean addRole(Role role);
	public boolean updateRole(Role role);
    public boolean deleteRole(int roleId);
    public boolean isRoleExist(String roleName);

}
