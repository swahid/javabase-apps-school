package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassSection;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface ClassSectionMapper {
	
	public List<ClassSection> getAllClassSections();
	public List<ClassSection> getAllClassSectionsByParam(Map<String, Object> params);
	public ClassSection getClassSectionById(int classSectionId);
	public boolean addClassSection(ClassSection classSection);
	public boolean updateClassSection(ClassSection classSection);
    public boolean deleteClassSection(int classSectionId);

}
