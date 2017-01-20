/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsSysRole;
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
public class InsSysRoleMapperImpl implements InsSysRoleMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(InsSysRoleMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<InsSysRole> getAllInsSysRoles() {
		String hql = "FROM InsSysRole";
		return (List<InsSysRole>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InsSysRole> getAllInsSysRolesByParam(Map<String, Object> params) {
		String hql = "FROM InsSysRole";
		return (List<InsSysRole>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public InsSysRole getInsSysRoleById(int insSysRoleId) {
		return hibernateTemplate.get(InsSysRole.class, insSysRoleId);
	}

	@Override
	@Transactional
	public boolean addInsSysRole(InsSysRole insSysRole) {
		try {
			hibernateTemplate.save(insSysRole);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInsSysRole(InsSysRole insSysRole) {
		try {
			hibernateTemplate.update(insSysRole);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInsSysRole(int insSysRoleId) {
		try {
			hibernateTemplate.delete(insSysRoleId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
