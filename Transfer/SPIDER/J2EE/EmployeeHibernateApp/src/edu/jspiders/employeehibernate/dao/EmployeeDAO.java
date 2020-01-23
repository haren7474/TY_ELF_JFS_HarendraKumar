package edu.jspiders.employeehibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.employeehibernate.dto.EmployeeDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class EmployeeDAO 
{
	
	public void create(EmployeeDTO emp) 
	{
		SessionFactory factory= SingletonFactory.getFactory();
		Session session = factory.openSession();
		session.save(emp);
		session.beginTransaction().commit();
		session.close();
	}

	public EmployeeDTO readById(int empId) 
	{
		EmployeeDTO empDto = null;

		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();
		empDto = session.get(EmployeeDTO.class, empId);

		if (empDto == null) 
		{
			System.out.println("No such Id found");
		} else {
			System.out.println(empDto);
		}
		return empDto;
	}

	public void updateById(Object updatedData, int choice, int empId) 
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();

		EmployeeDTO std = session.get(EmployeeDTO.class, empId);

		if (std != null) 
		{
			if (choice == 1) 
			{
				String updatedName = (String) updatedData;
				std.setEmpName(updatedName);
			}
			else if (choice == 2) 
			{
				double updatedSalary = (Double) updatedData;
				std.setEmpSalary(updatedSalary);
			} 
			else if (choice == 3) 
			{
				String updatedDepartment = (String) updatedData;
				std.setEmpDepartment(updatedDepartment);
			}
			session.update(std);
			Transaction tx = session.beginTransaction();
			tx.commit();
			System.out.println("Updated successfully!");
		}

		else 
		{
			System.out.println("No such employee is present");
		}

		session.close();
	}

	public void deleteById(int empId) 
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		EmployeeDTO std = session.get(EmployeeDTO.class, empId);
		session.delete(std);

		tx.commit();

		System.out.println("Deleted successfully!");

		session.close();
	}

	@SuppressWarnings("unchecked")
	public List displayAllRecords() {
		Session session = null;
		List empList = new ArrayList();
		try 
		{
			SessionFactory factory = SingletonFactory.getFactory();
			session = factory.openSession();

			empList = session.createQuery("FROM EmployeeDTO").list();
		}

		catch (Exception sqlException) {
			if (null != session.getTransaction()) {
				session.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		}

		finally {
			if (session != null) {
				session.close();
			}
		}
		return empList;
	}

}
