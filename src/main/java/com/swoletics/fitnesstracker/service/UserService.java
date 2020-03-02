package com.swoletics.fitnesstracker.service;

import java.util.List;

import com.swoletics.fitnesstracker.model.User;

/**
 * Provide service layer for doing CRUD operations with model {@link User}.
 *
 * @author Dillan Simpson
 */
public interface UserService {

	/**
	 * This method handles transactions and it's related exceptions of saving a user
	 * into the database.
	 *
	 * @param user, cannot be {@code null}
	 */
	void addUser(User user);

	/**
	 * This method handles transactions of getting user by userId from the database.
	 *
	 * @param id, associateId of the user which cannot be {@code null} or empty.
	 * @return {@link User} object.
	 */
	User getUser(String id);

	/**
	 * This method handles transactions of getting user by email from the database.
	 *
	 * @param userData, userData of the user which cannot be {@code null} or empty.
	 * @return {@link User} object.
	 */
	User getUserByEmail(String email);

	/**
	 * This method handles transactions of getting the list of {@link User}s present
	 * in the database.
	 *
	 * @return list of {@link User}s.
	 */
	List<User> getUsers();

	/**
	 * Delete a {@link User} from the database
	 * 
	 * @param userId, id of {@link User} to delete
	 */
	public void deleteUser(String userId);
}
