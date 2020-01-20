package com.tyss.retailermaintenencesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.retailermaintenencesystem.dto.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

	public UserBean findByEmail(String email);
}
