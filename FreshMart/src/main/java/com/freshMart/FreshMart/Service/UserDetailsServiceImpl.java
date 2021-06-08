package com.freshMart.FreshMart.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.User;

import com.freshMart.FreshMart.DAO.UserRepository;
import com.freshMart.FreshMart.Model.User;

import java.util.Set;
import java.util.HashSet;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("Entered User name is :"+ username);
		
		User user = userRepository.findByUserName(username);
		
		if(user==null)  throw new UsernameNotFoundException(username);
		
		Set<GrantedAuthority> roles = new HashSet<>();
		
		roles.add(new SimpleGrantedAuthority(user.getRole().name()));
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), roles);
	}
	
}
