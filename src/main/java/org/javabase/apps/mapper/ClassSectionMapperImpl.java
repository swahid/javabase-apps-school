/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.javabase.apps.entity.ClassSection;
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
public class ClassSectionMapperImpl implements ClassSectionMapper{

	@Autowired
	SessionFactory session;
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(ClassSectionMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassSection> getAllClassSections() {
		String hql = "FROM ClassSection";
		return (List<ClassSection>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ClassSection> getAllClassSectionsByParam(Map<String, Object> params) {
		String classId = params.get("classId").toString();
		String innerHql = "From ClassSection cs " +
						" where cs.classId in (select c.classId from InsClass c where c.classId = :classId)";
		
		Query query = session.getCurrentSession().createQuery(innerHql);
		query.setParameter("classId", Integer.valueOf(classId) );
		
		List<ClassSection> sectionList = query.list();
		
		return sectionList;
	}

	@Override
	@Transactional(readOnly=true)
	public ClassSection getClassSectionById(int classSectionId) {
		return hibernateTemplate.get(ClassSection.class, classSectionId);
	}

	@Override
	@Transactional
	public boolean addClassSection(ClassSection classSection) {
		try {
			hibernateTemplate.save(classSection);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateClassSection(ClassSection classSection) {
		try {
			hibernateTemplate.update(classSection);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteClassSection(int classSectionId) {
		try {
			hibernateTemplate.delete(classSectionId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
