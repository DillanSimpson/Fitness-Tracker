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
@Table(name = "food_log")
@Getter
@Setter
@NoArgsConstructor
public class FoodLog implements Serializable {

  private static final long serialVersionUID = 2928898731978970807L;

  @Id
  @Column(name = "id", unique = true, nullable = false)
  private int id;
  
  @Column(name = "user_id", unique = false, nullable = false)
  private int userId;

  @Column(name = "food_name", unique = false, nullable = false)
  private String foodName;

  @Column(name = "calories", unique = false, nullable = false)
  private int calories;

  @Column(name = "sugar", unique = true, nullable = false)
  private int sugar;
  
  @Column(name = "carbs", unique = false, nullable = false)
  private int carbs;
  
  @Column(name = "fat", unique = false, nullable = false)
  private int fat;
  
  /**
   * Constructor
   * 
   * @param id, id of food cannot be {@code null}
   * @param userId, id of {@link User} cannot be {@code null}
   * @param foodName, name of food cannot be {@code null}
   * @param calories, total calories per serving cannot be {@code null}
   * @param sugar, total sugar per serving cannot be {@code null}
   * @param carbs, total carbohydrates per serving cannot be {@code null}
   * @param fat, total fat per serving cannot be {@code null}
   */
  public FoodLog(
      final int id,
      final int userId,
      final String foodName,
      final int calories,
      final int sugar,
      final int carbs,
      final int fat
      ) {
    this.id = id;
    this.userId = userId;
    this.foodName = foodName;
    this.calories = calories;
    this.sugar = sugar;
    this.carbs = carbs;
    this.fat = fat;
  }

}
