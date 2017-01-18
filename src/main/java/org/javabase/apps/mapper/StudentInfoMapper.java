package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.StudentInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface StudentInfoMapper {
	
	public List<StudentInfo> getAllStudentInfos();
	public List<StudentInfo> getAllStudentInfosByParam(Map<String, Object> params);
	public StudentInfo getStudentInfoById(int studentInfoId);
	public boolean addStudentInfo(StudentInfo studentInfo);
	public boolean updateStudentInfo(StudentInfo studentInfo);
    public boolean deleteStudentInfo(int studentInfoId);

}
