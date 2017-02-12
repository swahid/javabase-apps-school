/**
 * 
 */
package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
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
	private HibernateTemplate  hibernateTemplate;
	
	@Override
	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		String hql = "FROM User";
		return (List<User>) hibernateTemplate.find(hql);
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserById(int userId) {
		return hibernateTemplate.get(User.class, userId);
	}

	@Override
	@Transactional
	public boolean addUser(User user) {
		try {
			hibernateTemplate.save(user);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		hibernateTemplate.delete(userId);
	}

	@Override
	@Transactional(readOnly=true)
	public boolean userExists(String username) {
		String hql = "FROM User";
		List<User> userList = (List<User>) hibernateTemplate.find(hql);
		return userList.size()>0 ? true : false;
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserByUsername(String username) {
		String hql = "FROM User WHERE username = '"+username+"'";
		
		List<User> userList = (List<User>) hibernateTemplate.find(hql);

		if (userList.size()>0) {
			User user = userList.get(0);
			return user;
		}else {
			System.out.println("User Not Found");
			return null;
		}
	}

}
