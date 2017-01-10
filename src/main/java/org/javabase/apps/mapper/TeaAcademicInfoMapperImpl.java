/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeaAcademicInfo;
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
public class TeaAcademicInfoMapperImpl implements TeaAcademicInfoMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(TeaAcademicInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<TeaAcademicInfo> getAllTeaAcademicInfos() {
		String hql = "FROM TeaAcademicInfo";
		return (List<TeaAcademicInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<TeaAcademicInfo> getAllTeaAcademicInfosByParam(Map<String, Object> params) {
		String hql = "FROM TeaAcademicInfo";
		return (List<TeaAcademicInfo>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public TeaAcademicInfo getTeaAcademicInfoById(int teaAcademicInfoId) {
		return hibernateTemplate.get(TeaAcademicInfo.class, teaAcademicInfoId);
	}

	@Override
	@Transactional
	public boolean addTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo) {
		try {
			hibernateTemplate.save(teaAcademicInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo) {
		try {
			hibernateTemplate.update(teaAcademicInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteTeaAcademicInfo(int teaAcademicInfoId) {
		try {
			hibernateTemplate.delete(teaAcademicInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
