/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.BuildingInfo;
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
public class BuildingInfoMapperImpl implements BuildingInfoMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(BuildingInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<BuildingInfo> getAllBuildingInfos() {
		String hql = "FROM BuildingInfo";
		return (List<BuildingInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<BuildingInfo> getAllBuildingInfosByParam(Map<String, Object> params) {
		String hql = "FROM BuildingInfo";
		return (List<BuildingInfo>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public BuildingInfo getBuildingInfoById(int buildingInfoId) {
		return hibernateTemplate.get(BuildingInfo.class, buildingInfoId);
	}

	@Override
	@Transactional
	public boolean addBuildingInfo(BuildingInfo buildingInfo) {
		try {
			hibernateTemplate.save(buildingInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateBuildingInfo(BuildingInfo buildingInfo) {
		try {
			hibernateTemplate.update(buildingInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteBuildingInfo(int buildingInfoId) {
		try {
			hibernateTemplate.delete(buildingInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
