package com.jpa_project.model;

import java.util.List;

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
@Table(name = "buildings")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String address;
	
	private String city;
	
	@OneToMany(mappedBy = "building")
	private List<Location> location;

	public Building(String name, String address, String city,
			List<Location> location) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.location = location;
	}
	
	
	
	}
