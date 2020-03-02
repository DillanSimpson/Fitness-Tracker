package com.swoletics.fitnesstracker.controller;

import static com.swoletics.fitnesstracker.util.Constant.ACCOUNT_ROUTE;

import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swoletics.fitnesstracker.model.User;
import com.swoletics.fitnesstracker.model.UserData;
import com.swoletics.fitnesstracker.service.UserDataService;
import com.swoletics.fitnesstracker.service.UserService;

import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get account page */
@Controller
@ApiIgnore
public class AccountController {
	@Inject
	UserService userService;

	@Inject
	UserDataService userDataService;

	/**
	 * Returns account page
	 *
	 * @param session, {@link HttpSession} of the application context, which cannot
	 *                 be {@code null}.
	 * @param model,   {@link ModelMap} of the application context, which cannot be
	 *                 {@code null}
	 * @return String name of the view or mapping name
	 */
	@RequestMapping("/account")
	public String account(HttpSession session, ModelMap model) {
		String userName = SecurityContextHolder.getContext().getAuthentication().getName();

		// Get objects
		User user = userService.getUserByEmail(userName);
		UserData userData = user.getUserData();

		// Format date
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String date = sdf.format(userData.getDateCreated());

		model.put("user", userData);
		model.put("date", date);

		return ACCOUNT_ROUTE;
	}
}
