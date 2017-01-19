/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.javabase.apps.entity.RoomInfo;
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
public class RoomInfoMapperImpl implements RoomInfoMapper{

	private static final Logger log = LoggerFactory.getLogger(RoomInfoMapperImpl.class);
	
	@Autowired
	private HibernateTemplate  hibernateTemplate;
	
	@Autowired
	SessionFactory session;
	
	@Override
	@Transactional(readOnly=true)
	public List<RoomInfo> getAllRoomInfos() {
		String hql = "FROM RoomInfo";
		return (List<RoomInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<RoomInfo> getAllRoomInfosByParam(Map<String, Object> params) {
		String hql=null;
		String building = params.get("buildingId").toString();
		String roomUsedId = params.get("roomUsedId").toString();
		if (params.isEmpty()) {
			hql = "FROM RoomInfo";
			return (List<RoomInfo>) hibernateTemplate.find(hql);
		}else {
			hql = "FROM RoomInfo r where r.buildingId = :buildingId and roomUsedId =:roomUsedId";
			Query query = session.getCurrentSession().createQuery(hql);
			query.setParameter("buildingId", Integer.valueOf(roomUsedId) );
			query.setParameter("roomUsedId", Integer.valueOf(roomUsedId));
			
			List<RoomInfo> roomList = query.list();
			
			return roomList;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public RoomInfo getRoomInfoById(int roomInfoId) {
		return hibernateTemplate.get(RoomInfo.class, roomInfoId);
	}

	@Override
	@Transactional
	public boolean addRoomInfo(RoomInfo roomInfo) {
		try {
			hibernateTemplate.save(roomInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateRoomInfo(RoomInfo roomInfo) {
		try {
			hibernateTemplate.update(roomInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteRoomInfo(int roomInfoId) {
		try {
			hibernateTemplate.delete(roomInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
