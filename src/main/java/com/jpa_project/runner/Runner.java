package com.jpa_project.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpa_project.service.UserService;
import com.jpa_project.service.BuildingService;
import com.jpa_project.service.LocationService;


@Component
public class Runner implements ApplicationRunner {

	@Autowired UserService userService;
	@Autowired BuildingService buildingService;
	@Autowired LocationService locationService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...UserRunner");
		
//		for(int i = 0; i < 10; i++) {userService.createFakeUser();}
//		for(int i = 0; i < 10; i++) {buildingService.createFakeBuilding();}
//		for(int i = 0; i < 10; i++) {locationService.createFakeLocation();}
		
		
	}
}
