package com.fitnesstracker.service.impl;

import com.fitnesstracker.dao.FoodLogDao;
import com.fitnesstracker.model.FoodLog;
import com.fitnesstracker.service.FoodLogService;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<FoodLog> getDailyLog(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteLog(int logId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateLog(int logId) {
		// TODO Auto-generated method stub
		
	}
}
