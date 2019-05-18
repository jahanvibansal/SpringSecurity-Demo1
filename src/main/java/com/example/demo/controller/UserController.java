package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	public String getData() {
		return "User1";
	}
	
	@GetMapping("/secured")
	@PreAuthorize("hasRole('ADMIN')")
	public String getData_Secured() {
		return "Admin";
	}

}
