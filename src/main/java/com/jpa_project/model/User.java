package com.jpa_project.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	private String name;
	
	private String lastname; 
	
	@Column(nullable = false, unique = true)
	private String email;	
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Reservation> reservation;

	public User(String username, String name, String lastname, String email,
			List<Reservation> reservation) {
		super();
		this.username = username;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.reservation = reservation;
	}
	
	
	
	}