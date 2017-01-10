package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsShift;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InsShiftMapper {
	
	public List<InsShift> getAllInsShifts();
	public List<InsShift> getAllInsShiftsByParam(Map<String, Object> params);
	public InsShift getInsShiftById(int insShiftId);
	public boolean addInsShift(InsShift insShift);
	public boolean updateInsShift(InsShift insShift);
    public boolean deleteInsShift(int insShiftId);

}
