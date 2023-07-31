package com.nt.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.nt.dto.UserRegistrationDto;
import com.nt.module.User;

public interface IUserSerivice extends UserDetailsService {
	public User save(UserRegistrationDto registrationDto);

}
