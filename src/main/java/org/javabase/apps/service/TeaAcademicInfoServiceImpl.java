/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeaAcademicInfo;
import org.javabase.apps.mapper.TeaAcademicInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class TeaAcademicInfoServiceImpl implements TeaAcademicInfoService{

	@Autowired
	TeaAcademicInfoMapper teaAcademicInfoMapper;

	@Override
	public List<TeaAcademicInfo> getAllTeaAcademicInfos() {
		return teaAcademicInfoMapper.getAllTeaAcademicInfos();
	}

	@Override
	public List<TeaAcademicInfo> getAllTeaAcademicInfosByParam(Map<String, Object> params) {
		return teaAcademicInfoMapper.getAllTeaAcademicInfos();
	}

	@Override
	public TeaAcademicInfo getTeaAcademicInfoById(int teaAcademicInfoId) {
		return teaAcademicInfoMapper.getTeaAcademicInfoById(teaAcademicInfoId);
	}

	@Override
	public boolean addTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo) {
		return teaAcademicInfoMapper.addTeaAcademicInfo(teaAcademicInfo);
	}

	@Override
	public boolean updateTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo) {
		return teaAcademicInfoMapper.updateTeaAcademicInfo(teaAcademicInfo);
	}

	@Override
	public boolean deleteTeaAcademicInfo(int teaAcademicInfoId) {
		return teaAcademicInfoMapper.deleteTeaAcademicInfo(teaAcademicInfoId);
	}

}
