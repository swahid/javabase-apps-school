package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.UserInformation;

public interface UserInformationService {
    
    public List<UserInformation> getAllUserInformation();
    public UserInformation getUserInfoById(int userInfoId);
    public Boolean save(UserInformation userInformation);
    public Boolean update(UserInformation userInformation);
    public Boolean delete(UserInformation userInformation);

}
