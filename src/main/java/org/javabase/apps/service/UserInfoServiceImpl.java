/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.UserInfo;
import org.javabase.apps.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	UserInfoMapper userInfoMapper;

	@Override
	public List<UserInfo> getAllUserInfos() {
		return userInfoMapper.getAllUserInfos();
	}

	@Override
	public List<UserInfo> getAllUserInfosByParam(Map<String, Object> params) {
		return userInfoMapper.getAllUserInfosByParam(params);
	}

	@Override
	public UserInfo getUserInfoById(int userInfoId) {
		return userInfoMapper.getUserInfoById(userInfoId);
	}

	@Override
	public boolean addUserInfo(UserInfo userInfo) {
		return userInfoMapper.addUserInfo(userInfo);
	}

	@Override
	public boolean updateUserInfo(UserInfo userInfo) {
		return userInfoMapper.updateUserInfo(userInfo);
	}

	@Override
	public boolean deleteUserInfo(int userInfoId) {
		return userInfoMapper.deleteUserInfo(userInfoId);
	}
}
