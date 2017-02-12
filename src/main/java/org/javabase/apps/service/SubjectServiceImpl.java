/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Subject;
import org.javabase.apps.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectMapper subjectMapper;

	@Override
	public List<Subject> getAllSubjects() {
		return subjectMapper.getAllSubjects();
	}

	@Override
	public List<Subject> getAllSubjectsByParam(Map<String, Object> params) {
		return subjectMapper.getAllSubjectsByParam(params);
	}

	@Override
	public Subject getSubjectById(int subjectId) {
		return subjectMapper.getSubjectById(subjectId);
	}

	@Override
	public boolean addSubject(Subject subject) {
		return subjectMapper.addSubject(subject);
	}

	@Override
	public boolean updateSubject(Subject subject) {
		return subjectMapper.updateSubject(subject);
	}

	@Override
	public boolean deleteSubject(int subjectId) {
		return subjectMapper.deleteSubject(subjectId);
	}
	
}
