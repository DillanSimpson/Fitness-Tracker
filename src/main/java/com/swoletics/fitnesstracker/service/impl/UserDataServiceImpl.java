package com.swoletics.fitnesstracker.service.impl;

import com.swoletics.fitnesstracker.dao.UserDataDao;
import com.swoletics.fitnesstracker.model.UserData;
import com.swoletics.fitnesstracker.service.UserDataService;
import com.swoletics.fitnesstracker.service.UserService;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Provides implementation for all the methods in the {@link UserService}
 *
 * @author Dillan Simpson
 */
@Service
public class UserDataServiceImpl implements UserDataService {

	private UserDataDao userDataDao;
	final Logger logger = Logger.getLogger(UserDataServiceImpl.class);

	/**
	 * Constructor to inject userDao
	 *
	 * @param userDao
	 */
	@Autowired
	public UserDataServiceImpl(UserDataDao userDao) {
		this.userDataDao = userDao;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addUserData(UserData userData) {
		try {
			userDataDao.addUserData(userData);
		} catch (DataAccessException ex) {
			// TODO
		}
	}

	@Override
	public UserData getUser(String id) {
		return userDataDao.getUserData(id);
	}

	@Override
	public List<UserData> getUsersData() {
		try {
	      final List<UserData> usersList = userDataDao.getUsersData();
	      if (usersList == null || usersList.isEmpty()) {
	        //TODO Exception Handler
	      }
	      return usersList;
	    } catch (DataAccessException ex) {
	    	//TODO Exception Handler
	    }
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUserData(String userId) {
		try {
		      userDataDao.deleteUserData(userId);
		    } catch (DataAccessException ex) {
		    	//TODO Exception Handler
		    }
	}
}
