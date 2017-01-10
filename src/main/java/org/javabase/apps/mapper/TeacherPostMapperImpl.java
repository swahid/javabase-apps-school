/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherPost;
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
public class TeacherPostMapperImpl implements TeacherPostMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(TeacherPostMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<TeacherPost> getAllTeacherPosts() {
		String hql = "FROM TeacherPost";
		return (List<TeacherPost>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<TeacherPost> getAllTeacherPostsByParam(Map<String, Object> params) {
		String hql = "FROM TeacherPost";
		return (List<TeacherPost>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public TeacherPost getTeacherPostById(int teacherPostId) {
		return hibernateTemplate.get(TeacherPost.class, teacherPostId);
	}

	@Override
	@Transactional
	public boolean addTeacherPost(TeacherPost teacherPost) {
		try {
			hibernateTemplate.save(teacherPost);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateTeacherPost(TeacherPost teacherPost) {
		try {
			hibernateTemplate.update(teacherPost);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteTeacherPost(int teacherPostId) {
		try {
			hibernateTemplate.delete(teacherPostId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
