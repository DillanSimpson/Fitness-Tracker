package com.swoletics.fitnesstracker.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "workout_log")
@Getter
@Setter
@NoArgsConstructor
public class WorkoutLog implements Serializable {

	private static final long serialVersionUID = 2928898731978970807L;

	@Id
	@Column(name = "workout_id", unique = true, nullable = false)
	private int workoutId;

	@Column(name = "reps", unique = false, nullable = false)
	private int reps;

	@Column(name = "weight", unique = false, nullable = false)
	private int weight;

	@Column(name = "sets", unique = false, nullable = false)
	private int sets;

	@Column(name = "distance", unique = false, nullable = false)
	private float distance;

	@Column(name = "user_id", unique = false, nullable = false)
	private int userId;

	/**
	 * Constructor
	 * 
	 * @param id,       id of food cannot be {@code null}
	 * @param foodName, name of food cannot be {@code null}
	 * @param calories, total calories per serving cannot be {@code null}
	 * @param carbs,    total carbohydrates per serving cannot be {@code null}
	 * @param fat,      total fat per serving cannot be {@code null}
	 * @param sugar,    total sugar per serving cannot be {@code null}
	 * @param protien,  total protein per serving cannot be {@code null}
	 * @param userId,   id of {@link UserData} cannot be {@code null}
	 */

	/**
	 * Constructor
	 * 
	 * @param workoutId, id of workout cannot be {@code null}
	 * @param reps,      number of reps per set
	 * @param weight,    weight amount
	 * @param sets,      number of sets be workout
	 * @param distance,  for aerobic exercise
	 * @param userId,    id of {@link User} which cannot be {@code null}
	 */
	public WorkoutLog(final int workoutId, final int reps, final int weight, final int sets, final float distance,
			final int userId) {
		this.workoutId = workoutId;
		this.reps = reps;
		this.weight = weight;
		this.sets = sets;
		this.distance = distance;
		this.userId = userId;
	}

}
