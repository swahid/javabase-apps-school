/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.javabase.apps.entity.InsClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class InsClassMapperImpl implements InsClassMapper{

    private static final Logger log = LoggerFactory.getLogger(InsClassMapperImpl.class);
	
    @Autowired
	SessionFactory session;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<InsClass> getAllInsClasss() {
		return session.getCurrentSession().createCriteria(InsClass.class).list();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<InsClass> getAllInsClasssByParam(Map<String, Object> params) {
		String shiftParam = params.get("shiftParam").toString();
		String hql = null;
		Query query = null;
		
		if (!StringUtils.isEmpty(shiftParam)) {
		    hql = "From InsClass where insShiftId = :insShiftId";
		    query= session.getCurrentSession().createQuery(hql);
		    query.setParameter("insShiftId", Integer.valueOf(shiftParam));
        }
		
		List<InsClass> classList = query.list();
		
		return classList;
	}

	@Override
	@Transactional(readOnly=true)
	public InsClass getInsClassById(int insClassId) {
		return (InsClass) session.getCurrentSession().get(InsClass.class, insClassId);
	}

	@Override
	@Transactional
	public boolean addInsClass(InsClass insClass) {
		try {
			session.getCurrentSession().save(insClass);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateInsClass(InsClass insClass) {
		try {
			session.getCurrentSession().update(insClass);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteInsClass(int insClassId) {
		try {
			session.getCurrentSession().delete(insClassId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

    @Override
    @Transactional(readOnly=true)
    public List<InsClass> getClassByShift(int shiftId) {
        
        String hql = "Select c.* From ins_class c"+
                     " join class_on_shift cs on c.class_id = cs.class_id"+
                     " where cs.ins_shift_id = :shiftId";
        
        Query query = (Query) session.getCurrentSession().createSQLQuery(hql).addEntity(InsClass.class);
        
        query.setParameter("shiftId", shiftId);
        
        List<InsClass> list = query.list();
        return list;
    }

}
