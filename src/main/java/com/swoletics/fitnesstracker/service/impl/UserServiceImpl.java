package com.swoletics.fitnesstracker.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swoletics.fitnesstracker.dao.UserDao;
import com.swoletics.fitnesstracker.model.User;
import com.swoletics.fitnesstracker.service.UserService;

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

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	public List<User> getUsers() {
		try {
			final List<User> usersList = userDao.getUsers();
			if (usersList == null || usersList.isEmpty()) {
				// TODO Exception Handler
			}
			return usersList;
		} catch (DataAccessException ex) {
			// TODO Exception Handler
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUser(String userId) {
		try {
			userDao.deleteUser(userId);
		} catch (DataAccessException ex) {
			// TODO Exception Handler
		}
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}
}
