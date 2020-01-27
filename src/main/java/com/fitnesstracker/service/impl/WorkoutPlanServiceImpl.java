package com.fitnesstracker.service.impl;

import com.fitnesstracker.dao.WorkoutPlansDao;
import com.fitnesstracker.model.WorkoutPlans;
import com.fitnesstracker.service.FoodLogService;
import com.fitnesstracker.service.WorkoutPlansService;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public WorkoutPlans getPlanByName(String planName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<WorkoutPlans> getAllPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
