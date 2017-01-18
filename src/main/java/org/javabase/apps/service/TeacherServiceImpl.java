/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Teacher;
import org.javabase.apps.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherMapper TeacherMapper;

	@Override
	public List<Teacher> getAllTeachers() {
		return TeacherMapper.getAllTeachers();
	}

	@Override
	public List<Teacher> getAllTeachersByParam(Map<String, Object> params) {
		return TeacherMapper.getAllTeachersByParam(params);
	}

	@Override
	public Teacher getTeacherById(int TeacherId) {
		return TeacherMapper.getTeacherById(TeacherId);
	}

	@Override
	public boolean addTeacher(Teacher Teacher) {
		return TeacherMapper.addTeacher(Teacher);
	}

	@Override
	public boolean updateTeacher(Teacher Teacher) {
		return TeacherMapper.updateTeacher(Teacher);
	}

	@Override
	public boolean deleteTeacher(int TeacherId) {
		return TeacherMapper.deleteTeacher(TeacherId);
	}
}
