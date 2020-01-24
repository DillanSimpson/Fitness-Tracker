package com.fitnesstracker.service.impl;

import com.fitnesstracker.dao.UserDao;
import com.fitnesstracker.model.User;
import com.fitnesstracker.service.UserService;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Provides implementation for all the methods in the {@link UserService}
 *
 * @author Dillan Simpson
 */
@Service
public class UserServiceImpl implements UserService {

  private UserDao userDao;
  final Logger logger = Logger.getLogger(UserServiceImpl.class);

  /**
   * Constructor to inject userDao
   *
   * @param userDao
   */
  @Autowired
  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

@Override
public void addUser(User user) {
	// TODO Auto-generated method stub
	
}

@Override
public User getUser(String id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<User> getUsers() {
	// TODO Auto-generated method stub
	return null;
}

}
