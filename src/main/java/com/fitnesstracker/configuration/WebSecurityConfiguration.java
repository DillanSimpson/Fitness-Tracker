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
@ComponentScan(basePackages = "com.cerner.opensource")
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  /*
   * Overrides this method to configure the {@link HttpSecurity}
   *
   * @param http the {@link HttpSecurity} to modify
   *
   * @throws Exception if an error occurs
   *
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.csrf().disable().httpBasic().disable();

    http.authorizeRequests()
        .antMatchers("/home")
        .access("hasRole('ROLE_USER')")
        .antMatchers("/login")
        .permitAll()
        .antMatchers("/loginFailure")
        .permitAll()
        .antMatchers("/github")
        .access("hasRole('ROLE_USER')")
        .antMatchers("/github-callback")
        .access("hasRole('ROLE_USER')")
        .antMatchers("/logoutUser")
        .access("hasRole('ROLE_USER')")
        .antMatchers("/contributionAPI/getCernerAll")
        .permitAll()
        .antMatchers("/contributionAPI/githubUserContributions")
        .permitAll()
        .antMatchers("/users/listUsers")
        .access("hasRole('ROLE_ADMIN')")
        .antMatchers("/githubContributions/getCernerAll")
        .permitAll()
        .and()
        .exceptionHandling()
        .accessDeniedPage("/loginFailure?reason=loginFailure.GENERAL_REASON")
        .and()
        .openidLogin()
        .failureUrl("/error401")
        .loginPage("/login")
        .loginProcessingUrl("/j_spring_openid_security_check")
        .defaultSuccessUrl("/home", true)
        .attributeExchange("https://associates.devcerner.com/accounts")
        .attribute("email")
        .type("http://axschema.org/contact/email")
        .required(true)
        .and()
        .attribute("firstName")
        .type("http://axschema.org/namePerson/first")
        .required(true)
        .and()
        .attribute("lastName")
        .type("http://axschema.org/namePerson/last")
        .required(true)
        .and()
        .attribute("associateId")
        .type("http://axschema.org/namePerson/friendly")
        .required(true);

    http.authorizeRequests()
        .and()
        .logout()
        .logoutUrl("/logout")
        .logoutSuccessUrl("https://associates.devcerner.com/accounts/logout")
        .deleteCookies("JSESSIONID");
  }
}
