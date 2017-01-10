/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsCatagoryType;
import org.javabase.apps.mapper.InsCatagoryTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InsCatagoryTypeServiceImpl implements InsCatagoryTypeService{

	@Autowired
	InsCatagoryTypeMapper insCatagoryTypeMapper;

	@Override
	public List<InsCatagoryType> getAllInsCatagoryTypes() {
		return insCatagoryTypeMapper.getAllInsCatagoryTypes();
	}

	@Override
	public List<InsCatagoryType> getAllInsCatagoryTypesByParam(Map<String, Object> params) {
		return insCatagoryTypeMapper.getAllInsCatagoryTypesByParam(params);
	}

	@Override
	public InsCatagoryType getInsCatagoryTypeById(int insCatagoryTypeId) {
		return insCatagoryTypeMapper.getInsCatagoryTypeById(insCatagoryTypeId);
	}

	@Override
	public boolean addInsCatagoryType(InsCatagoryType insCatagoryType) {
		return insCatagoryTypeMapper.addInsCatagoryType(insCatagoryType);
	}

	@Override
	public boolean updateInsCatagoryType(InsCatagoryType insCatagoryType) {
		return insCatagoryTypeMapper.updateInsCatagoryType(insCatagoryType);
	}

	@Override
	public boolean deleteInsCatagoryType(int insCatagoryTypeId) {
		return insCatagoryTypeMapper.deleteInsCatagoryType(insCatagoryTypeId);
	}
	

}
