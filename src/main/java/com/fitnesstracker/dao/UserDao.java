package com.fitnesstracker.dao;

import com.fitnesstracker.model.User;

import java.util.List;

/**
 * This interface outlines the functions to perform operations on {@link User} with the database.
 *
 * @author Dillan Simpson
 */
public interface UserDao {
  /**
   * Add {@link User} object to the database, which must be a JPA entity.
   *
   * @param user object which is not {@code null}
   * @throws DataBaseException, If the given {@link User} object is unable to persist.
   * @throws VerifyException, if the given {@link User} object is {@code null}.
   */
  public void addUser(User user);

  /**
   * Retrieve {@link User} object using associate ID.
   *
   * @param Id, userId of user which cannot be {@code null} or empty.
   * @return {@link User} from persistent Objects.
   * @throws DataBaseException, if error occurred in finding the persistent {@link User} object.
   * @throws VerifyException, if the Id is {@code null}.
   */
  public User getUser(String Id);

  /**
   * Retrieve list of {@link User}s from the database.
   *
   * @return list of {@link User}s present in the database table.
   * @throws DataBaseException, if error occurred in retrieving the list of {@link User}s from
   *     database.
   */
  public List<User> getUsers();

}
