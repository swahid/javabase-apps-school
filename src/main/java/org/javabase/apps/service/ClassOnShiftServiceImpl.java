/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.ClassOnShift;
import org.javabase.apps.mapper.ClassOnShiftMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class ClassOnShiftServiceImpl implements ClassOnShiftService{

	@Autowired
	ClassOnShiftMapper classOnShiftMapper;

	@Override
	public List<ClassOnShift> getAllClassOnShifts() {
		return classOnShiftMapper.getAllClassOnShifts();
	}

	@Override
	public List<ClassOnShift> getAllClassOnShiftsByParam(Map<String, Object> params) {
		return classOnShiftMapper.getAllClassOnShiftsByParam(params);
	}

	@Override
	public ClassOnShift getClassOnShiftById(int classOnShiftId) {
		return classOnShiftMapper.getClassOnShiftById(classOnShiftId);
	}

	@Override
	public boolean addClassOnShift(ClassOnShift classOnShift) {
		return classOnShiftMapper.addClassOnShift(classOnShift);
	}

	@Override
	public boolean updateClassOnShift(ClassOnShift classOnShift) {
		return classOnShiftMapper.updateClassOnShift(classOnShift);
	}

	@Override
	public boolean deleteClassOnShift(int classOnShiftId) {
		return classOnShiftMapper.deleteClassOnShift(classOnShiftId);
	}

}
