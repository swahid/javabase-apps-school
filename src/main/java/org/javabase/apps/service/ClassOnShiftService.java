package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassOnShift;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface ClassOnShiftService {
	
	public List<ClassOnShift> getAllClassOnShifts();
	public List<ClassOnShift> getAllClassOnShiftsByParam(Map<String, Object> params);
	public ClassOnShift getClassOnShiftById(int classOnShiftId);
	public boolean addClassOnShift(ClassOnShift classOnShift);
	public boolean updateClassOnShift(ClassOnShift classOnShift);
    public boolean deleteClassOnShift(int classOnShiftId);

}
