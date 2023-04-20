package com.jpa_project.runner;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpa_project.service.*;
import com.jpa_project.model.*;

@Component
public class Runner implements ApplicationRunner {

	@Autowired UserService userService;
	@Autowired BuildingService buildingService;
	@Autowired LocationService locationService;
	@Autowired ReservationService reservationService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run...UserRunner");
		
//		for(int i = 0; i < 10; i++) {userService.createFakeUser();}
//		for(int i = 0; i < 10; i++) {buildingService.createFakeBuilding();}
		
//		Building b = buildingService.findBuildingById(1l);
//		Location l = new Location();
//		l.setDescription("ufficio privato");
//		l.setBuilding(b);
//		l.setMaxOccupants(10);
//		l.setType(LocationType.PRIVATO);
//		locationService.insertLocation(l);
//		
//		Location l2 = new Location();
//		l2.setDescription("open space");
//		l2.setBuilding(b);
//		l2.setMaxOccupants(50);
//		l2.setType(LocationType.OPENSPACE);
//		locationService.insertLocation(l2);
//		
//		Location l3 = new Location();
//		l3.setDescription("sala riunioni");
//		l3.setBuilding(b);
//		l3.setMaxOccupants(100);
//		l3.setType(LocationType.SALA_RIUNIONI);
//		locationService.insertLocation(l3);
//		
//		Building b1a = buildingService.findBuildingById(2l);
//		Location l1a = new Location();
//		l1a.setDescription("ufficio privato");
//		l1a.setBuilding(b1a);
//		l1a.setMaxOccupants(10);
//		l1a.setType(LocationType.PRIVATO);
//		locationService.insertLocation(l1a);
//		
//		Location l2a = new Location();
//		l2a.setDescription("open space");
//		l2a.setBuilding(b1a);
//		l2a.setMaxOccupants(50);
//		l2a.setType(LocationType.OPENSPACE);
//		locationService.insertLocation(l2a);
//		
//		Location l3a = new Location();
//		l3a.setDescription("sala riunioni");
//		l3a.setBuilding(b1a);
//		l3a.setMaxOccupants(100);
//		l3a.setType(LocationType.SALA_RIUNIONI);
//		locationService.insertLocation(l3a);
		
		User u = userService.findUserByID(1l);
		Location l = locationService.findLocationById(1l);
		
		Reservation r = new Reservation();
		r.setData(LocalDate.of(2023, 5, 2));
		r.setLocation(l);
		r.setUser(u);
		reservationService.insertReservation(r);
		
	}
}
