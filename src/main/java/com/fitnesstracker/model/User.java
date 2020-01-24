package com.fitnesstracker.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** Represents user details which will be used after login. */
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = 1954240442498239583L;

  @Id
  @Column(name = "user_id", unique = true, nullable = false)
  private String associateID;

  @Column(name = "first_name", unique = false, nullable = true)
  private String firstName;

  @Column(name = "last_name", unique = false, nullable = true)
  private String lastName;

  @Column(name = "email", unique = true, nullable = false)
  private String email;


  /**
   * Parameterized Constructor
   *
   * @param userId of a user, never be {@code null} or empty
   * @param firstName of a user, never be {@code null} or empty
   * @param lastName of a user, never be {@code null} or empty
   * @param email of a user, never be {@code null} or empty
   * @throws IllegalArgumentException if the assoicateID, firstName,lastName is {@code null}, empty
   *     or blank. if the role of the user is {@code null}
   */
  public User(
      final String userId,
      final String firstName,
      final String lastName,
      final String email
      ) {
    /* To-do retrieve error messages from properties file ACADEM-36298 */
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

}
