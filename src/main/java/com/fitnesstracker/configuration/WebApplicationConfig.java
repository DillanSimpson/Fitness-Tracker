package com.fitnesstracker.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.fitnesstracker.configuration.WebSecurityConfiguration;

/*
 * {@link WebApplicationConfig} extends
 * {@link AbstractAnnotationConfigDispatcherServletInitializer} which
 * is the dispatcher servlet initializer
 * {@link Configuration} Indicates that a class declares one or more
 * {@link Bean @Bean} methods and may be processed by the Spring
 * container to generate bean definitions and service requests
 * for those beans at runtime
 *
 * @author SC064997
 *
 * */

@Configuration
public class WebApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] {WebSecurityConfiguration.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] {AppConfiguration.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/"};
  }
}
