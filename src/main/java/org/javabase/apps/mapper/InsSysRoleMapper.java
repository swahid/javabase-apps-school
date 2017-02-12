package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsSysRole;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InsSysRoleMapper {
	
	public List<InsSysRole> getAllInsSysRoles();
	public List<InsSysRole> getAllInsSysRolesByParam(Map<String, Object> params);
	public InsSysRole getInsSysRoleById(int insSysRoleId);
	public boolean addInsSysRole(InsSysRole insSysRole);
	public boolean updateInsSysRole(InsSysRole insSysRole);
    public boolean deleteInsSysRole(int insSysRoleId);

}
