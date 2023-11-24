package com.exam.service;

import org.springframework.stereotype.Service;

import com.exam.entity.Admin;

@Service
public interface AdminService {
	
	public Admin findByUsername(String username);

}
