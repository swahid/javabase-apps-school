/**
 * 
 */
package org.javabase.apps.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.javabase.apps.entity.RolePermission;
import org.javabase.apps.entity.User;
import org.javabase.apps.entity.UserPermission;
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
			boolean accountNonExpired = user.isAccountNonExpired();
			boolean credentialsNonExpired= user.isCredintialNonExpired();
			boolean accountNonLocked= user.isNonLocked();
			
			Collection<GrantedAuthority> authorities = getGrantedAuthorities(user);
			
			org.springframework.security.core.userdetails.User securedUser = 
					new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securedUser;
		}else {
			 throw new UsernameNotFoundException("Invalid User");
		}
		
	}
	
	private Collection<GrantedAuthority> getGrantedAuthorities(User user) {
        List<GrantedAuthority> authoritiesRole = new ArrayList<>();
        String roleName = user.getRole().getRoleName();
        roleName = "ROLE_"+roleName.toUpperCase();
        authoritiesRole.add(new SimpleGrantedAuthority(roleName));
        for (Iterator<RolePermission> rolePermission = user.getRole().getRolePermissions().iterator(); rolePermission.hasNext(); ) {
        	RolePermission rolePerm = rolePermission.next();
        	authoritiesRole.add(new SimpleGrantedAuthority(rolePerm.getPermission().getPermName()));
        }
        for (Iterator<UserPermission> userPermission = user.getUserPermissions().iterator(); userPermission.hasNext(); ) {
        	UserPermission ur = userPermission.next();
        	authoritiesRole.add(new SimpleGrantedAuthority(ur.getPermission().getPermName()));
		}
        return authoritiesRole;
    }

}
