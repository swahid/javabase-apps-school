/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Subject;
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
public class SubjectMapperImpl implements SubjectMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(SubjectMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<Subject> getAllSubjects() {
		String hql = "FROM Subject";
		return (List<Subject>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<Subject> getAllSubjectsByParam(Map<String, Object> params) {
		String hql = "FROM Subject";
		return (List<Subject>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public Subject getSubjectById(int subjectId) {
		return hibernateTemplate.get(Subject.class, subjectId);
	}

	@Override
	@Transactional
	public boolean addSubject(Subject subject) {
		try {
			hibernateTemplate.save(subject);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateSubject(Subject subject) {
		try {
			hibernateTemplate.update(subject);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteSubject(int subjectId) {
		try {
			hibernateTemplate.delete(subjectId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
