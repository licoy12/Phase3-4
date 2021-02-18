package com.simplilearn.phase3end.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "users_account")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "active")
	private boolean active;
	@Column(name = "roles")
	private String roles;

}
