/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Role;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface RoleMapper {
	
	List<Role> getAllUsers();
	Role getRoleById(int roleId);
	boolean addRole(Role role);
	boolean roleExists(String roleName);
}
