/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.ClassOnShift;
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
public class ClassOnShiftMapperImpl implements ClassOnShiftMapper{

	@Autowired
	SessionFactory session;
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(ClassOnShiftMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassOnShift> getAllClassOnShifts() {
		String hql = "FROM ClassOnShift";
		return (List<ClassOnShift>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassOnShift> getAllClassOnShiftsByParam(Map<String, Object> params) {
		String hql = "FROM ClassOnShift";
		return (List<ClassOnShift>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public ClassOnShift getClassOnShiftById(int classOnShiftId) {
		return hibernateTemplate.get(ClassOnShift.class, classOnShiftId);
	}

	@Override
	@Transactional
	public boolean addClassOnShift(ClassOnShift classOnShift) {
		try {
			hibernateTemplate.save(classOnShift);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateClassOnShift(ClassOnShift classOnShift) {
		try {
			hibernateTemplate.update(classOnShift);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteClassOnShift(int classOnShiftId) {
		try {
			hibernateTemplate.delete(classOnShiftId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
