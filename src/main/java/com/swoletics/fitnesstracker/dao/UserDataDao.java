package com.swoletics.fitnesstracker.dao;

import java.util.List;

import com.swoletics.fitnesstracker.model.UserData;

/**
 * This interface outlines the functions to perform operations on {@link UserData} with the database.
 *
 * @author Dillan Simpson
 */
public interface UserDataDao {
  /**
   * Add {@link UserData} object to the database, which must be a JPA entity.
   *
   * @param user object which is not {@code null}
   */
  public void addUserData(UserData user);

  /**
   * Retrieve {@link UserData} object using user Id.
   *
   * @param Id, userId of user which cannot be {@code null} or empty.
   * @return {@link UserData} from persistent Objects.
   */
  public UserData getUserData(String Id);

  /**
   * Retrieve list of {@link UserData}s from the database.
   *
   * @return list of {@link UserData}s present in the database table.
   */
  public List<UserData> getUsersData();
  
  /**
   * Delete {@link UserData} from the database
   * 
   * @param userId, id of {@link UserData} to delete
   */
  public void deleteUserData(String userId);

}
