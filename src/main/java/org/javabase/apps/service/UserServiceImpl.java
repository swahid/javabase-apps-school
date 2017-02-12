/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.User;
import org.javabase.apps.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper usermapper;
	
	@Override
	public List<User> getAllUsers() {
		return usermapper.getAllUsers();
	}

	@Override
	public User getUserById(int userId) {
		return usermapper.getUserById(userId);
	}

	@Override
	public boolean addUser(User user) {
		return usermapper.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		usermapper.updateUser(user);
	}

	@Override
	public void deleteUser(int userId) {
		usermapper.deleteUser(userId);
	}

	@Override
	public boolean userExists(String username) {
		return usermapper.userExists(username);
	}

	@Override
	public User getUserByUsername(String username) {
		return usermapper.getUserByUsername(username);
	}

}
