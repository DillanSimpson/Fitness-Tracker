package com.fitnesstracker.service;

import com.fitnesstracker.model.FoodLog;
import com.fitnesstracker.model.Workouts;

import java.util.List;

/**
 * Provide service layer for doing CRUD operations with model {@link FoodLog}.
 *
 * @author Dillan Simpson
 */
public interface WorkoutsService {

	/**
	   * This method handles transactions and it's related exceptions of saving a {@link Workouts} to the database.
	   * 
	   * @param workout, workout to add
	   */
	  public Workouts addWorkout(Workouts workout);
	  
	  /**
	   * This method handles transactions and it's related exceptions of fetching a list of 
	   * {@link Workouts} from the database.
	   * 
	   * @param planName, name of workout plan
	   */
	  public List<Workouts> getWorkouts(int userId);

	  /**
	   * This method handles transactions and it's related exceptions of deleting a {@link Workouts} from the database.
	   * 
	   * @param workoutId, id of {@link Workout} to delete
	   */
	  public void deleteWorkout(int workoutId);
}
