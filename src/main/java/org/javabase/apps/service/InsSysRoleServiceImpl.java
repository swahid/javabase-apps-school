/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsSysRole;
import org.javabase.apps.mapper.InsSysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InsSysRoleServiceImpl implements InsSysRoleService{

	@Autowired
	InsSysRoleMapper insSysRoleMapper;

	@Override
	public List<InsSysRole> getAllInsSysRoles() {
		return insSysRoleMapper.getAllInsSysRoles();
	}

	@Override
	public List<InsSysRole> getAllInsSysRolesByParam(Map<String, Object> params) {
		return insSysRoleMapper.getAllInsSysRolesByParam(params);
	}

	@Override
	public InsSysRole getInsSysRoleById(int insSysRoleId) {
		return insSysRoleMapper.getInsSysRoleById(insSysRoleId);
	}

	@Override
	public boolean addInsSysRole(InsSysRole insSysRole) {
		return insSysRoleMapper.addInsSysRole(insSysRole);
	}

	@Override
	public boolean updateInsSysRole(InsSysRole insSysRole) {
		return insSysRoleMapper.updateInsSysRole(insSysRole);
	}

	@Override
	public boolean deleteInsSysRole(int insSysRoleId) {
		return insSysRoleMapper.deleteInsSysRole(insSysRoleId);
	}
}
