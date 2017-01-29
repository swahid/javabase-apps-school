package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GivenRole;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface GivenRoleService {
	
	public List<GivenRole> getAllGivenRoles();
	public List<GivenRole> getAllGivenRolesByParam(Map<String, Object> params);
	public GivenRole getGivenRoleById(int givenRoleId);
	public boolean addGivenRole(GivenRole givenRole);
	public boolean updateGivenRole(GivenRole givenRole);
    public boolean deleteGivenRole(int givenRoleId);

}
