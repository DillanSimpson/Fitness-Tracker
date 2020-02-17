package com.swoletics.fitnesstracker.dao.impl;

import com.swoletics.fitnesstracker.dao.UserDao;
import com.swoletics.fitnesstracker.model.User;

import java.util.Objects;

import static com.swoletics.fitnesstracker.util.Constant.USER_ID;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link UserDao}
 *
 * @author Dillan Simpon
 */
@Repository
public class UserDaoImpl implements UserDao {

	/**
	 * Spring allows us to specify persistence unit to operate with Database. It
	 * Expresses a dependency on a container-managed {@link EntityManager} and its
	 * associated persistence context.
	 */
	@PersistenceContext
	EntityManager entityManager;

	// Query strings
	private static final String GET_USERS_QUERY = "SELECT u FROM User u";
	private static final String GET_USERS_QUERY_SORTED_ASC = "SELECT u FROM User u ORDER BY u.associateID asc";
	private static final String GET_USERS_QUERY_SORTED_DESC = "SELECT u FROM User u ORDER BY u.associateID desc";
	private static final String DELETE_USER_QUERY = "DELETE FROM User u WHERE u.associateID = :associateId";

	/** @return query string for pulling all users */
	String getUsersQuery() {
		return GET_USERS_QUERY;
	}

	/** @return query string for pulling all users sorted ascending */
	String getUsersQuerySortedAsc() {
		return GET_USERS_QUERY_SORTED_ASC;
	}

	/** @return query string for pulling all users sorted descending */
	String getUsersQuerySortedDesc() {
		return GET_USERS_QUERY_SORTED_DESC;
	}

	@Override
	public void addUser(User user) {
		if (!Objects.isNull(user)) {
			try {
				entityManager.persist(user);
			} catch (PersistenceException ex) {
				// TODO Exception handler
			}
		}

	}

	@Override
	public User getUser(String Id) {
		try {
			return entityManager.find(User.class, Id);
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
		return null;
	}

	@Override
	public List<User> getUsers() {
		try {
			return entityManager.createQuery(GET_USERS_QUERY, User.class).getResultList();
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		try {
			entityManager.joinTransaction();
			entityManager.createQuery(DELETE_USER_QUERY).setParameter(USER_ID, userId).executeUpdate();
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
	}

}
