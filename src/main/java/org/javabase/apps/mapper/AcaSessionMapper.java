package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.AcaSession;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface AcaSessionMapper {
	
	public List<AcaSession> getAllAcaSessions();
	public List<AcaSession> getAllAcaSessionsByParam(Map<String, Object> params);
	public AcaSession getAcaSessionById(int acaSessionId);
	public boolean addAcaSession(AcaSession acaSession);
	public boolean updateAcaSession(AcaSession acaSession);
    public boolean deleteAcaSession(int acaSessionId);

}
