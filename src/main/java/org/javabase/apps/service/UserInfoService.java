package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.UserInfo;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface UserInfoService {
	
	public List<UserInfo> getAllUserInfos();
	public List<UserInfo> getAllUserInfosByParam(Map<String, Object> params);
	public UserInfo getUserInfoById(int userInfoId);
	public boolean addUserInfo(UserInfo userInfo);
	public boolean updateUserInfo(UserInfo userInfo);
    public boolean deleteUserInfo(int userInfoId);

}
