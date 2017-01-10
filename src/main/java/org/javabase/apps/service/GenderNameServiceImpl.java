/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GenderName;
import org.javabase.apps.mapper.GenderNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class GenderNameServiceImpl implements GenderNameService{

	@Autowired
	GenderNameMapper genderNameMapper;
	
	@Override
	public List<GenderName> getAllGenderNames() {
		return genderNameMapper.getAllGenderNames();
	}
	
	@Override
	public List<GenderName> getAllGenderNamesByParam(Map<String, Object> params) {
		return genderNameMapper.getAllGenderNamesByParam(params);
	}

	@Override
	public GenderName getGenderNameById(int gardianInfoId) {
		return genderNameMapper.getGenderNameById(gardianInfoId);
	}

	@Override
	public boolean addGenderName(GenderName gardianInfo) {
		return genderNameMapper.addGenderName(gardianInfo);
	}

	@Override
	public boolean updateGenderName(GenderName gardianInfo) {
		return genderNameMapper.updateGenderName(gardianInfo);
	}

	@Override
	public boolean deleteGenderName(int gardianInfoId) {
		return genderNameMapper.deleteGenderName(gardianInfoId);
	}

}
