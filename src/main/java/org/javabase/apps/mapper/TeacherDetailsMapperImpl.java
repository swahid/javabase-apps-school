/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherDetails;
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
public class TeacherDetailsMapperImpl implements TeacherDetailsMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(TeacherDetailsMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<TeacherDetails> getAllTeacherDetailss() {
		String hql = "FROM TeacherDetails";
		return (List<TeacherDetails>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<TeacherDetails> getAllTeacherDetailssByParam(Map<String, Object> params) {
		String hql = "FROM TeacherDetails";
		return (List<TeacherDetails>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public TeacherDetails getTeacherDetailsById(int teacherDetailsId) {
		return hibernateTemplate.get(TeacherDetails.class, teacherDetailsId);
	}

	@Override
	@Transactional
	public boolean addTeacherDetails(TeacherDetails teacherDetails) {
		try {
			hibernateTemplate.save(teacherDetails);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateTeacherDetails(TeacherDetails teacherDetails) {
		try {
			hibernateTemplate.update(teacherDetails);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteTeacherDetails(int teacherDetailsId) {
		try {
			hibernateTemplate.delete(teacherDetailsId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
