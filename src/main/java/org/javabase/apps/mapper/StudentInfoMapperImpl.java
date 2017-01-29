/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.StudentInfo;
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
public class StudentInfoMapperImpl implements StudentInfoMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(StudentInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<StudentInfo> getAllStudentInfos() {
		String hql = "FROM StudentInfo";
		return (List<StudentInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<StudentInfo> getAllStudentInfosByParam(Map<String, Object> params) {
		String hql = "FROM StudentInfo";
		return (List<StudentInfo>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public StudentInfo getStudentInfoById(int studentInfoId) {
		return hibernateTemplate.get(StudentInfo.class, studentInfoId);
	}

	@Override
	@Transactional
	public boolean addStudentInfo(StudentInfo studentInfo) {
		try {
			hibernateTemplate.save(studentInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateStudentInfo(StudentInfo studentInfo) {
		try {
			hibernateTemplate.update(studentInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteStudentInfo(int studentInfoId) {
		try {
			hibernateTemplate.delete(studentInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
