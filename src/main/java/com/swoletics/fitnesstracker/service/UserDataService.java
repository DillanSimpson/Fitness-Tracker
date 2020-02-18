package com.swoletics.fitnesstracker.service;

import java.util.List;

import com.swoletics.fitnesstracker.model.UserData;

/**
 * Provide service layer for doing CRUD operations with model {@link UserData}.
 *
 * @author Dillan Simpson
 */
public interface UserDataService {

	/**
	 * This method handles transactions and it's related exceptions of saving a user
	 * into the database.
	 *
	 * @param user, cannot be {@code null}
	 */
	void addUserData(UserData user);

	/**
	 * This method handles transactions of getting user by userId from the database.
	 *
	 * @param id, associateId of the user which cannot be {@code null} or empty.
	 * @return {@link UserData} object.
	 */
	UserData getUser(String id);

	/**
	 * This method handles transactions of getting the list of {@link UserData}s
	 * present in the database.
	 *
	 * @return list of {@link UserData}s.
	 */
	List<UserData> getUsersData();

	/**
	 * Delete a {@link UserData} from the database
	 * 
	 * @param userId, id of {@link UserData} to delete
	 */
	public void deleteUserData(String userId);
}
