package com.fitnesstracker.dao;

import com.fitnesstracker.model.FoodLog;
import com.fitnesstracker.model.WorkoutPlans;
import com.fitnesstracker.util.WorkoutPlan;

import java.util.List;

/**
 * This interface outlines the functions to perform operations on {@link FoodLog} with the database.
 *
 * @author Dillan Simpson
 */
public interface WorkoutPlansDao {
  /**
   * Get all stored plans
   * 
   * @param planId, id of workout plan
   */
  public WorkoutPlans getPlanById(int planId);
  
  /**
   * Get all stored plans
   * 
   * @param planName, name of workout plan
   */
  public WorkoutPlans getPlanByName(String planName);

  /**
   * Retrieve list of all {@link WorkoutPlan}s from the database.
   * 
   * @return list of all {@link WorkoutPlan}s present in the database table.
   */
  public List<WorkoutPlans> getAllPlans();
  
}
