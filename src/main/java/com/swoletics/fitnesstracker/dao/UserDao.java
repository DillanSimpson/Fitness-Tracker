package com.swoletics.fitnesstracker.dao;

import java.util.List;

import com.swoletics.fitnesstracker.model.User;

/**
 * This interface outlines the functions to perform operations on {@link User}
 * with the database.
 *
 * @author Dillan Simpson
 */
public interface UserDao {
	/**
	 * Add {@link User} object to the database, which must be a JPA entity.
	 *
	 * @param user object which is not {@code null}
	 */
	public void addUser(User user);

	/**
	 * Retrieve {@link User} object using user Id.
	 *
	 * @param Id, userId of user which cannot be {@code null} or empty.
	 * @return {@link User} from persistent Objects.
	 */
	public User getUser(String Id);

	/**
	 * Retrieve list of {@link User}s from the database.
	 *
	 * @return list of {@link User}s present in the database table.
	 */
	public List<User> getUsers();

	/**
	 * Delete {@link User} from the database
	 * 
	 * @param userId, id of {@link User} to delete
	 */
	public void deleteUser(String userId);

}
