package com.cerner.opensource.controller;

import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ModelMap;

import com.fitnesstracker.model.User;

/**
 * This is a test class for {@link UserController}
 *
 * @author Dillan Simpson
 */
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

  @Mock private User mockUser;
  @Mock private HttpSession mockHttpSession;
  @Mock private ModelMap mockModelMap;
  
}
