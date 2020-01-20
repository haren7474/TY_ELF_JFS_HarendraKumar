package com.tyss.empspringboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.empspringboot.dto.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, Integer>{
	
	//We don't give implementation for user defined methods also, 
	//findByEmail, so Email is field name and it searches on corresponding field
	
	public EmployeeBean findByEmail(String email);
	
	@Query("from EmployeeBean where name=:key or email=:key")
	public List<EmployeeBean> findByKey(@Param("key") String key);
	
	
	@Transactional
	@Modifying
	@Query("update EmployeeBean set password=:password where id=:id")
	public void changePassword(@Param("id") int id, 
			@Param("password") String password);

}
