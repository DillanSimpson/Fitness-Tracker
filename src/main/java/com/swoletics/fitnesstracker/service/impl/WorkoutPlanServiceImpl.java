package com.swoletics.fitnesstracker.service.impl;

import com.swoletics.fitnesstracker.dao.WorkoutPlansDao;
import com.swoletics.fitnesstracker.model.WorkoutPlans;
import com.swoletics.fitnesstracker.service.FoodLogService;
import com.swoletics.fitnesstracker.service.WorkoutPlansService;

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
public class WorkoutPlanServiceImpl implements WorkoutPlansService {

	private WorkoutPlansDao workoutPlansDao;
	final Logger logger = Logger.getLogger(WorkoutPlanServiceImpl.class);

	/**
	 * Constructor to inject foodLogDao
	 *
	 * @param foodLogDao
	 */
	@Autowired
	public WorkoutPlanServiceImpl(WorkoutPlansDao workoutPlansDao) {
		this.workoutPlansDao = workoutPlansDao;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public WorkoutPlans getPlanById(int planId) {
		try {
			workoutPlansDao.getPlanById(planId);
		} catch (DataAccessException ex) {
			// TODO
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public WorkoutPlans getPlanByName(String planName) {
		try {
			workoutPlansDao.getPlanByName(planName);
		} catch (DataAccessException ex) {
			// TODO
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<WorkoutPlans> getAllPlans() {
		try {
			return workoutPlansDao.getAllPlans();
		} catch (DataAccessException ex) {
			// TODO
		}
		return null;
	}
}
