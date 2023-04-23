package com.jpa_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa_project.model.User;
import com.jpa_project.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<User>>(userService.findAllUser(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id){
		return new ResponseEntity<User>(userService.findUserByID(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.insertUser(user), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id){
		return new ResponseEntity<String>(userService.removeUserById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.CREATED);
	}
	
	
}
