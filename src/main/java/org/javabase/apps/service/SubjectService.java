package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.Subject;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface SubjectService {
	
	public List<Subject> getAllSubjects();
	public List<Subject> getAllSubjectsByParam(Map<String, Object> params);
	public Subject getSubjectById(int subjectId);
	public boolean addSubject(Subject subject);
	public boolean updateSubject(Subject subject);
    public boolean deleteSubject(int subjectId);

}
