package com.swoletics.fitnesstracker.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/*
 *
 * Spring Security Initializer for Registering the Spring Security Filter Chain
 * Registers the {@link DelegatingFilterProxy} to use the
 * springSecurityFilterChain before any other registered {@link Filter}. When
 * used with {@link #AbstractSecurityWebApplicationInitializer(Class...)}, it
 * will also register a {@link ContextLoaderListener}
 *
 * @author Dillan Simpson
 *
 */

public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {}
