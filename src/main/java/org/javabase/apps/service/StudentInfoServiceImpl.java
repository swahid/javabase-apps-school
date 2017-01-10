/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.StudentInfo;
import org.javabase.apps.mapper.StudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService{

	@Autowired
	StudentInfoMapper studentInfoMapper;

	@Override
	public List<StudentInfo> getAllStudentInfos() {
		return studentInfoMapper.getAllStudentInfos();
	}

	@Override
	public List<StudentInfo> getAllStudentInfosByParam(Map<String, Object> params) {
		return studentInfoMapper.getAllStudentInfosByParam(params);
	}

	@Override
	public StudentInfo getStudentInfoById(int studentInfoId) {
		return studentInfoMapper.getStudentInfoById(studentInfoId);
	}

	@Override
	public boolean addStudentInfo(StudentInfo studentInfo) {
		return studentInfoMapper.addStudentInfo(studentInfo);
	}

	@Override
	public boolean updateStudentInfo(StudentInfo studentInfo) {
		return studentInfoMapper.updateStudentInfo(studentInfo);
	}

	@Override
	public boolean deleteStudentInfo(int studentInfoId) {
		return studentInfoMapper.deleteStudentInfo(studentInfoId);
	}
	
	
}
