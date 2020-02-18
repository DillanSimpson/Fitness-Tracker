package com.swoletics.fitnesstracker.controller;

import static com.swoletics.fitnesstracker.util.Constant.ACCOUNT_ROUTE;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get account page */
@Controller
@ApiIgnore
public class AccountController {

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
		return ACCOUNT_ROUTE;
	}
}
