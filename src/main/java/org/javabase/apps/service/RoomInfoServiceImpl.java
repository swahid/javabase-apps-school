/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.RoomInfo;
import org.javabase.apps.mapper.RoomInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class RoomInfoServiceImpl implements RoomInfoService{

	@Autowired
	RoomInfoMapper roomInfoMapper;

	@Override
	public List<RoomInfo> getAllRoomInfos() {
		return roomInfoMapper.getAllRoomInfos();
	}

	@Override
	public List<RoomInfo> getAllRoomInfosByParam(Map<String, Object> params) {
		return roomInfoMapper.getAllRoomInfosByParam(params);
	}

	@Override
	public RoomInfo getRoomInfoById(int roomInfoId) {
		return roomInfoMapper.getRoomInfoById(roomInfoId);
	}

	@Override
	public boolean addRoomInfo(RoomInfo roomInfo) {
		return roomInfoMapper.addRoomInfo(roomInfo);
	}

	@Override
	public boolean updateRoomInfo(RoomInfo roomInfo) {
		return roomInfoMapper.updateRoomInfo(roomInfo);
	}

	@Override
	public boolean deleteRoomInfo(int roomInfoId) {
		return roomInfoMapper.deleteRoomInfo(roomInfoId);
	}
}
