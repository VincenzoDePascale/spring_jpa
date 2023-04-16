package com.jpa_project.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.jpa_project.model.Location;
import com.jpa_project.model.Reservation;
import com.jpa_project.model.User;

@Configuration
@PropertySource("classpath:application.properties")
public class ReservationConfiguration {
	@Bean("ParamsReservation")
	@Scope("prototype")
	public Reservation paramReservation(User user, Location location, LocalDate localdate) {
		return new Reservation(null, user, location, localdate);
	}
	
}
