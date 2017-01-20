/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GenderName;
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
public class GenderNameMapperImpl implements GenderNameMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(GenderNameMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<GenderName> getAllGenderNames() {
		String hql = "FROM GenderName";
		return (List<GenderName>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<GenderName> getAllGenderNamesByParam(Map<String, Object> params) {
		String hql = "FROM GenderName";
		return (List<GenderName>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public GenderName getGenderNameById(int gardianInfoId) {
		return hibernateTemplate.get(GenderName.class, gardianInfoId);
	}

	@Override
	@Transactional
	public boolean addGenderName(GenderName gardianInfo) {
		try {
			hibernateTemplate.save(gardianInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateGenderName(GenderName gardianInfo) {
		try {
			hibernateTemplate.update(gardianInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteGenderName(int gardianInfoId) {
		try {
			hibernateTemplate.delete(gardianInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
