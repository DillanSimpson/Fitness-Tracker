package com.swoletics.fitnesstracker.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "userData")
@Table(name = "users_data")
@Getter
@Setter
@NoArgsConstructor
public class UserData implements Serializable {

  private static final long serialVersionUID = 1954240442498239583L;
  
  @Id
  @Column(name = "user_id", unique = true, nullable = false)
  private String userId;

  @Column(name = "first_name", unique = false, nullable = false)
  private String firstName;

  @Column(name = "last_name", unique = false, nullable = false)
  private String lastName;
  
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @Column(name = "age", unique = false, nullable = false)
  private int age;

  @Column(name = "sex", unique = false, nullable = false)
  String sex;

  @Column(name = "height", unique = false, nullable = false)
  double height;

  @Column(name = "weight", unique = false, nullable = false)
  double weight;

  @Column(name = "calories_max", unique = false, nullable = false)
  int caloriesMax;

  @Column(name = "calories_min", unique = false, nullable = false)
  int caloriesMin;

  @Column(name = "carbs_max", unique = false, nullable = false)
  int carbsMax;

  @Column(name = "fat_max", unique = false, nullable = false)
  int fatMax;

  @Column(name = "sugar_max", unique = false, nullable = false)
  int sugarMax;

  @Column(name = "protein_max", unique = false, nullable = false)
  int proteinMax;

  @Column(name = "protein_min", unique = false, nullable = false)
  int proteinMin;

  @Column(name = "plan_id", unique = false, nullable = false)
  int planId;

  @Column(name = "plan_name", unique = false, nullable = false)
  String planName;

  @Column(name = "workout_frequency", unique = false, nullable = false)
  int workoutFrequency;  
  
  /**
   * Constructor
   * 
   * @param userId, id of user cannot be {@code null}
   * @param firstName, first name of user cannot be {@code null}
   * @param lastName, cannot be {@code null}
   * @param email, cannot be {@code null}
   * @param age, cannot be {@code null}
   * @param sex, cannot be {@code null}
   * @param height, cannot be {@code null}
   * @param weight, cannot be {@code null}
   * @param caloriesMax, cannot be {@code null}
   * @param caloriesMin, cannot be {@code null}
   * @param sugarMax, cannot be {@code null}
   * @param carbsMax, cannot be {@code null}
   * @param fatMax, cannot be {@code null}
   * @param proteinMax, cannot be {@code null}
   * @param proteinMin, cannot be {@code null}
   * @param planId, cannot be {@code null}
   * @param planName, cannot be {@code null}
   * @param workoutFrequency, cannot be {@code null}
   */
  public UserData(
      final String userId,
      final String firstName,
      final String lastName,
      final String email,
      final int age,
      final String sex,
      final double height,
      final double weight,
      final int caloriesMax,
      final int caloriesMin,
      final int sugarMax,
      final int carbsMax,
      final int fatMax,
      final int proteinMax,
      final int proteinMin,
      final int planId,
      final String planName,
      final int workoutFrequency
      ) {
	this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
    this.sex = sex;
    this.height = height;
    this.weight = weight;
    this.carbsMax = caloriesMax;
    this.caloriesMin = caloriesMin;
    this.sugarMax = sugarMax;
    this.carbsMax = carbsMax;
    this.fatMax = fatMax;
    this.proteinMax = proteinMax;
    this.proteinMin = proteinMin;
    this.planId = planId;
    this.planName = planName;
    this.workoutFrequency = workoutFrequency;
  }

}
