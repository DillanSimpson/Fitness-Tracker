package com.swoletics.fitnesstracker.service;

import com.swoletics.fitnesstracker.model.Authorities;

/**
 * Provide service layer for doing CRUD operations with model
 * {@link Authorities}.
 *
 * @author Dillan Simpson
 */
public interface AuthoritiesService {

	/**
	 * This method handles transactions and it's related exceptions of saving a user
	 * into the database.
	 *
	 * @param user, cannot be {@code null}
	 */
	void addAuthority(Authorities authorities);

	/**
	 * Delete a {@link Authorities} from the database
	 * 
	 * @param userId, id of {@link Authorities} to delete
	 */
	public void deleteUser(String userId);
}
