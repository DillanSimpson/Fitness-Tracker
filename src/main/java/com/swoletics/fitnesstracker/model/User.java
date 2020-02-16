package com.swoletics.fitnesstracker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = 1954240442498239583L;

  @Id
  @Column(name = "user_id", unique = true, nullable = false)
  private String userId;

  @Column(name = "user_name", unique = true, nullable = false)
  private String userName;

  @Column(name = "password", unique = false, nullable = false)
  private String password;

  @Column(name = "member_type", unique = false, nullable = false)
  @Enumerated(EnumType.STRING)
  private MemberType memberType;

  @Column(name = "role", nullable = false)
  @Enumerated(EnumType.STRING)
  private Role role;

  @Column(name = "active", unique = false, nullable = false)
  private Boolean active;

  @OneToMany(mappedBy = "user", fetch=FetchType.EAGER)
  private List<UserData> userData = new ArrayList<UserData>();

  /**
   * Constructor
   * 
   * @param userId, id of user cannot be {@code null}
   * @param userName, user name for {@link User} cannot be {@code null}
   * @param password, password for {@link User} cannot be {@code null}
   * @param memberType, type of member cannot be {@code null}
   * @param role, {@link Role} for {@link User} cannot be {@code null}
   * @param active,  cannot be {@code null}
   */
  public User(
      final String userId,
      final String userName,
      final String password,
      final MemberType memberType,
      final Role role,
      final Boolean active
      ) {
	this.userId = userId;
	this.userName = userName;
    this.password = password;
    this.memberType = memberType;
    this.role = role;
    this.active = active;
  }
}
