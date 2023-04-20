package com.jpa_project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa_project.model.Location;
import com.jpa_project.model.User;
import com.jpa_project.repository.LocationDAORepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LocationService {
	
	@Autowired private LocationDAORepository repo;
	@Autowired BuildingService buildingService;
	
	@Autowired @Qualifier("FakeLocation") private ObjectProvider<Location> fakeLocationProvider;
	
	public void insertLocation(Location l) {
		repo.save(l);
	}
	
	public void createFakeLocation() {
		insertLocation(fakeLocationProvider.getObject());
	}
	
	public List<Location> finsAllLocation() {
		return (List<Location>) repo.findAll();
	}
	
	public Location findLocationById(Long id) {
		return repo.findById(id).get();
	}
	
	public void removeLocation(Location l) {
		repo.delete(l);
	}
	
	public void updateLocation(Location l) {
		repo.save(l);
	}
	
}