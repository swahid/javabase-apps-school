/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassSection;
import org.javabase.apps.mapper.ClassSectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class ClassSectionServiceImpl implements ClassSectionService{

	@Autowired
	ClassSectionMapper classSectionMapper;
	
	@Override
	public List<ClassSection> getAllClassSections() {
		return classSectionMapper.getAllClassSections();
	}
	
	@Override
	public List<ClassSection> getAllClassSectionsByParam(Map<String, Object> params) {
		return classSectionMapper.getAllClassSectionsByParam(params);
	}

	@Override
	public ClassSection getClassSectionById(int classSectionId) {
		return classSectionMapper.getClassSectionById(classSectionId);
	}

	@Override
	public boolean addClassSection(ClassSection classSection) {
			return classSectionMapper.addClassSection(classSection);
	}

	@Override
	public boolean updateClassSection(ClassSection classSection) {
		return classSectionMapper.updateClassSection(classSection);
	}

	@Override
	public boolean deleteClassSection(int classSectionId) {
		return classSectionMapper.deleteClassSection(classSectionId);
	}

}
