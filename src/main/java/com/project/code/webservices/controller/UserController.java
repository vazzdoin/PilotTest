package com.project.code.webservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.code.webservices.Model.User;
import com.project.code.webservices.exception.UserNotFoundException;
import com.project.code.webservices.service.UserDaoService;

@RestController
@RequestMapping("api/user/v1")
public class UserController {

	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getAllUsers(@PathVariable Integer id) {
		User user = userDaoService.getUserWithId(id); 
		if(user == null) {
			throw new UserNotFoundException("id : "+id);
		}
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> getAllUsers(@RequestBody User user) {
		User currentUser = userDaoService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
						.path("/{id}").buildAndExpand(currentUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
