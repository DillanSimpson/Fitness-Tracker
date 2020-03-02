package com.swoletics.fitnesstracker.model;

/**
 * 
 * @author Dillan Simpson
 *
 */
public enum MemberType {
	/** Account type for the user, tracker only */
	TRACKER("Fitness Tracker"),

	/** Account type for the user, diet && workout suggester */
	DIET_PLAN("Custom Workout Plan");

	private String memberShipType;

	MemberType(String memberShipType) {
		this.memberShipType = memberShipType;
	}

	public String getMembership() {
		return memberShipType;
	}
}
