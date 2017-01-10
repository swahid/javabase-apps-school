/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.BuildingInfo;
import org.javabase.apps.mapper.BuildingInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class BuildingInfoServiceImpl implements BuildingInfoService{

	@Autowired
	BuildingInfoMapper buildinginfomapper;
	
	@Override
	public List<BuildingInfo> getAllBuildingInfos() {
		return buildinginfomapper.getAllBuildingInfos();
	}
	
	@Override
	public List<BuildingInfo> getAllBuildingInfosByParam(Map<String, Object> params) {
		return buildinginfomapper.getAllBuildingInfosByParam(params);
	}

	@Override
	public BuildingInfo getBuildingInfoById(int buildinginfomapperId) {
		return buildinginfomapper.getBuildingInfoById(buildinginfomapperId);
	}

	@Override
	public boolean addBuildingInfo(BuildingInfo buildinginfo) {
		return buildinginfomapper.addBuildingInfo(buildinginfo);
	}

	@Override
	public boolean updateBuildingInfo(BuildingInfo buildingInfo) {
			return buildinginfomapper.updateBuildingInfo(buildingInfo);
	}

	@Override
	@Transactional
	public boolean deleteBuildingInfo(int buildingInfoId) {
			return buildinginfomapper.deleteBuildingInfo(buildingInfoId);
	}

}
