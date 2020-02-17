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
@Table(name = "food_log")
@Getter
@Setter
@NoArgsConstructor
public class FoodLog implements Serializable {

	private static final long serialVersionUID = 2928898731978970807L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "food_name", unique = false, nullable = false)
	private String foodName;

	@Column(name = "calories", unique = false, nullable = false)
	private int calories;

	@Column(name = "carbs", unique = false, nullable = false)
	private float carbs;

	@Column(name = "fat", unique = false, nullable = false)
	private float fat;

	@Column(name = "sugar", unique = false, nullable = false)
	private float sugar;

	@Column(name = "protein", unique = false, nullable = false)
	private float protein;

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
	public FoodLog(final int id, final String foodName, final int calories, final int carbs, final int fat,
			final int sugar, final int protein, final int userId) {
		this.id = id;
		this.foodName = foodName;
		this.calories = calories;
		this.carbs = carbs;
		this.fat = fat;
		this.sugar = sugar;
		this.protein = protein;
		this.userId = userId;
	}

}
