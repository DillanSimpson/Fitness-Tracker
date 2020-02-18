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
@Table(name = "workouts")
@Getter
@Setter
@NoArgsConstructor
public class Workouts implements Serializable {

	private static final long serialVersionUID = 1954240442498239583L;

	@Id
	@Column(name = "workout_id", unique = true, nullable = false)
	private String workoutId;

	@Column(name = "workout_type", unique = false, nullable = true)
	private WorkoutType workoutType;

	@Column(name = "category", unique = false, nullable = true)
	private Category category;

	@Column(name = "workout_name", unique = false, nullable = true)
	private String workoutName;

	@Column(name = "description", unique = false, nullable = true)
	private String description;

	@Column(name = "length", unique = false, nullable = false)
	private float length;

	/**
	 * Constructor
	 * 
	 * @param workoutId,   id of workout cannot be {@code null}
	 * @param workoutType  type of workout cannot be {@code null}
	 * @param category,    classification of workout cannot be {@code null}
	 * @param workoutName, name of workout cannot be {@code null}
	 * @param description, description of workout cannot be {@code null}
	 * @param length,      duration of workout cannot be {@code null}
	 */
	public Workouts(final String workoutId, final WorkoutType workoutType, final Category category,
			final String workoutName, final String description, final int length) {
		this.workoutId = workoutId;
		this.workoutType = workoutType;
		this.category = category;
		this.workoutName = workoutName;
		this.description = description;
		this.length = length;
	}

}
