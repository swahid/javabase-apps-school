/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsShift;
import org.javabase.apps.mapper.InsShiftMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InsShiftServiceImpl implements InsShiftService{

	@Autowired
	InsShiftMapper insShiftMapper;

	@Override
	public List<InsShift> getAllInsShifts() {
		return insShiftMapper.getAllInsShifts();
	}

	@Override
	public List<InsShift> getAllInsShiftsByParam(Map<String, Object> params) {
		return insShiftMapper.getAllInsShiftsByParam(params);
	}

	@Override
	public InsShift getInsShiftById(int insShiftId) {
		return insShiftMapper.getInsShiftById(insShiftId);
	}

	@Override
	public boolean addInsShift(InsShift insShift) {
		return insShiftMapper.addInsShift(insShift);
	}

	@Override
	public boolean updateInsShift(InsShift insShift) {
		return insShiftMapper.updateInsShift(insShift);
	}

	@Override
	public boolean deleteInsShift(int insShiftId) {
		return insShiftMapper.deleteInsShift(insShiftId);
	}

}
