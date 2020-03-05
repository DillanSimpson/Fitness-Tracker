package com.swoletics.fitnesstracker.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "username", unique = true, nullable = false, insertable = false, updatable = false)
	private String userName;

	@Column(name = "password", unique = false, nullable = false)
	private String password;

	@Column(name = "enabled", unique = false, nullable = false)
	private Boolean enabled;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private Authorities authorities;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private UserData userData;

	/**
	 * Constructor
	 * 
	 * @param userName, user name for {@link User} cannot be {@code null}
	 * @param password, password for {@link User} cannot be {@code null}
	 * @param enabled,  indicates if {@link User} is active cannot be {@code null}
	 */
	public User(final String password, final Boolean enabled) {

		this.password = password;
		this.enabled = enabled;
	}
}
