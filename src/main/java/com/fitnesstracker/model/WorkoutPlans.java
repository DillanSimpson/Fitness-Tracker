package com.fitnesstracker.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fitnesstracker.util.WorkoutPlan;

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
  private WorkoutPlan plan;

  
  /**
   * Constructor
   * 
   * @param id, id of food cannot be {@code null}
   * @param foodName, name of food cannot be {@code null}
   * @param calories, total calories per serving cannot be {@code null}
   * @param sugar, total sugar per serving cannot be {@code null}
   * @param carbs, total carbohydrates per serving cannot be {@code null}
   * @param fat, total fat per serving cannot be {@code null}
   */
  /**
   * Constructor
   * 
   * @param planId, id of workout plan cannot be {@code null}
   * @param planName, name of plan cannot be {@code null}
   */
  public WorkoutPlans(
      final int planId,
      final WorkoutPlan plan
      ) {
    this.planId = planId;
    this.plan = plan;
   
  }

}
