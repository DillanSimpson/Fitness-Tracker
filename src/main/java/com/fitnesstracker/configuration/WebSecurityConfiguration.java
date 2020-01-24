package com.fitnesstracker.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
@ComponentScan(basePackages = "com.fitnesstracker")
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(HttpSecurity security) throws Exception
    {
     security.httpBasic().disable();
    }
}
