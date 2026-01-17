package com.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableMethodSecurity
public class UserController {
	
	@GetMapping("/")
	public String homepage()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String loginpage()
	{
		return "login";
	}
	
	@GetMapping("/read")
	public String userPage()
	{
		return "USER AND ADMIN CAN READ THE DATA";
	}
	
	@GetMapping("/delete")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String adminPage()
	{
		return "ONLY ADMIN CAN DELETE DATA";
	}
	
	@GetMapping("/update")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String updateUsers()
	{
		return "Details Updated";
	}
}
