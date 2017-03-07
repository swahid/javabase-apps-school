/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.hibernate.SessionFactory;
import org.javabase.apps.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Repository
@SuppressWarnings("unchecked")
public class UserMapperImpl implements UserMapper{

	@Autowired
	private SessionFactory  session;
	
	@Override
	public List<User> getAllUsers() {
		return session.getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public User getUserById(int userId) {
		return (User) session.getCurrentSession().get(User.class, userId);
	}

	@Override
	public boolean addUser(User user) {
		try {
			session.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
	    try {
            session.getCurrentSession().update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public boolean deleteUser(User user) {
	    try {
            session.getCurrentSession().save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public boolean userExists(String username) {
		String hql = "FROM User WHERE username = '"+username+"'";
		List<User> userList = (List<User>) session.getCurrentSession().createQuery(hql).list();
		return userList.size()>0 ? true : false;
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserByUsername(String username) {
		String hql = "FROM User WHERE username = '"+username+"'";
		
		List<User> userList = session.getCurrentSession().createQuery(hql).list();

		if (userList.size()>0) {
			User user = userList.get(0);
			return user;
		}else {
			System.out.println("User Not Found");
			return null;
		}
	}

}
