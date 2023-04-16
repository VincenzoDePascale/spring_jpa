package com.jpa_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locations")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private LocationType type;
	
	private Integer maxOccupants;
	
	@ManyToOne
	@JoinColumn(name = "id_building")
	private Building building;

	public Location(String description, LocationType type, Integer maxOccupants,
			Building building) {
		super();
		this.description = description;
		this.type = type;
		this.maxOccupants = maxOccupants;
		this.building = building;
	}

		
}
