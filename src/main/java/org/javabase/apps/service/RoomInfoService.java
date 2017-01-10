package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface RoomInfoService {
	
	public List<RoomInfo> getAllRoomInfos();
	public List<RoomInfo> getAllRoomInfosByParam(Map<String, Object> params);
	public RoomInfo getRoomInfoById(int roomInfoId);
	public boolean addRoomInfo(RoomInfo roomInfo);
	public boolean updateRoomInfo(RoomInfo roomInfo);
    public boolean deleteRoomInfo(int roomInfoId);

}
