/**
 * 
 */
package org.javabase.apps.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author OITI
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
		@Autowired
		UserDetailsService userDetailsService;
		
		@Autowired
	    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService);
	    }
	     
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    	http.authorizeRequests().and().csrf().disable();
	    	
	    	http.authorizeRequests()
	    	.antMatchers("/resources/**").permitAll()
	    	.antMatchers("/dashboard/**").authenticated()
	    	.antMatchers("/**").permitAll()
//	        .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
	        .and().formLogin().loginPage("/login")
	        .usernameParameter("username").passwordParameter("password")
	        .defaultSuccessUrl("/loginsuccess",true)
	        .failureUrl("/login?error=1")
	        .and().logout().logoutUrl("/logout")
	        .logoutSuccessUrl("/home")
	        .and().exceptionHandling().accessDeniedPage("/404");
	    }
	    
	    
}
