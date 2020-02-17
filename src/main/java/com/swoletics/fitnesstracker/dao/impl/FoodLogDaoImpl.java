package com.swoletics.fitnesstracker.dao.impl;

import com.swoletics.fitnesstracker.dao.FoodLogDao;
import com.swoletics.fitnesstracker.model.FoodLog;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link FoodLogDao}
 *
 * @author Dillan Simpon
 */
@Repository
public class FoodLogDaoImpl implements FoodLogDao {

	/**
	 * Spring allows us to specify persistence unit to operate with Database. It
	 * Expresses a dependency on a container-managed {@link EntityManager} and its
	 * associated persistence context.
	 */
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addLog(FoodLog log) {
		try {
			entityManager.persist(log);
		} catch (PersistenceException ex) {
			// TODO exception handler
		}
	}

	@Override
	public List<FoodLog> getDailyLog(int userId) {
		try {
			return entityManager.createQuery("SELECT f FROM food_log WHERE f.user_id = :userId", FoodLog.class)
					.setParameter("userId", userId).getResultList();
		} catch (PersistenceException ex) {
			// TODO exception handler
		}
		return null;
	}

	@Override
	public void deleteLog(int logId) {
		try {
			entityManager.joinTransaction();
			entityManager.createQuery("DELETE FROM food_log f WHERE f.log_id = :logId").setParameter("log_id", logId)
					.executeUpdate();
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
	}

	@Override
	public void updateLog(int logId) {
		try {
			entityManager.joinTransaction();
			(entityManager.createQuery("UPDATE food_log f where f.log_id = :logId").setParameter("log_id", logId))
					.executeUpdate();
		} catch (PersistenceException ex) {
			// TODO
		}
	}

}
