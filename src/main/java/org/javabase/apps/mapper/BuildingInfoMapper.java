package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.BuildingInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface BuildingInfoMapper {
	
	public List<BuildingInfo> getAllBuildingInfos();
	public List<BuildingInfo> getAllBuildingInfosByParam(Map<String, Object> params);
	public BuildingInfo getBuildingInfoById(int buildingInfo);
	public boolean addBuildingInfo(BuildingInfo buildingInfo);
	public boolean updateBuildingInfo(BuildingInfo buildingInfo);
    public boolean deleteBuildingInfo(int buildingInfo);

}
