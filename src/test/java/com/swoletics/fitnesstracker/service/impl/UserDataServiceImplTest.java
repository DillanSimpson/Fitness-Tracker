package com.swoletics.fitnesstracker.service.impl;

import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ModelMap;

import com.swoletics.fitnesstracker.model.UserData;

/**
 * This is a test class for {@link UserDataServiceImpl}
 *
 * @author Dillan Simpson
 */
@ExtendWith(MockitoExtension.class)
public class UserDataServiceImplTest {

  @Mock private UserData mockUser;
  @Mock private HttpSession mockHttpSession;
  @Mock private ModelMap mockModelMap;
  
}
