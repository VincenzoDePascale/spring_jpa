package com.jpa_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa_project.model.Building;
import com.jpa_project.repository.BuildingDAORepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BuildingService {
	
	@Autowired private BuildingDAORepository repo;
	
	@Autowired @Qualifier("FakeBuilding") private ObjectProvider<Building> fakeBuildingProvider;
	
	public void insertBuilding(Building b) {
		repo.save(b);
		log.info(b.toString());
	}
	
	public void createFakeBuilding() {
		insertBuilding(fakeBuildingProvider.getObject());
	}
	
	public List<Building> findAllBuilding() {
		return (List<Building>) repo.findAll();
	}
	
	public void removeBuilding(Building b) {
		repo.delete(b);
	}
	
	public void updateBuilding(Building b) {
		repo.save(b);
	}
	
	public void findBuildingByCity(String city) {
		repo.findByCity(city);
	}
	
	public Building findBuildingById(Long id) {
		return repo.findById(id).get();
	}
}
