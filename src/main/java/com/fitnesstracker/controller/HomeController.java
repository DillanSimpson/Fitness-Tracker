package com.fitnesstracker.controller;

import static com.fitnesstracker.util.Constant.HOME_ROUTE;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get homePage */
@Controller
@ApiIgnore
public class HomeController {

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
