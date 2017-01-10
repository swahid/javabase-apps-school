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
public class TeacherServiceImpl implements AcaSessionService{

	@Autowired
	AcaSessionMapper acaSessionMapper;

	@Override
	public List<AcaSession> getAllAcaSessions() {
		return acaSessionMapper.getAllAcaSessions();
	}

	@Override
	public List<AcaSession> getAllAcaSessionsByParam(Map<String, Object> params) {
		return acaSessionMapper.getAllAcaSessionsByParam(params);
	}

	@Override
	public AcaSession getAcaSessionById(int acaSessionId) {
		return acaSessionMapper.getAcaSessionById(acaSessionId);
	}

	@Override
	public boolean addAcaSession(AcaSession acaSession) {
		return acaSessionMapper.addAcaSession(acaSession);
	}

	@Override
	public boolean updateAcaSession(AcaSession acaSession) {
		return acaSessionMapper.updateAcaSession(acaSession);
	}

	@Override
	public boolean deleteAcaSession(int acaSessionId) {
		return acaSessionMapper.deleteAcaSession(acaSessionId);
	}
}
