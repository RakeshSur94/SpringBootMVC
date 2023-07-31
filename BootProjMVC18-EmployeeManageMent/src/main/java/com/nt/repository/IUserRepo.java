package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.module.User;

public interface IUserRepo extends JpaRepository<User, Long> {
	public User findByEmail(String email);

}
