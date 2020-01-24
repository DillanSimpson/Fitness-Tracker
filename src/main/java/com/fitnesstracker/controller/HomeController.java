package com.fitnesstracker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fitnesstracker.model.User;

import static com.fitnesstracker.util.Constant.HOME_ROUTE;

import javax.servlet.http.HttpSession;
import org.springframework.security.openid.OpenIDAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/** This controller handles the methods related to get homePage */
@Controller
@ApiIgnore
public class HomeController {

  /**
   * This method get the {@link User} from {@link OpenIDAuthenticationToken} and save attributes
   * into the {@link HttpSession} then return to the appropriate view page.
   *
   * @param token, {@link OpenIDAuthenticationToken} obtained from Spring Security Context.
   * @param session, {@link HttpSession} of the application context, which cannot be {@code null}.
   * @param model, {@link ModelMap} of the application context, which cannot be {@code null}
   * @return String name of the view or mapping name to redirect to {@link CustomErrorController}.
   * @throws JsonProcessingException if there is an issue creating the JSON object in the underlying
   *     method.
   */
  @RequestMapping("/home")
  public String home(OpenIDAuthenticationToken token, HttpSession session, ModelMap model)
      throws JsonProcessingException {
    return HOME_ROUTE;
  }
}
