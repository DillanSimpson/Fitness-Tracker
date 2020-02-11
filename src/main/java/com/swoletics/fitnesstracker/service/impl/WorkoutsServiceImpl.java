package com.swoletics.fitnesstracker.service.impl;

import com.swoletics.fitnesstracker.dao.WorkoutsDao;
import com.swoletics.fitnesstracker.model.Workouts;
import com.swoletics.fitnesstracker.service.FoodLogService;
import com.swoletics.fitnesstracker.service.WorkoutsService;

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
	public void addWorkout(Workouts workout) {
		try {
			workoutsDao.addWorkout(workout);
		} catch (DataAccessException ex) {
			// TODO
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Workouts> getWorkouts(int userId) {
		try {
			return workoutsDao.getWorkouts(userId);
		} catch (DataAccessException ex) {
			// TODO
		}
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteWorkout(int workoutId) {
		try {
			workoutsDao.deleteWorkout(workoutId);
		} catch (DataAccessException ex) {
			// TODO
		}
	}
}
