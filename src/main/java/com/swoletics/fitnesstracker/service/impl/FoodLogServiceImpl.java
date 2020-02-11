package com.swoletics.fitnesstracker.service.impl;

import com.swoletics.fitnesstracker.dao.FoodLogDao;
import com.swoletics.fitnesstracker.model.FoodLog;
import com.swoletics.fitnesstracker.service.FoodLogService;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Provides implementation for all the methods in the {@link FoodLogService}
 *
 * @author Dillan Simpson
 */
@Service
public class FoodLogServiceImpl implements FoodLogService {

	private FoodLogDao foodLogDao;
	final Logger logger = Logger.getLogger(FoodLogServiceImpl.class);

	/**
	 * Constructor to inject foodLogDao
	 *
	 * @param foodLogDao
	 */
	@Autowired
	public FoodLogServiceImpl(FoodLogDao foodLogDao) {
		this.foodLogDao = foodLogDao;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void addLog(FoodLog log) {
		try {
			foodLogDao.addLog(log);
		} catch (DataAccessException ex) {
			// TODO
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<FoodLog> getDailyLog(int userId) {
		try {
			return foodLogDao.getDailyLog(userId);
		} catch (DataAccessException ex) {
			// TODO
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteLog(int logId) {
		try {
			foodLogDao.deleteLog(logId);
		} catch (DataAccessException ex) {
			// TODO
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateLog(int logId) {
		try {
			foodLogDao.updateLog(logId);
		} catch (DataAccessException ex) {
			// TODO
		}
	}
}
