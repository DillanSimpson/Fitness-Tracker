package com.swoletics.fitnesstracker.service.impl;

import com.swoletics.fitnesstracker.dao.AuthoritiesDao;
import com.swoletics.fitnesstracker.model.Authorities;
import com.swoletics.fitnesstracker.service.AuthoritiesService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Provides implementation for all the methods in the {@link AuthoritiesService}
 *
 * @author Dillan Simpson
 */

@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {

	private AuthoritiesDao authoritiesDao;
	final Logger logger = Logger.getLogger(AuthoritiesServiceImpl.class);

	/**
	 * Constructor to inject userDao
	 *
	 * @param userDao
	 */
	@Autowired
	public AuthoritiesServiceImpl(AuthoritiesDao authoritiesDao) {
		this.authoritiesDao = authoritiesDao;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void addAuthority(Authorities authorities) {
		try {
			authoritiesDao.addAuthority(authorities);
		} catch (DataAccessException ex) {
			// TODO
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteUser(String userId) {
		try {
			authoritiesDao.deleteAuthority(userId);
		} catch (DataAccessException ex) {
			// TODO Exception Handler
		}
	}
}
