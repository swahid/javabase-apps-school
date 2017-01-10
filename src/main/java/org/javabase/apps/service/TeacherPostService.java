package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherPost;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface TeacherPostService {
	
	public List<TeacherPost> getAllTeacherPosts();
	public List<TeacherPost> getAllTeacherPostsByParam(Map<String, Object> params);
	public TeacherPost getTeacherPostById(int teacherPostId);
	public boolean addTeacherPost(TeacherPost teacherPost);
	public boolean updateTeacherPost(TeacherPost teacherPost);
    public boolean deleteTeacherPost(int teacherPostId);

}
