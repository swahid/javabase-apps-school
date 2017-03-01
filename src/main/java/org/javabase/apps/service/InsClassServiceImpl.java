/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsClass;
import org.javabase.apps.mapper.InsClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InsClassServiceImpl implements InsClassService{

	@Autowired
	InsClassMapper insClassMapper;

	@Override
	public List<InsClass> getAllInsClasss() {
		return insClassMapper.getAllInsClasss();
	}

	@Override
	public List<InsClass> getAllInsClasssByParam(Map<String, Object> params) {
		return insClassMapper.getAllInsClasssByParam(params);
	}

	@Override
	public InsClass getInsClassById(int insClassId) {
		return insClassMapper.getInsClassById(insClassId);
	}

	@Override
	public boolean addInsClass(InsClass insClass) {
		return insClassMapper.addInsClass(insClass);
	}

	@Override
	public boolean updateInsClass(InsClass insClass) {
		return insClassMapper.updateInsClass(insClass);
	}

	@Override
	public boolean deleteInsClass(int insClassId) {
		return insClassMapper.deleteInsClass(insClassId);
	}

    @Override
    public List<InsClass> getClassByShift(int shiftId) {
        return insClassMapper.getClassByShift(shiftId);
    }

}
