/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.javabase.apps.entity.InstitutionInfo;
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
public class InstitutionInfoMapperImpl implements InstitutionInfoMapper{

	@Autowired
	SessionFactory session;
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(InstitutionInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<InstitutionInfo> getAllInstitutionInfos() {
		String hql = "FROM InstitutionInfo";
		return (List<InstitutionInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InstitutionInfo> getAllInstitutionInfosByParam(Map<String, Object> params) {
		/*String hql = "FROM InstitutionInfo";
		return (List<InstitutionInfo>) hibernateTemplate.find(hql);
		
		*/
		
		String entryUser = params.get("entryUser").toString();
		String	hql = "FROM InstitutionInfo i where i.entryUser = :entryUser";
		Query query = session.getCurrentSession().createQuery(hql);
		query.setParameter("entryUser", Integer.valueOf(entryUser) );
		
		List<InstitutionInfo> institutionList = query.list();
		
		return institutionList;
	}

	@Override
	@Transactional(readOnly=true)
	public InstitutionInfo getInstitutionInfoById(int institutionInfoId) {
		return hibernateTemplate.get(InstitutionInfo.class, institutionInfoId);
	}

	@Override
	@Transactional
	public boolean addInstitutionInfo(InstitutionInfo institutionInfo) {
		try {
			hibernateTemplate.save(institutionInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInstitutionInfo(InstitutionInfo institutionInfo) {
		try {
			hibernateTemplate.update(institutionInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInstitutionInfo(int institutionInfoId) {
		try {
			hibernateTemplate.delete(institutionInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
