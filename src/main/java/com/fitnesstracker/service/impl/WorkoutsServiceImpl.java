package com.fitnesstracker.service.impl;

import com.fitnesstracker.dao.WorkoutsDao;
import com.fitnesstracker.model.Workouts;
import com.fitnesstracker.service.FoodLogService;
import com.fitnesstracker.service.WorkoutsService;

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
public class WorkoutsServiceImpl implements WorkoutsService {

	private WorkoutsDao workoutsDao;
	final Logger logger = Logger.getLogger(WorkoutsServiceImpl.class);

	/**
	 * Constructor to inject workoutsDao
	 *
	 * @param workoutsDao
	 */
	@Autowired
	public WorkoutsServiceImpl(WorkoutsDao workoutsDao) {
		this.workoutsDao = workoutsDao;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public Workouts addWorkout(Workouts workout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Workouts> getWorkouts(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteWorkout(int workoutId) {
		// TODO Auto-generated method stub
		
	}
}
