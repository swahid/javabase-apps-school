/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherDetails;
import org.javabase.apps.mapper.TeacherDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class TeacherDetailsServiceImpl implements TeacherDetailsService{

	@Autowired
	TeacherDetailsMapper teacherDetailsMapper;

	@Override
	public List<TeacherDetails> getAllTeacherDetailss() {
		return teacherDetailsMapper.getAllTeacherDetailss();
	}

	@Override
	public List<TeacherDetails> getAllTeacherDetailssByParam(Map<String, Object> params) {
		return teacherDetailsMapper.getAllTeacherDetailssByParam(params);
	}

	@Override
	public TeacherDetails getTeacherDetailsById(int teacherDetailsId) {
		return teacherDetailsMapper.getTeacherDetailsById(teacherDetailsId);
	}

	@Override
	public boolean addTeacherDetails(TeacherDetails teacherDetails) {
		return teacherDetailsMapper.addTeacherDetails(teacherDetails);
	}

	@Override
	public boolean updateTeacherDetails(TeacherDetails teacherDetails) {
		return teacherDetailsMapper.updateTeacherDetails(teacherDetails);
	}

	@Override
	public boolean deleteTeacherDetails(int teacherDetailsId) {
		return teacherDetailsMapper.deleteTeacherDetails(teacherDetailsId);
	}

}
