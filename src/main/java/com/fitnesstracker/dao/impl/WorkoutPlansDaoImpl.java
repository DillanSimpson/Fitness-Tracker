package com.fitnesstracker.dao.impl;

import com.fitnesstracker.dao.WorkoutPlansDao;
import com.fitnesstracker.model.WorkoutPlans;
import com.fitnesstracker.util.WorkoutPlan;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link WorkoutPlansDao}
 *
 * @author Dillan Simpon
 */
@Repository
public class WorkoutPlansDaoImpl implements WorkoutPlansDao {

	/**
	 * Spring allows us to specify persistence unit to operate with Database. It Expresses a
	 * dependency on a container-managed {@link EntityManager} and its associated persistence context.
	 */
	@PersistenceContext EntityManager entityManager;
	
	@Override
	public WorkoutPlans getPlanById(int planId) {
		try {
			return entityManager.find(WorkoutPlans.class, planId);
		} catch(PersistenceException ex) {
			//TODO
		}
		return null;
	}

	@Override
	public WorkoutPlans getPlanByName(String planName) {
		try {
			return entityManager.find(WorkoutPlans.class, planName);
		} catch(PersistenceException ex) {
			//TODO
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WorkoutPlans> getAllPlans() {
		try {
			return entityManager.createQuery("FROM workout_plans").getResultList();
		} catch(PersistenceException ex) {
			//TODO
		}
		return null;
	}
	  
	  
	
}
