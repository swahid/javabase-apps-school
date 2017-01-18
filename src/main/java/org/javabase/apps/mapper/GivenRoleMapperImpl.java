/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GivenRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class GivenRoleMapperImpl implements GivenRoleMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(GivenRoleMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<GivenRole> getAllGivenRoles() {
		String hql = "FROM GivenRole";
		return (List<GivenRole>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<GivenRole> getAllGivenRolesByParam(Map<String, Object> params) {
		String hql = "FROM GivenRole";
		return (List<GivenRole>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public GivenRole getGivenRoleById(int givenRoleId) {
		return hibernateTemplate.get(GivenRole.class, givenRoleId);
	}

	@Override
	@Transactional
	public boolean addGivenRole(GivenRole givenRole) {
		try {
			hibernateTemplate.save(givenRole);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateGivenRole(GivenRole givenRole) {
		try {
			hibernateTemplate.update(givenRole);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteGivenRole(int givenRoleId) {
		try {
			hibernateTemplate.delete(givenRoleId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
