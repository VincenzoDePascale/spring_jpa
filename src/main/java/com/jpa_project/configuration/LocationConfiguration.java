package com.jpa_project.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.jpa_project.service.BuildingService;
import com.jpa_project.model.Location;
import com.jpa_project.model.LocationType;

@Configuration
@PropertySource("classpath:application.properties")
public class LocationConfiguration {
	
	@Autowired BuildingService buildingService;
	
	@Bean("CustomLocation")
	@Scope("prototype")
	public Location customLocation() {
		return new Location();
	}
	
	@Bean("ParamLocation")
	@Scope("prototype")
	public Location paramLocation(String description, LocationType type, Integer maxOccupants) {
		return new Location(null, description, type, maxOccupants, null);
	}
	
}
