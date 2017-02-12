/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.AcaSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class AcaSessionMapperImpl implements AcaSessionMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(AcaSessionMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<AcaSession> getAllAcaSessions() {
		String hql = "FROM AcaSession";
		return (List<AcaSession>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<AcaSession> getAllAcaSessionsByParam(Map<String, Object> params) {
		String hql = "FROM AcaSession";
		return (List<AcaSession>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public AcaSession getAcaSessionById(int acaSessionId) {
		return hibernateTemplate.get(AcaSession.class, acaSessionId);
	}

	@Override
	@Transactional
	public boolean addAcaSession(AcaSession acaSession) {
		try {
			hibernateTemplate.save(acaSession);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateAcaSession(AcaSession acaSession) {
		try {
			hibernateTemplate.update(acaSession);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteAcaSession(int acaSessionId) {
		try {
			hibernateTemplate.delete(acaSessionId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
