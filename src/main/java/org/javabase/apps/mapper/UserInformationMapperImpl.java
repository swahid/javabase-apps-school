/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class UserInformationMapperImpl implements UserInformationMapper{
    
    @Autowired
    SessionFactory session;

    
    @Override
    public List<UserInformation> getAllUserInformation() {
        return session.getCurrentSession().createCriteria(UserInformation.class).list();
    }

    @Override
    public UserInformation getUserInfoById(int userInfoId) {
        return (UserInformation) session.getCurrentSession().get(UserInformation.class, userInfoId);
    }

    @Override
    public Boolean save(UserInformation userInformation) {
        try {
            session.getCurrentSession().save(userInformation);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        
    }

    @Override
    public Boolean update(UserInformation userInformation) {
        try {
            session.getCurrentSession().merge(userInformation);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean delete(UserInformation userInformation) {
        try {
            session.getCurrentSession().delete(userInformation);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
