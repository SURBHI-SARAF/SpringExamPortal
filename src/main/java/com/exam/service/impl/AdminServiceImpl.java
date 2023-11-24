package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.Admin;

import com.exam.repo.AdminRepository;
import com.exam.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin findByUsername(String username) {
		
		return this.adminRepository.findByUsername(username);
	}

}
