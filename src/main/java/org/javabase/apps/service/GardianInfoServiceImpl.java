/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GardianInfo;
import org.javabase.apps.mapper.GardianInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class GardianInfoServiceImpl implements GardianInfoService{

	@Autowired
	GardianInfoMapper mardianInfoMapper;
	
	@Override
	public List<GardianInfo> getAllGardianInfos() {
		return mardianInfoMapper.getAllGardianInfos();
	}

	@Override
	public List<GardianInfo> getAllGardianInfosByParam(Map<String, Object> params) {
		return mardianInfoMapper.getAllGardianInfosByParam(params);
	}

	@Override
	public GardianInfo getGardianInfoById(int gardianInfoId) {
		return mardianInfoMapper.getGardianInfoById(gardianInfoId);
	}

	@Override
	public boolean addGardianInfo(GardianInfo gardianInfo) {
		return mardianInfoMapper.addGardianInfo(gardianInfo);
	}

	@Override
	public boolean updateGardianInfo(GardianInfo gardianInfo) {
		return mardianInfoMapper.updateGardianInfo(gardianInfo);
	}

	@Override
	public boolean deleteGardianInfo(int gardianInfoId) {
		return mardianInfoMapper.deleteGardianInfo(gardianInfoId);
	}


}
