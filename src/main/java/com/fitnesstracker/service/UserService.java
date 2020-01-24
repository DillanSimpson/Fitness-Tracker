package com.fitnesstracker.service;

import com.fitnesstracker.model.User;

import java.util.List;

/**
 * Provide service layer for doing CRUD operations with model {@link User}.
 *
 * @author Dillan Simpson
 */
public interface UserService {

  /**
   * This method handles transactions and it's related exceptions of saving user into the database.
   *
   * @param user, cannot be {@code null}
   * @throws DataBaseException, if the given {@link User} is unable to add into the database.
   * @throws VerifyException, if the given {@link User} is {@code null}.
   */
  void addUser(User user);

  /**
   * This method handles transactions of getting user by associateID from the database.
   *
   * @param id, associateId of the user which cannot be {@code null} or empty.
   * @return {@link User} object.
   * @throws DataBaseException, if there is problem in finding the user from database.
   * @throws VerifyException, if the id is {@code null}.
   */
  User getUser(String id);

  /**
   * This method handles transactions of getting the list of {@link User}s present in the database.
   *
   * @return list of {@link User}s.
   * @throws DataBaseException, if there is problem in getting the list of {@link User}s from
   *     database.
   * @throws VerifyException, if the list of {@link User}s returned is {@code null} or empty.
   */
  List<User> getUsers();
}
