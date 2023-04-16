package com.jpa_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa_project.model.User;
import com.jpa_project.model.Location;
import com.jpa_project.model.Reservation;

@Repository
public interface ReservationDAORepository extends CrudRepository <Reservation, Long>{
	
	public List<Reservation> findAll();
	
}
