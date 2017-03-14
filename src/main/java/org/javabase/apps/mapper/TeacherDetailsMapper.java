package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherDetails;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface TeacherDetailsMapper {
	
	public List<TeacherDetails> getAllTeacherDetailss();
	public List<TeacherDetails> getAllTeacherDetailssByParam(Map<String, Object> params);
	public TeacherDetails getTeacherDetailsById(int teacherDetailsId);
	public boolean addTeacherDetails(TeacherDetails teacherDetails);
	public boolean updateTeacherDetails(TeacherDetails teacherDetails);
    public boolean deleteTeacherDetails(int teacherDetailsId);

}
