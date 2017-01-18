/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
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
public class InsClassMapperImpl implements InsClassMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(InsClassMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<InsClass> getAllInsClasss() {
		String hql = "FROM InsClass";
		return (List<InsClass>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InsClass> getAllInsClasssByParam(Map<String, Object> params) {
		String hql = "FROM InsClass";
		return (List<InsClass>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public InsClass getInsClassById(int insClassId) {
		return hibernateTemplate.get(InsClass.class, insClassId);
	}

	@Override
	@Transactional
	public boolean addInsClass(InsClass insClass) {
		try {
			hibernateTemplate.save(insClass);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInsClass(InsClass insClass) {
		try {
			hibernateTemplate.update(insClass);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInsClass(int insClassId) {
		try {
			hibernateTemplate.delete(insClassId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
