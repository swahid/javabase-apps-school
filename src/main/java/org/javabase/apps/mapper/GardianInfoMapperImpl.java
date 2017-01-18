/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GardianInfo;
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
public class GardianInfoMapperImpl implements GardianInfoMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(GardianInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<GardianInfo> getAllGardianInfos() {
		String hql = "FROM GardianInfo";
		return (List<GardianInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<GardianInfo> getAllGardianInfosByParam(Map<String, Object> params) {
		String hql = "FROM GardianInfo";
		return (List<GardianInfo>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public GardianInfo getGardianInfoById(int gardianInfoId) {
		return hibernateTemplate.get(GardianInfo.class, gardianInfoId);
	}

	@Override
	@Transactional
	public boolean addGardianInfo(GardianInfo gardianInfo) {
		try {
			hibernateTemplate.save(gardianInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateGardianInfo(GardianInfo gardianInfo) {
		try {
			hibernateTemplate.update(gardianInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteGardianInfo(int gardianInfoId) {
		try {
			hibernateTemplate.delete(gardianInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
