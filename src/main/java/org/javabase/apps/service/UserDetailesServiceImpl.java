/**
 * 
 */
package org.javabase.apps.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.javabase.apps.entity.User;
import org.javabase.apps.entity.UserRole;
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
			boolean enabled= user.isActive();
			boolean accountNonExpired = user.isNonExpired();
			boolean credentialsNonExpired= user.isNonExpired();
			boolean accountNonLocked= user.isNonLocked();
			
			Collection<GrantedAuthority> authorities = getGrantedAuthorities(user.getUserRoles());
			
			org.springframework.security.core.userdetails.User securedUser = 
					new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securedUser;
		}else {
			 throw new UsernameNotFoundException("Invalid User");
		}
		
	}
	
	private Collection<GrantedAuthority> getGrantedAuthorities(Set<UserRole> param) {
        List<GrantedAuthority> authoritiesRole = new ArrayList<>();
        
        for (Iterator<UserRole> userRole = param.iterator(); userRole.hasNext(); ) {
        	UserRole role = userRole.next();
        	authoritiesRole.add(new SimpleGrantedAuthority(role.getRole().getRoleName()));
		}
        return authoritiesRole;
    }

}
