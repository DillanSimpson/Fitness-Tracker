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
 * @author Dillan Simpon
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
  
  /** @return query string for pulling all users */
  String getUsersQuery() {
    return GET_USERS_QUERY;
  }

  /** @return query string for pulling all users sorted ascending */
  String getUsersQuerySortedAsc() {
    return GET_USERS_QUERY_SORTED_ASC;
  }

  /** @return query string for pulling all users sorted descending */
  String getUsersQuerySortedDesc() {
    return GET_USERS_QUERY_SORTED_DESC;
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
