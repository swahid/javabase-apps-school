/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsShift;
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
public class InsShiftMapperImpl implements InsShiftMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(InsShiftMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<InsShift> getAllInsShifts() {
		String hql = "FROM InsShift";
		return (List<InsShift>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InsShift> getAllInsShiftsByParam(Map<String, Object> params) {
		String hql = "FROM InsShift";
		return (List<InsShift>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public InsShift getInsShiftById(int insShiftId) {
		return hibernateTemplate.get(InsShift.class, insShiftId);
	}

	@Override
	@Transactional
	public boolean addInsShift(InsShift insShift) {
		try {
			hibernateTemplate.save(insShift);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInsShift(InsShift insShift) {
		try {
			hibernateTemplate.update(insShift);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInsShift(int insShiftId) {
		try {
			hibernateTemplate.delete(insShiftId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
