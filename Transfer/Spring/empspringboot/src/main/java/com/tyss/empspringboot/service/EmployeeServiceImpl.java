package com.tyss.empspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tyss.empspringboot.dto.EmployeeAddressBean;
import com.tyss.empspringboot.dto.EmployeeBean;
import com.tyss.empspringboot.exception.EmployeeException;
import com.tyss.empspringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		EmployeeBean bean = repository.findByEmail(email);
		if (bean != null) {
			if (encoder.matches(password, bean.getPassword())) {
				return bean;
			}
			throw new EmployeeException("Password not matching");
		} else {
			throw new EmployeeException("Email does not exist");
		}
	}

	@Override
	public boolean register(EmployeeBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword()));
		
		for (EmployeeAddressBean employeeAddressBean : bean.getAddressBeans()) {
			employeeAddressBean.setBean(bean);
		}
		repository.save(bean);
		return true;
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		return repository.findByKey(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		String encodedPassword= encoder.encode(password);
		repository.changePassword(id, encodedPassword);
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

}
