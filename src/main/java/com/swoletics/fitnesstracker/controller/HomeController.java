package com.swoletics.fitnesstracker.controller;

import static com.swoletics.fitnesstracker.util.Constant.HOME_ROUTE;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swoletics.fitnesstracker.service.UserService;

import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get homePage */
@Controller
@ApiIgnore
public class HomeController {
	
	final Logger logger = Logger.getLogger(HomeController.class);

	@Inject UserService userService;
	
  /**
   * Returns home page
   *
   * @param session, {@link HttpSession} of the application context, which cannot be {@code null}.
   * @param model, {@link ModelMap} of the application context, which cannot be {@code null}
   * @return String name of the view or mapping name
   */
  @RequestMapping("/home")
  public String home(HttpSession session, ModelMap model)
  {		
    return HOME_ROUTE;
  }
}
