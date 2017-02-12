/**
 * 
 */
package org.javabase.apps.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.javabase.apps.entity.Privilege;
import org.javabase.apps.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class UserDetailesServiceImpl implements UserDetailsService{
	
	
	@Autowired
	UserService userservice;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userservice.getUserByUsername(username);
		
		if (user != null) {
			String password = user.getPassword();
			boolean enabled= user.getIsactive().equalsIgnoreCase("Y");
			boolean accountNonExpired = user.getIsnonexpired().equalsIgnoreCase("Y");
			boolean credentialsNonExpired= user.getIsnonexpired().equalsIgnoreCase("Y");
			boolean accountNonLocked= user.getIsnonlocked().equalsIgnoreCase("Y");
			String role = user.getRole().getRolename();
			
			Collection<GrantedAuthority> authorities = getGrantedAuthorities(user.getRole().getPrivilege());
			
			org.springframework.security.core.userdetails.User securedUser = 
					new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securedUser;
		}else {
			 throw new UsernameNotFoundException("Invalid User");
		}
		
	}
	
	private Collection<GrantedAuthority> getGrantedAuthorities(Set<Privilege> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        
        for (Iterator<Privilege> privilege = privileges.iterator(); privilege.hasNext(); ) {
        	Privilege userPrivileage = privilege.next();
        	authorities.add(new SimpleGrantedAuthority(userPrivileage.getPrivilegeName()));
		}
        return authorities;
    }

}
