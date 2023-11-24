package com.exam.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.exam.entity.User;
import com.exam.entity.UserRole;

@Service
public interface UserService {
	
	//creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    public User getUser(String username);
    public void deleteUser(Long userId);
    public User getUserByUsername(String username);
    //public User updateUser(String username,User user);

   
}
