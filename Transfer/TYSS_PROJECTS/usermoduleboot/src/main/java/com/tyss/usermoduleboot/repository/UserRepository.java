package com.tyss.usermoduleboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.usermoduleboot.dto.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

	public UserBean findByEmail(String email);
}
