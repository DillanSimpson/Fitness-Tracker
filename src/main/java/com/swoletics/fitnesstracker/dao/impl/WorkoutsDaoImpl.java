package com.swoletics.fitnesstracker.dao.impl;

import com.swoletics.fitnesstracker.dao.WorkoutsDao;
import com.swoletics.fitnesstracker.model.Workouts;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link WorkoutsDao}
 *
 * @author Dillan Simpon
 */
@Repository
public class WorkoutsDaoImpl implements WorkoutsDao {

	/**
	 * Spring allows us to specify persistence unit to operate with Database. It
	 * Expresses a dependency on a container-managed {@link EntityManager} and its
	 * associated persistence context.
	 */
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void addWorkout(Workouts workout) {
		try {
			entityManager.persist(workout);
		} catch (PersistenceException ex) {
			// TODO
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Workouts> getWorkouts(int userId) {
		try {
			return entityManager.createQuery("SELECT w FROM workouts WHERE w.user_id = :userId")
					.setParameter("user_id", userId).getResultList();
		} catch (PersistenceException ex) {
			// TODO
		}
		return null;
	}

	@Override
	public void deleteWorkout(int workoutId) {
		try {
			entityManager.joinTransaction();
			entityManager.createQuery("DELETE FROM workout w WHERE w.workout_Id = :workoutId")
					.setParameter("workout_Id", workoutId).executeUpdate();
		} catch (PersistenceException ex) {
			// TODO Exception handler
		}
	}

}
