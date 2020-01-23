package edu.jspiders.hibernateapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernateapp.dto.StudentDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class StudentDAO 
{
	
	public void create(StudentDTO student) 
	{
		//Configuration config = new Configuration();
		
		//Load all data present in cfg.xml file to object
		//config.configure().addAnnotatedClass(StudentDTO.class);
		
		//It helps hibernate to create connection pool
		//SessionFactory factory = config.buildSessionFactory();		
		SessionFactory factory = SingletonFactory.getFactory(); //By Using Singleton Factory
		
		//Its connection, here it is called session while in jdbc it was called connection.
		Session session = factory.openSession();

		//Save the student object which needs to be loaded to db
		session.save(student);
		
		//All commands are non commit, so we perform transaction to commit the changes.
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		//Close connection and destroy factory
		session.close();
		factory.close();
	}

	public StudentDTO readById(int studentId) 
	{
		StudentDTO sdto = null;
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();

		sdto = session.get(StudentDTO.class, studentId);

		if(sdto==null)
		{
			System.out.println("No such Id found");
		}
		else
		{
			System.out.println(sdto);
		}
		return sdto;
	}

	public void updateById(int studentId, double marks) 
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();		

		StudentDTO std = session.get(StudentDTO.class, studentId);
		
		if(std!=null)
		{
		std.setMarks(marks);
		session.update(std);
		Transaction tx = session.beginTransaction();
		tx.commit();		
		System.out.println("Updated successfully!");
		}
		
		else
		{
			System.out.println("Student not present");
		}

		
		session.close();
		factory.close();

	}
	
	public void deleteById(int studentId) 
	{
		SessionFactory factory = SingletonFactory.getFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		StudentDTO std=session.get(StudentDTO.class, studentId);
		session.delete(std);	
		
		tx.commit();

		System.out.println("Deleted successfully!");

		session.close();
		factory.close();
	}
	
	@SuppressWarnings("unchecked")
	public List displayAllRecords() 
	{
		Session session=null;
		 List studentsList = new ArrayList();        
	        try 
	        {
	    		SessionFactory factory = SingletonFactory.getFactory();
	    		session = factory.openSession();

	            studentsList = session.createQuery("FROM StudentDTO").list();
	        } 
	        
	        catch(Exception sqlException) 
	        {
	            if(null != session.getTransaction()) 
	            {
	                session.getTransaction().rollback();
	            }
	            sqlException.printStackTrace();
	        } 
	        
	        finally 
	        {
	            if(session != null) 
	            {
	                session.close();
	            }
	        }
	        return studentsList;
	}
	
}
