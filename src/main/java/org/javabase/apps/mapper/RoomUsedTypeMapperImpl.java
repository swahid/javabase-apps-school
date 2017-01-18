/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomUsedType;
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
public class RoomUsedTypeMapperImpl implements RoomUsedTypeMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(RoomUsedTypeMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<RoomUsedType> getAllRoomUsedTypes() {
		String hql = "FROM RoomUsedType";
		return (List<RoomUsedType>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<RoomUsedType> getAllRoomUsedTypesByParam(Map<String, Object> params) {
		String hql = "FROM RoomUsedType";
		return (List<RoomUsedType>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public RoomUsedType getRoomUsedTypeById(int roomUsedTypeId) {
		return hibernateTemplate.get(RoomUsedType.class, roomUsedTypeId);
	}

	@Override
	@Transactional
	public boolean addRoomUsedType(RoomUsedType roomUsedType) {
		try {
			hibernateTemplate.save(roomUsedType);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateRoomUsedType(RoomUsedType roomUsedType) {
		try {
			hibernateTemplate.update(roomUsedType);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteRoomUsedType(int roomUsedTypeId) {
		try {
			hibernateTemplate.delete(roomUsedTypeId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
