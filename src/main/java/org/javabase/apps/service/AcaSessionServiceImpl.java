/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.AcaSession;
import org.javabase.apps.mapper.AcaSessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class AcaSessionServiceImpl implements AcaSessionService{

	@Autowired
	AcaSessionMapper acasessionmapper;
	
	@Override
	public List<AcaSession> getAllAcaSessions() {
		return acasessionmapper.getAllAcaSessions();
	}
	
	@Override
	public List<AcaSession> getAllAcaSessionsByParam(Map<String, Object> params) {
		return acasessionmapper.getAllAcaSessionsByParam(params);
	}

	@Override
	public AcaSession getAcaSessionById(int acaSessionId) {
		return acasessionmapper.getAcaSessionById(acaSessionId);
	}

	@Override
	public boolean addAcaSession(AcaSession acaSession) {
			return acasessionmapper.addAcaSession(acaSession);
	}

	@Override
	public boolean updateAcaSession(AcaSession acaSession) {
			return acasessionmapper.updateAcaSession(acaSession);
	}

	@Override
	public boolean deleteAcaSession(int acaSessionId) {
			return acasessionmapper.deleteAcaSession(acaSessionId);
	}

}
