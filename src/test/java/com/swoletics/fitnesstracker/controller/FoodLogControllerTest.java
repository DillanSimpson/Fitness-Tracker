package com.swoletics.fitnesstracker.controller;

import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ModelMap;

import com.swoletics.fitnesstracker.model.UserData;

/**
 * This is a test class for {@link FoodLogController}
 *
 * @author Dillan Simpson
 */
@ExtendWith(MockitoExtension.class)
public class FoodLogControllerTest {

  @Mock private UserData mockUser;
  @Mock private HttpSession mockHttpSession;
  @Mock private ModelMap mockModelMap;
  
}
