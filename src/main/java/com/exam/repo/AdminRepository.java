package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	public Admin findByUsername(String username);

}
