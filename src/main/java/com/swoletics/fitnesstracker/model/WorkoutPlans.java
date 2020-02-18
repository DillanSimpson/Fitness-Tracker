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
@Table(name = "workout_plans")
@Getter
@Setter
@NoArgsConstructor
public class WorkoutPlans implements Serializable {

	private static final long serialVersionUID = 2928898731978970807L;

	@Id
	@Column(name = "plan_id", unique = true, nullable = false)
	private int planId;

	@Column(name = "plan_name", unique = false, nullable = true)
	private String plan;

	/**
	 * Constructor
	 * 
	 * @param planId,   id of workout plan cannot be {@code null}
	 * @param planName, name of plan cannot be {@code null}
	 */
	public WorkoutPlans(final int planId, final String plan) {
		this.planId = planId;
		this.plan = plan;

	}

}
