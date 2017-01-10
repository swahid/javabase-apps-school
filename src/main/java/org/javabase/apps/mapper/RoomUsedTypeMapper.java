package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomUsedType;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface RoomUsedTypeMapper {
	
	public List<RoomUsedType> getAllRoomUsedTypes();
	public List<RoomUsedType> getAllRoomUsedTypesByParam(Map<String, Object> params);
	public RoomUsedType getRoomUsedTypeById(int roomUsedTypeId);
	public boolean addRoomUsedType(RoomUsedType roomUsedType);
	public boolean updateRoomUsedType(RoomUsedType roomUsedType);
    public boolean deleteRoomUsedType(int roomUsedTypeId);

}
