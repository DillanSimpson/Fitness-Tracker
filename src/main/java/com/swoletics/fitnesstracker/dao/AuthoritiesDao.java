package com.swoletics.fitnesstracker.dao;

import com.swoletics.fitnesstracker.model.Authorities;

/**
 * This interface outlines the functions to perform operations on
 * {@link Authorities} with the database.
 *
 * @author Dillan Simpson
 */
public interface AuthoritiesDao {
	/**
	 * Add {@link Authorities} object to the database, which must be a JPA entity.
	 *
	 * @param user object which is not {@code null}
	 */
	public void addAuthority(Authorities authorities);

	/**
	 * Delete {@link Authorities} from the database
	 * 
	 * @param userId, id of {@link Authorities} to delete
	 */
	public void deleteAuthority(String userId);
}
