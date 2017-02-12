package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InstitutionInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InstitutionInfoService {
	
	public List<InstitutionInfo> getAllInstitutionInfos();
	public List<InstitutionInfo> getAllInstitutionInfosByParam(Map<String, Object> params);
	public InstitutionInfo getInstitutionInfoById(int acaSessionId);
	public boolean addInstitutionInfo(InstitutionInfo acaSession);
	public boolean updateInstitutionInfo(InstitutionInfo acaSession);
    public boolean deleteInstitutionInfo(int acaSessionId);

}
