package com.swoletics.fitnesstracker.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Values that are used to signify the workout plan of a {@code User}.
 *
 * @author Dillan Simpson
 */
public enum WorkoutPlan {
  KETO("keto"),
  PALEO("paleo"),
  ;

  static final Logger logger = LogManager.getLogger(WorkoutPlan.class);
  private String workoutPlan;

  /**
   * Places the enumerated value into {@code WorkoutPlan}.
   *
   * @param workoutPlan enumerated value to be stored in {@code WorkoutPlan}.
   */
  private WorkoutPlan(String workoutPlan) {
    this.workoutPlan = workoutPlan;
  }

  /**
   * Returns the value stored in {@code WorkoutPlan}.
   *
   * @return value of {@code WorkoutPlan}
   */
  public String getWorkoutPlan() {
    return this.workoutPlan;
  }
}
