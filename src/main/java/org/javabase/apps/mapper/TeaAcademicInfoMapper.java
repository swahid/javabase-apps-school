package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeaAcademicInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface TeaAcademicInfoMapper {
	
	public List<TeaAcademicInfo> getAllTeaAcademicInfos();
	public List<TeaAcademicInfo> getAllTeaAcademicInfosByParam(Map<String, Object> params);
	public TeaAcademicInfo getTeaAcademicInfoById(int teaAcademicInfoId);
	public boolean addTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo);
	public boolean updateTeaAcademicInfo(TeaAcademicInfo teaAcademicInfo);
    public boolean deleteTeaAcademicInfo(int teaAcademicInfoId);

}
