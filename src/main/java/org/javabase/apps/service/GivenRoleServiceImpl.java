/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GivenRole;
import org.javabase.apps.mapper.GivenRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class GivenRoleServiceImpl implements GivenRoleService{

	@Autowired
	GivenRoleMapper givenRoleMapper;

	@Override
	public List<GivenRole> getAllGivenRoles() {
		return givenRoleMapper.getAllGivenRoles();
	}

	@Override
	public List<GivenRole> getAllGivenRolesByParam(Map<String, Object> params) {
		return givenRoleMapper.getAllGivenRolesByParam(params);
	}

	@Override
	public GivenRole getGivenRoleById(int givenRoleId) {
		return givenRoleMapper.getGivenRoleById(givenRoleId);
	}

	@Override
	public boolean addGivenRole(GivenRole givenRole) {
		return givenRoleMapper.addGivenRole(givenRole);
	}

	@Override
	public boolean updateGivenRole(GivenRole givenRole) {
		return givenRoleMapper.updateGivenRole(givenRole);
	}

	@Override
	public boolean deleteGivenRole(int givenRoleId) {
		return givenRoleMapper.deleteGivenRole(givenRoleId);
	}
	
}
