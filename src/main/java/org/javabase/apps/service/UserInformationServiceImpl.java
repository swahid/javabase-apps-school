/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.UserInformation;
import org.javabase.apps.mapper.UserInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Service
public class UserInformationServiceImpl implements UserInformationService{

    @Autowired
    UserInformationMapper mapper;
    
    @Override
    @Transactional(readOnly=true)
    public List<UserInformation> getAllUserInformation() {
        return mapper.getAllUserInformation();
    }

    @Override
    @Transactional(readOnly=true)
    public UserInformation getUserInfoById(int userInfoId) {
        return mapper.getUserInfoById(userInfoId);
    }

    @Override
    @Transactional
    public Boolean save(UserInformation userInformation) {
        return mapper.save(userInformation);
    }

    @Override
    @Transactional
    public Boolean update(UserInformation userInformation) {
        return mapper.update(userInformation);
    }

    @Override
    @Transactional
    public Boolean delete(UserInformation userInformation) {
        return mapper.delete(userInformation);
    }

}
