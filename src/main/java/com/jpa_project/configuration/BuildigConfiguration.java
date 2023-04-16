package com.jpa_project.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.jpa_project.model.Building;

@Configuration
@PropertySource("classpath:application.properties")
public class BuildigConfiguration {

	@Bean("CustomBuilding")
	@Scope("prototype")
	public Building customBuilding() {
		return new Building();
	}
	
	@Bean("ParamBuilding")
	@Scope("prototype")
	public Building paramBuilding(String name, String address, String city) {
		return new Building(null, name, address, city, null);
	}
	
	@Bean("FakeBuilding")
	@Scope("prototype")
	public Building fakeBuilding() {
		Faker fake = new Faker(new Locale("it-IT"));
		Building b = new Building();
		b.setAddress(fake.address().streetAddress() + "," + fake.address().streetAddressNumber());
		b.setCity(fake.address().city());
		b.setName(fake.address().firstName());
		b.setLocation(null);
		return b;
	}
}
