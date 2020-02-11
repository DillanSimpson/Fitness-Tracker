package com.swoletics.fitnesstracker.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * {@Configuration} Indicates that a class declares one or more
 * {@link Bean @Bean} methods and may be processed by the Spring
 * container to generate bean definitions and service requests
 * for those beans at runtime
 *
 * {@EnableWebSecurity}  Add this annotation to an {@code @Configuration}
 * class to have the Spring Security configuration defined in any
 * {@link WebSecurityConfigurer} or more likely by extending
 * the {@link WebSecurityConfigurerAdapter} base class and overriding individual methods:
 *
 * {@ComponentScan} Configures component scanning directives for use
 * with @{@link Configuration} classes.
 * Base packages to scan for annotated components
 * <p>{@link #value} is an alias for (and mutually exclusive with) this
 * attribute
 * <p>Use {@link #basePackageClasses} for a type-safe alternative to
 * String-based package names.
 *
 * Provides a convenient base class for creating a {@link WebSecurityConfigurer}
 * instance. The implementation allows customization by overriding methods.
 */

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "com.swoletics.fitnesstracker")
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(HttpSecurity security) throws Exception
    {
     security.httpBasic().disable();
    }
	
	/*@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		
	  auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery(
			"select username,password, enabled from users where username=?")
		.authoritiesByUsernameQuery(
			"select username, role from user_roles where username=?");
	}	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	  http.authorizeRequests()
		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		.and()
		  .formLogin().loginPage("/login").failureUrl("/login?error")
		  .usernameParameter("username").passwordParameter("password")
		.and()
		  .logout().logoutSuccessUrl("/login?logout")
		.and()
		  .exceptionHandling().accessDeniedPage("/403")
		.and()
		  .csrf();
	}*/
}
