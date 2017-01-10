package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.GenderName;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface GenderNameMapper {
	
	public List<GenderName> getAllGenderNames();
	public List<GenderName> getAllGenderNamesByParam(Map<String, Object> params);
	public GenderName getGenderNameById(int gardianInfoId);
	public boolean addGenderName(GenderName gardianInfo);
	public boolean updateGenderName(GenderName gardianInfo);
    public boolean deleteGenderName(int gardianInfoId);

}
