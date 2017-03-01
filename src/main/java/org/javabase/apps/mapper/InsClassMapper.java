package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InsClassMapper {
	
	public List<InsClass> getAllInsClasss();
	public List<InsClass> getAllInsClasssByParam(Map<String, Object> params);
	public List<InsClass> getClassByShift(int shiftId);
	public InsClass getInsClassById(int insClassId);
	public boolean addInsClass(InsClass insClass);
	public boolean updateInsClass(InsClass insClass);
    public boolean deleteInsClass(int insClassId);

}
