/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.EmpPost;
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
public class EmpPostMapperImpl implements EmpPostMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(EmpPostMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<EmpPost> getAllEmpPosts() {
		String hql = "FROM EmpPost";
		return (List<EmpPost>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<EmpPost> getAllEmpPostsByParam(Map<String, Object> params) {
		String hql = "FROM EmpPost";
		return (List<EmpPost>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public EmpPost getEmpPostById(int empPostId) {
		return hibernateTemplate.get(EmpPost.class, empPostId);
	}

	@Override
	@Transactional
	public boolean addEmpPost(EmpPost empPost) {
		try {
			hibernateTemplate.save(empPost);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateEmpPost(EmpPost empPost) {
		try {
			hibernateTemplate.update(empPost);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteEmpPost(int empPostId) {
		try {
			hibernateTemplate.delete(empPostId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
