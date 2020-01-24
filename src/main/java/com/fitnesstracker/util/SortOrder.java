package com.fitnesstracker.util;

import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Values that are used to signify the type of sort order used in database queries.
 *
 * @author Dillan Simpson
 */
public enum SortOrder {
  ASC("ASC"),
  DESC("DESC");

  static final Logger logger = LogManager.getLogger(SortOrder.class);
  private String sortOrder;

  /**
   * Places the enumerated value into {@code sortOrder}.
   *
   * @param sortOrder enumerated value to be stored in {@code sortOrder}.
   */
  private SortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  /**
   * Returns the value stored in {@code sortOrder}.
   *
   * @return value of {@code sortOrder}
   */
  public String getSortOrder() {
    return this.sortOrder;
  }

  /**
   * Validates {@code sortOrder} and returns a default value if it is not valid.
   *
   * @param sortOrder the enum to check if it is valid or not. It must not be blank or {@code null}.
   *     If it is either blank or {@code null}, then it will be considered an invalid enum.
   * @return the enum that represents {@code sortOrder} if it is a valid enum. Otherwise, it will
   *     return a default enum of {@code ASC} if {@code sortOrder} is not valid or it is blank or
   *     {@code null}.
   */
  public static SortOrder validateSortOrder(String sortOrder) {
    if (StringUtils.isNotBlank(sortOrder) && EnumUtils.isValidEnum(SortOrder.class, sortOrder)) {
      return valueOf(sortOrder);
    } else {
      logger.warn("Not a valid enum. Returning default of ASC.");
      return ASC;
    }
  }
}
