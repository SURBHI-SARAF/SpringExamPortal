package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Admin;
import com.exam.entity.User;
import com.exam.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/{username}")
	public Admin findByUsername(@PathVariable ("username") String username)
	{
		return this.adminService.findByUsername(username);
	}

}
