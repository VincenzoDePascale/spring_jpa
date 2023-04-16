package com.jpa_project.configuration;

import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.jpa_project.model.Reservation;
import com.jpa_project.model.User;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {

	@Bean("ParamsUser")
	@Scope("prototype")
	public User paramsUser(
			String username, String name, String lastname, String email, List<Reservation> reservation ) {
		return new User(null, username, name, lastname, email, null);
	}
	
	@Bean("FakeUser")
	@Scope("prototype")
	public User fakeUser() {
		Faker fake = new Faker(new Locale("it-IT"));
		User u = new User();
		u.setName(fake.name().firstName());
		u.setLastname(fake.name().lastName());
		u.setEmail(u.getName() + "." + u.getLastname() + "@example.com");
		u.setUsername(u.getName() + "_" + u.getLastname());
		return u;
	}
	
}
