/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsCatagoryType;
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
public class InsCatagoryTypeMapperImpl implements InsCatagoryTypeMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(InsCatagoryTypeMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<InsCatagoryType> getAllInsCatagoryTypes() {
		String hql = "FROM InsCatagoryType";
		return (List<InsCatagoryType>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InsCatagoryType> getAllInsCatagoryTypesByParam(Map<String, Object> params) {
		String hql = "FROM InsCatagoryType";
		return (List<InsCatagoryType>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public InsCatagoryType getInsCatagoryTypeById(int insCatagoryTypeId) {
		return hibernateTemplate.get(InsCatagoryType.class, insCatagoryTypeId);
	}

	@Override
	@Transactional
	public boolean addInsCatagoryType(InsCatagoryType insCatagoryType) {
		try {
			hibernateTemplate.save(insCatagoryType);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInsCatagoryType(InsCatagoryType insCatagoryType) {
		try {
			hibernateTemplate.update(insCatagoryType);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInsCatagoryType(int insCatagoryTypeId) {
		try {
			hibernateTemplate.delete(insCatagoryTypeId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
