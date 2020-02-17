package com.swoletics.fitnesstracker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	@Column(name = "username", unique = true, nullable = false)
	private String userName;

	@Column(name = "password", unique = true, nullable = false)
	private String password;

	@Column(name = "enabled", unique = false, nullable = false)
	private Boolean enabled;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<UserData> userData = new ArrayList<UserData>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "username")
	private Authorities authorities;

	/**
	 * Constructor
	 * 
	 * @param userName, user name for {@link User} cannot be {@code null}
	 * @param password, password for {@link User} cannot be {@code null}
	 * @param enabled,  indicates if {@link User} is active cannot be {@code null}
	 */
	public User(final String userName, final String password, final Boolean enabled) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}
}
