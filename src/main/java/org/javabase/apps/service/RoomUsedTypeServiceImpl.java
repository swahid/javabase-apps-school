/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomUsedType;
import org.javabase.apps.mapper.RoomUsedTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class RoomUsedTypeServiceImpl implements RoomUsedTypeService{

	@Autowired
	RoomUsedTypeMapper roomUsedTypeMapper;

	@Override
	public List<RoomUsedType> getAllRoomUsedTypes() {
		return roomUsedTypeMapper.getAllRoomUsedTypes();
	}

	@Override
	public List<RoomUsedType> getAllRoomUsedTypesByParam(Map<String, Object> params) {
		return roomUsedTypeMapper.getAllRoomUsedTypesByParam(params);
	}

	@Override
	public RoomUsedType getRoomUsedTypeById(int roomUsedTypeId) {
		return roomUsedTypeMapper.getRoomUsedTypeById(roomUsedTypeId);
	}

	@Override
	public boolean addRoomUsedType(RoomUsedType roomUsedType) {
		return roomUsedTypeMapper.addRoomUsedType(roomUsedType);
	}

	@Override
	public boolean updateRoomUsedType(RoomUsedType roomUsedType) {
		return roomUsedTypeMapper.updateRoomUsedType(roomUsedType);
	}

	@Override
	public boolean deleteRoomUsedType(int roomUsedTypeId) {
		return roomUsedTypeMapper.deleteRoomUsedType(roomUsedTypeId);
	}
	
	
}
