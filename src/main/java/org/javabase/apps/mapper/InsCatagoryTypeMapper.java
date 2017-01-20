package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InsCatagoryType;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InsCatagoryTypeMapper {
	
	public List<InsCatagoryType> getAllInsCatagoryTypes();
	public List<InsCatagoryType> getAllInsCatagoryTypesByParam(Map<String, Object> params);
	public InsCatagoryType getInsCatagoryTypeById(int insCatagoryTypeId);
	public boolean addInsCatagoryType(InsCatagoryType insCatagoryType);
	public boolean updateInsCatagoryType(InsCatagoryType insCatagoryType);
    public boolean deleteInsCatagoryType(int insCatagoryTypeId);

}
