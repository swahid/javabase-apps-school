package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Teacher;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface TeacherMapper {
	
	public List<Teacher> getAllTeachers();
	public List<Teacher> getAllTeachersByParam(Map<String, Object> params);
	public Teacher getTeacherById(int teacherId);
	public boolean addTeacher(Teacher teacher);
	public boolean updateTeacher(Teacher teacher);
    public boolean deleteTeacher(int teacherId);

}
