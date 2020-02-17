package com.swoletics.fitnesstracker.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "authorities")
@Getter
@Setter
@NoArgsConstructor
public class Authorities implements Serializable {

	private static final long serialVersionUID = 1954240442498239583L;

	@Id
	@Column(name = "username", unique = true, nullable = false)
	private String userName;

	@Column(name = "authority", unique = true, nullable = false)
	private Role role;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "authorities")
	private User user;

	/**
	 * Constructor
	 * 
	 * @param userName, user name for {@link Authorities} cannot be {@code null}
	 * @param role,     authority of {@link User} cannot be {@code null}
	 */
	public Authorities(final String userName, final Role role) {
		this.userName = userName;
		this.role = role;
	}
}
