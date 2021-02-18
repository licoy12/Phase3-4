package com.simplilearn.phase3end.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.phase3end.model.UserDetailEntity;
import com.simplilearn.phase3end.model.UserEntity;
import com.simplilearn.phase3end.repository.UserEntityRepository;


@Service
public class MyUserDetailService implements UserDetailsService{
	
	private static Logger logger = LoggerFactory.getLogger(MyUserDetailService.class);
	
	@Autowired
	UserEntityRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserEntity> user = repo.findByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Username: "+username+" does not exist"));
		return user.map(UserDetailEntity::new).get();
		
	}

}


