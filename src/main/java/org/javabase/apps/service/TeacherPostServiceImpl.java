/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.TeacherPost;
import org.javabase.apps.mapper.TeacherPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class TeacherPostServiceImpl implements TeacherPostService{

	@Autowired
	TeacherPostMapper teacherPostMapper;

	@Override
	public List<TeacherPost> getAllTeacherPosts() {
		return teacherPostMapper.getAllTeacherPosts();
	}

	@Override
	public List<TeacherPost> getAllTeacherPostsByParam(Map<String, Object> params) {
		return teacherPostMapper.getAllTeacherPostsByParam(params);
	}

	@Override
	public TeacherPost getTeacherPostById(int teacherPostId) {
		return teacherPostMapper.getTeacherPostById(teacherPostId);
	}

	@Override
	public boolean addTeacherPost(TeacherPost teacherPost) {
		return teacherPostMapper.addTeacherPost(teacherPost);
	}

	@Override
	public boolean updateTeacherPost(TeacherPost teacherPost) {
		return teacherPostMapper.updateTeacherPost(teacherPost);
	}

	@Override
	public boolean deleteTeacherPost(int teacherPostId) {
		return teacherPostMapper.deleteTeacherPost(teacherPostId);
	}

}
