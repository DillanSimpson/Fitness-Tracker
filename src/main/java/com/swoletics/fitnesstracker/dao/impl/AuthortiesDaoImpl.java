package com.swoletics.fitnesstracker.dao.impl;

import com.swoletics.fitnesstracker.dao.AuthoritiesDao;
import com.swoletics.fitnesstracker.model.Authorities;

import java.util.Objects;

import static com.swoletics.fitnesstracker.util.Constant.USER_ID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link AuthoritiesDao}
 *
 * @author Dillan Simpon
 */
@Repository
public class AuthortiesDaoImpl implements AuthoritiesDao {

	/**
	 * Spring allows us to specify persistence unit to operate with Database. It
	 * Expresses a dependency on a container-managed {@link EntityManager} and its
	 * associated persistence context.
	 */
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addAuthority(Authorities authorities) {
		if (!Objects.isNull(authorities)) {
			try {
				entityManager.persist(authorities);
			} catch (PersistenceException ex) {
				// TODO Exception handler
			}
		}

	}

	@Override
	public void deleteAuthority(String userId) {
		try {
			entityManager.joinTransaction();
			entityManager.createQuery("").setParameter(USER_ID, userId).executeUpdate();
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
	}

}
