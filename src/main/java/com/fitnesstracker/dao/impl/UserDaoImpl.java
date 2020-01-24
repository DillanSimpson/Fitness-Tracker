package com.fitnesstracker.dao.impl;

import com.fitnesstracker.dao.UserDao;
import com.fitnesstracker.model.User;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 * It provides implementation methods to the {@link UserDao}
 *
 * @author SL062882
 * @author SC064997
 * @author JS066429
 */
@Repository
public class UserDaoImpl implements UserDao {

  /**
   * Spring allows us to specify persistence unit to operate with Database. It Expresses a
   * dependency on a container-managed {@link EntityManager} and its associated persistence context.
   */
  @PersistenceContext EntityManager entityManager;

  // Query strings
  private static final String GET_USERS_QUERY = "SELECT u FROM User u";
  private static final String GET_USERS_QUERY_SORTED_ASC =
      "SELECT u FROM User u ORDER BY u.associateID asc";
  private static final String GET_USERS_QUERY_SORTED_DESC =
      "SELECT u FROM User u ORDER BY u.associateID desc";
  private static final String GET_USERS_BY_ROLE = "SELECT u FROM User u where u.role = :role";
  private static final String UPDATE_USER_ROLE =
      "UPDATE User u set u.role = :role where u.associateID = :associateId";
  private static final String GET_USER_COUNT_BY_ROLE_QUERY =
      "SELECT count(distinct u.associateID) FROM User u WHERE u.role = :role";
  private static final String GET_USER_COUNT_QUERY =
      "SELECT count(distinct u.associateID) FROM User u";

  private static final String DELETE_USER_QUERY =
      "DELETE FROM User u WHERE u.associateID = :associateId";
  private static final String UPDATE_USER =
      "UPDATE User u set u.firstName = :firstName, u.lastName = :lastName, u.email = :email where u.associateID = :associateId";

  /** @return query string for pulling all github users */
  String getUsersQuery() {
    return GET_USERS_QUERY;
  }

  /** @return query string for pulling all github users sorted ascending */
  String getUsersQuerySortedAsc() {
    return GET_USERS_QUERY_SORTED_ASC;
  }

  /** @return query string for pulling all github users sorted descending */
  String getUsersQuerySortedDesc() {
    return GET_USERS_QUERY_SORTED_DESC;
  }

  /** @return query string for pulling all github users ordered by role */
  String getUsersByRole() {
    return GET_USERS_BY_ROLE;
  }

  /** @return query string for updating github users role */
  String getUpdateUsersRole() {
    return UPDATE_USER_ROLE;
  }

  /** @return query string for getting count of users */
  String getUserCountQuery() {
    return GET_USER_COUNT_QUERY;
  }

  /** @return query string for getting count of users by role */
  String getUserCountByRoleQuery() {
    return GET_USER_COUNT_BY_ROLE_QUERY;
  }

  /** @return query string for deleting users by associate id */
  String getDeleteUserQuery() {
    return DELETE_USER_QUERY;
  }

  /** @return query string for updating user */
  String getUserUpdate() {
    return UPDATE_USER;
  }

@Override
public void addUser(User user) {
	// TODO Auto-generated method stub
	
}

@Override
public User getUser(String Id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<User> getUsers() {
	// TODO Auto-generated method stub
	return null;
}

}
