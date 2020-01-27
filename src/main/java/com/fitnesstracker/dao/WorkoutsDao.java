package com.fitnesstracker.dao;

import com.fitnesstracker.model.FoodLog;
import com.fitnesstracker.model.Workouts;

import java.util.List;

/**
 * This interface outlines the functions to perform operations on {@link FoodLog} with the database.
 *
 * @author Dillan Simpson
 */
public interface WorkoutsDao {
  /**
   * Add a {@link Workout}
   * 
   * @param workout, workout to add
   */
  public Workouts addWorkout(Workouts workout);
  
  /**
   * Get all workouts for a {@link User}
   * 
   * @param planName, name of workout plan
   */
  public List<Workouts> getWorkouts(int userId);

  /**
   * Delete a {@link Workout} from the database.
   * 
   * @param workoutId, id of {@link Workout} to delete
   */
  public void deleteWorkout(int workoutId);  
}
