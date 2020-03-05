package com.swoletics.fitnesstracker.controller;

import static com.swoletics.fitnesstracker.util.Constant.USERSETUP_ROUTE;

import java.sql.Date;
import java.util.Calendar;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swoletics.fitnesstracker.model.Authorities;
import com.swoletics.fitnesstracker.model.MemberType;
import com.swoletics.fitnesstracker.model.Role;
import com.swoletics.fitnesstracker.model.User;
import com.swoletics.fitnesstracker.model.UserData;
import com.swoletics.fitnesstracker.service.AuthoritiesService;
import com.swoletics.fitnesstracker.service.UserService;

import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get user setup page */
@Controller
@ApiIgnore
public class UserSetupController {

	final Logger logger = Logger.getLogger(UserSetupController.class);

	@Inject
	UserService userService;

	@Inject
	AuthoritiesService authoritiesService;

	@Autowired
	protected AuthenticationManager authenticationManager;

	/**
	 * Returns user setup page, if user is already signed in redirects home
	 *
	 * @param session, {@link HttpSession} of the application context, which cannot
	 *                 be {@code null}.
	 * @param model,   {@link ModelMap} of the application context, which cannot be
	 *                 {@code null}
	 * @return String name of the view or mapping name
	 */
	@RequestMapping("/userSetup")
	public String userSetup(HttpSession session, ModelMap model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken)) {

			return "redirect:/home";
		}

		return USERSETUP_ROUTE;
	}

	/**
	 * Registers a user
	 * 
	 * @param user,          user object to be set
	 * @param username,      username for {@link User}
	 * @param password,      password for {@link User}
	 * @param enabled,       indicator if {@link User} is active
	 * @param firstName,     first name for {@link UserData}
	 * @param lastName,      last name for {@link UserData}
	 * @param exampleRadios, membership type for {@link UserData}
	 * @param request,       servlet request
	 * @param response,      servelt response
	 * @return String, redirect home after successful registration
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(User user, String username, String password, Boolean enabled, String firstName,
			String lastName, int exampleRadios, HttpServletRequest request,
			HttpServletResponse response) {
		Authorities authorities = new Authorities();
		UserData userData = new UserData();

		// Get Date
		Calendar currenttime = Calendar.getInstance();
		Date today = new Date((currenttime.getTime()).getTime());

		// Default member type
		MemberType memberType = MemberType.TRACKER;

		if (exampleRadios == 1) {
			memberType = MemberType.DIET_PLAN;
		}

		// Set Authority
		authorities.setRole(Role.USER);
		authorities.setUsername(username);

		// Set User
		user.setEnabled(enabled);
		user.setPassword(password);
		user.setUserName(username);
		user.setAuthorities(authorities);

		// Set Objects
		authorities.setUser(user);
		userData.setUser(user);
		user.setUserData(userData);

		// Set User Data details
		userData.setFirstName(firstName);
		userData.setLastName(lastName);
		userData.setUsername(username);
		userData.setPlanId(memberType);
		userData.setDateCreated(today);

		userService.addUser(user);

		authenticateUserAndSetSession(user, request);

		return "redirect:/home";
	}

	/**
	 * Validates the user
	 * 
	 * @param user,    user to be validated
	 * @param request, servlet request
	 */
	private void authenticateUserAndSetSession(User user, HttpServletRequest request) {
		String username = user.getUserName();
		String password = user.getPassword();
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

		// generate session if one doesn't exist
		request.getSession();

		token.setDetails(new WebAuthenticationDetails(request));
		Authentication authenticatedUser = authenticationManager.authenticate(token);

		SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
	}

}