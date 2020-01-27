package com.fitnesstracker.service;

import com.fitnesstracker.model.FoodLog;
import java.util.List;

/**
 * Provide service layer for doing CRUD operations with model {@link FoodLog}.
 *
 * @author Dillan Simpson
 */
public interface FoodLogService {

  /**
   * This method handles transactions and it's related exceptions of saving a {@link FoodLog} into the database.
   *
   * @param log object which is not {@code null}
   */
	public void addLog(FoodLog log);

  /**
   * This method handles transactions and it's related exceptions of fetching a list {@link FoodLog}
   * for the day from the database.
   * 
   * @param userId, id of {@User}'s {@link FoodLog} to pull
   * @return list of {@link FoodLog}s present in the database table.
   */
  public List<FoodLog> getDailyLog(int userId);
  
  /**
   * This method handles transactions and it's related exceptions of deleting a {@link FoodLog} from the database.
   * 
   * @param logId, id of log to delete
   * 
   */
  public void deleteLog(int logId);
	  
  /**
   * This method handles transactions and it's related exceptions of updating a {@link FoodLog} in the database.
   * 
   * @param logId, id of log to update
   */
  public void updateLog(int logId);
}
