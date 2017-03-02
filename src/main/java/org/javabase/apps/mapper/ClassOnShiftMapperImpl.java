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

    private static final Logger log = LoggerFactory.getLogger(ClassOnShiftMapperImpl.class);
	
    @Autowired
	SessionFactory session;
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassOnShift> getAllClassOnShifts() {
		return session.getCurrentSession().createCriteria(ClassOnShift.class).list();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassOnShift> getAllClassOnShiftsByParam(Map<String, Object> params) {
		return session.getCurrentSession().createCriteria(ClassOnShift.class).list();
	}

	@Override
	@Transactional(readOnly=true)
	public ClassOnShift getClassOnShiftById(int classOnShiftId) {
		return (ClassOnShift) session.getCurrentSession().get(ClassOnShift.class, classOnShiftId);
	}

	@Override
	@Transactional
	public boolean addClassOnShift(ClassOnShift classOnShift) {
		try {
			session.getCurrentSession().save(classOnShift);
			
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
			session.getCurrentSession().update(classOnShift);
			
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
			session.getCurrentSession().delete(classOnShiftId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
