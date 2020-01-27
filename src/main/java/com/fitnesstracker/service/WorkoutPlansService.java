package com.fitnesstracker.service;

import com.fitnesstracker.model.FoodLog;
import com.fitnesstracker.model.WorkoutPlans;
import com.fitnesstracker.util.WorkoutPlan;

import java.util.List;

/**
 * Provide service layer for doing CRUD operations with model {@link FoodLog}.
 *
 * @author Dillan Simpson
 */
public interface WorkoutPlansService {

	/**
	  * This method handles transactions and it's related exceptions of fetching a {@link WorkoutPlan} from the database.
	   * 
	   * @param planId, id of workout plan
	   */
	  public WorkoutPlans getPlanById(int planId);
	  
	  /**
	   * This method handles transactions and it's related exceptions of fetching a
	   * {@link WorkoutPlan} from the database.
	   * 
	   * @param planName, name of workout plan
	   */
	  public WorkoutPlans getPlanByName(String planName);

	  /**
	   * * This method handles transactions and it's related exceptions of fetching a list of {@link WorkoutPlans}
	   *  from the database.
	   * 
	   * @return list of all {@link WorkoutPlans} present in the database table.
	   */
	  public List<WorkoutPlans> getAllPlans();
}
