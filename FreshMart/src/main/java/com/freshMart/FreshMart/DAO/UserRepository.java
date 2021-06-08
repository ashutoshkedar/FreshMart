package com.freshMart.FreshMart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshMart.FreshMart.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	public User findByUserName(String userName);
}
