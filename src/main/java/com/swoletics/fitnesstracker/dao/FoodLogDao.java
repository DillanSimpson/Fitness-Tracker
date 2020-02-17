package com.swoletics.fitnesstracker.dao;

import java.util.List;

import com.swoletics.fitnesstracker.model.FoodLog;

/**
 * This interface outlines the functions to perform operations on
 * {@link FoodLog} with the database.
 *
 * @author Dillan Simpson
 */
public interface FoodLogDao {
	/**
	 * Add {@link UserData} object to the database, which must be a JPA entity.
	 *
	 * @param log object which is not {@code null}
	 */
	public void addLog(FoodLog log);

	/**
	 * Retrieve list of {@link FoodLog}s from the database for a day.
	 * 
	 * @param userId, id of {@User}'s {@link FoodLog} to pull
	 * @return list of {@link FoodLog}s present in the database table.
	 */
	public List<FoodLog> getDailyLog(int userId);

	/**
	 * Delete {@link FoodLog} from the database
	 * 
	 * @param logId, id of log to delete
	 * 
	 */
	public void deleteLog(int logId);

	/**
	 * Update {@link FoodLog} from the database
	 * 
	 * @param logId, id of log to update
	 */
	public void updateLog(int logId);

}
