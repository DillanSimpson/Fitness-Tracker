package com.fitnesstracker.controller;

import static com.fitnesstracker.util.Constant.WORKOUTS_ROUTE;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get workout page */
@Controller
@ApiIgnore
public class WorkoutsController {

  /**
   * Returns workouts page
   *
   * @param session, {@link HttpSession} of the application context, which cannot be {@code null}.
   * @param model, {@link ModelMap} of the application context, which cannot be {@code null}
   * @return String name of the view or mapping name
   */
  @RequestMapping("/workouts")
  public String workouts(HttpSession session, ModelMap model)
  {
    return WORKOUTS_ROUTE;
  }
}
