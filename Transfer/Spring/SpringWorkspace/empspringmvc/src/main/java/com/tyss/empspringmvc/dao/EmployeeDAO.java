package com.tyss.empspringmvc.dao;

import java.util.List;

import com.tyss.empspringmvc.beans.EmployeeBean;

public interface EmployeeDAO {
		public EmployeeBean auth(String email, String password);
		public boolean register(EmployeeBean bean);
		//public EmployeeBean getEmployee(String email);
		public List<EmployeeBean> getEmployees(String key);
		public boolean changePassword(int id, String password);
}
