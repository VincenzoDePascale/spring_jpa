package com.jpa_project.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa_project.model.Reservation;
import com.jpa_project.repository.ReservationDAORepository;

@Service
public class ReservationService {
	
	@Autowired private ReservationDAORepository repo;
	
	@Autowired @Qualifier("FakeReservation") private ObjectProvider<Reservation> fakeReservationProvider;
	
	public void insertReservation(Reservation r) {
		repo.save(r);
	}
	
	public void deleteReservation(Reservation r) {
		repo.delete(r);
	}
	
}
