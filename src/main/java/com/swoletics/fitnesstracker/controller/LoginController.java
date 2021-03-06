package com.swoletics.fitnesstracker.controller;

import static com.swoletics.fitnesstracker.util.Constant.LOGIN_ROUTE;
import static com.swoletics.fitnesstracker.util.Constant.HOME_ROUTE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.RequestParam;

import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get login */
@Controller
@ApiIgnore
public class LoginController {
	final Logger logger = Logger.getLogger(LoginController.class);

	/**
	 * Redirects user to home page if already logged in
	 * 
	 * @return String, of corresponding view
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectHome() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken)) {

			return "redirect:/home";
		}

		return LOGIN_ROUTE;
	}

	/**
	 * Logs user in based on credentials, if user is already logged in then the user
	 * will be redirected to the home view.
	 * 
	 * @param error,  error message to be displayed
	 * @param logout, logout request
	 * @param model,  {@link Model} of the application context, which cannot be
	 *                {@code null}
	 * @return String, of corresponding view
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		String errorMessge = null;

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (!(auth instanceof AnonymousAuthenticationToken)) {

			/* The user is logged in :) */
			return "redirect:/" + HOME_ROUTE;
		}

		if (error != null) {
			errorMessge = "Username or Password is incorrect !!";
		}
		if (logout != null) {
			errorMessge = "You have been successfully logged out !!";
		}
		model.addAttribute("errorMessge", errorMessge);
		return LOGIN_ROUTE;
	}

	/**
	 * Redirects to login screen if user logs out
	 * 
	 * @param request,  servlet request
	 * @param response, servlet response
	 * @return String, of corresponding view
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout=true";
	}

}
