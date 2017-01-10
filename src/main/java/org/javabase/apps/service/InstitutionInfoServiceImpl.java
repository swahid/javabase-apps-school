/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.InstitutionInfo;
import org.javabase.apps.mapper.InstitutionInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InstitutionInfoServiceImpl implements InstitutionInfoService{

	@Autowired
	InstitutionInfoMapper institutionInfoMapper;

	@Override
	public List<InstitutionInfo> getAllInstitutionInfos() {
		return institutionInfoMapper.getAllInstitutionInfos();
	}

	@Override
	public List<InstitutionInfo> getAllInstitutionInfosByParam(Map<String, Object> params) {
		return institutionInfoMapper.getAllInstitutionInfosByParam(params);
	}

	@Override
	public InstitutionInfo getInstitutionInfoById(int acaSessionId) {
		return institutionInfoMapper.getInstitutionInfoById(acaSessionId);
	}

	@Override
	public boolean addInstitutionInfo(InstitutionInfo acaSession) {
		return institutionInfoMapper.addInstitutionInfo(acaSession);
	}

	@Override
	public boolean updateInstitutionInfo(InstitutionInfo acaSession) {
		return institutionInfoMapper.updateInstitutionInfo(acaSession);
	}

	@Override
	public boolean deleteInstitutionInfo(int acaSessionId) {
		return institutionInfoMapper.deleteInstitutionInfo(acaSessionId);
	}

}
