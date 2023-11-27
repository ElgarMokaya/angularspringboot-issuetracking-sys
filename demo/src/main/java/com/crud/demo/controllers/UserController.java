package com.crud.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.services.UserService;

import DTO.UserDTO;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private final UserService userService;
	
	public UserController( UserService userService) {
		this.userService=userService;
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO){
		userService.registerUser(userDTO);
		return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
		}

}
