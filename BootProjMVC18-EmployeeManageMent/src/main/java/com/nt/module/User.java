package com.nt.module;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Table(name = "USER_EMAMI",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
public class User {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	@Column(name = "FIRST_NAME", length = 20)
	private String firstName;
	@Column(name = "LAST_NAME", length = 20)
	private String  lastName;
	
	private String email;
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "users_roles",joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),inverseJoinColumns = 
			@JoinColumn(name="role_id",referencedColumnName = "id"))
	private Collection<Role>role;

}
