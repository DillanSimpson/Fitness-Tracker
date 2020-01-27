package com.fitnesstracker.model;

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

  @Column(name = "workout_name", unique = false, nullable = true)
  private String workoutName;

  @Column(name = "description", unique = false, nullable = true)
  private String description;

  @Column(name = "length", unique = true, nullable = false)
  private int length;
  

  /**
   * Constructor
   * 
   * @param workout_id, id of workout cannot be {@code null}
   * @param workoutName, name of workout cannot be {@code null}
   * @param description, description of workout cannot be {@code null}
   * @param length, duration of workout cannot be {@code null}
   */
  public Workouts(
      final String workout_id,
      final String workoutName,
      final String description,
      final int length
      ) {
    this.workoutName = workoutName;
    this.description = description;
    this.length = length;
  }

}
