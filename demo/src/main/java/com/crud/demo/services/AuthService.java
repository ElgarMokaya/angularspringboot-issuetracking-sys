package com.crud.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.models.User;
import com.crud.demo.repositories.UserRepository;

@Service
public class AuthService {
	
	  private final UserRepository userRepository;

	    @Autowired
	    public AuthService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }
	    
	    public boolean authenticate(String username, String password) {
	        Optional<User> optionalUser = userRepository.findByUsername(username);

	        return optionalUser.isPresent() && optionalUser.get().getPassword().equals(password);
	    }

}
