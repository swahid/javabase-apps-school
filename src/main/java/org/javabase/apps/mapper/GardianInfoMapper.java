package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GardianInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface GardianInfoMapper {
	
	public List<GardianInfo> getAllGardianInfos();
	public List<GardianInfo> getAllGardianInfosByParam(Map<String, Object> params);
	public GardianInfo getGardianInfoById(int gardianInfoId);
	public boolean addGardianInfo(GardianInfo gardianInfo);
	public boolean updateGardianInfo(GardianInfo gardianInfo);
    public boolean deleteGardianInfo(int gardianInfoId);

}
