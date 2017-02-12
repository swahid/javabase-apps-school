/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.UserInfo;
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
public class UserInfoMapperImpl implements UserInfoMapper{

	@Autowired
	private HibernateTemplate  hibernateTemplate;
	private static final Logger log = LoggerFactory.getLogger(UserInfoMapperImpl.class);
	
	@Override
	@Transactional(readOnly=true)
	public List<UserInfo> getAllUserInfos() {
		String hql = "FROM UserInfo";
		return (List<UserInfo>) hibernateTemplate.find(hql);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<UserInfo> getAllUserInfosByParam(Map<String, Object> params) {
		String hql = "FROM UserInfo";
		return (List<UserInfo>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public UserInfo getUserInfoById(int userInfoId) {
		return hibernateTemplate.get(UserInfo.class, userInfoId);
	}

	@Override
	@Transactional
	public boolean addUserInfo(UserInfo userInfo) {
		try {
			hibernateTemplate.save(userInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean updateUserInfo(UserInfo userInfoInfo) {
		try {
			hibernateTemplate.update(userInfoInfo);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

	@Override
	@Transactional
	public boolean deleteUserInfo(int userInfoInfoId) {
		try {
			hibernateTemplate.delete(userInfoInfoId);
			
			return true;
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			return false;
		}
	}

}
