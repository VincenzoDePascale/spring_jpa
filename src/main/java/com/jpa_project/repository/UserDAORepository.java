package com.jpa_project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa_project.model.User;

@Repository
public interface UserDAORepository extends CrudRepository<User, Long> {
	
	public List<User> findByUsername(String username);
	public List<User> findByEmail(String email);
	public List<User> findByNameAndLastname(String name, String lastname);
	
	}
