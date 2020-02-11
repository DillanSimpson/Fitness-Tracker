package com.swoletics.fitnesstracker.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Values that are used to signify the sex of a {@code User}.
 *
 * @author Dillan Simpson
 */
public enum Sex {
  MALE("male"),
  FEMALE("female");

  static final Logger logger = LogManager.getLogger(Sex.class);
  private String sex;

  /**
   * Places the enumerated value into {@code Sex}.
   *
   * @param sex enumerated value to be stored in {@code Sex}.
   */
  private Sex(String sex) {
    this.sex = sex;
  }

  /**
   * Returns the value stored in {@code Sex}.
   *
   * @return value of {@code Sex}
   */
  public String getSortOrder() {
    return this.sex;
  }
}
