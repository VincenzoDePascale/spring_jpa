package com.jpa_project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpa_project.model.User;
import com.jpa_project.repository.UserDAORepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired private UserDAORepository repo;
	
	@Autowired @Qualifier("FakeUser") private ObjectProvider<User> fakeUserProvider;
	
	public User insertUser(User u) {
		repo.save(u);
		return u;
	}
	
	public void createFakeUser() { 
		insertUser(fakeUserProvider.getObject());
	}	
	
	public User findUserByID(Long id) {
		return repo.findById(id).get();
	}
	
	public List<User> findAllUser() {
		return (List<User>) repo.findAll();
	}
	
	public User removeUser(User u) {
		repo.delete(u);
		return u;
	}
	
	public String removeUserById(Long id) {
		repo.deleteById(id);
		return "User deleted";
	}
	
	public User updateUser(User u) {
		repo.save(u);
		return u;
	}
		
	public void User(String name, String lastname) {
		repo.findByNameAndLastname(name, lastname);
	}
}
