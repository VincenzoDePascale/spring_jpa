package com.jpa_project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa_project.model.Building;

@Repository
public interface BuildingDAORepository extends CrudRepository<Building, Long>  {
	
	public List<Building> findByCity(String city);
	
}
