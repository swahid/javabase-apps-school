package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.User;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface UserMapper {
	
	List<User> getAllUsers();
	User getUserById(int userId);
	User getUserByUsername(String username);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean userExists(String username);

}
