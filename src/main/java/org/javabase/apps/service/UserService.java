package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.User;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface UserService {
	
	List<User> getAllUsers();
	User getUserById(int userId);
	User getUserByUsername(String username);
    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    boolean userExists(String username);

}
