package edu.jspiders.hibernatehql.generator;

import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyCustomGeneratorWithString implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException 
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hehm15_db?user=root&password=");
			stmt = con.createStatement();

			rs = stmt.executeQuery("select max(emp_id) from employee_info_auto_pk");
			
			if (rs.next())
			{
				 String lastEmpId=rs.getString(1);
				 int maxNum=Integer.parseInt(lastEmpId.replaceAll("[^0-9]", "")) + 1;
				 return "JSP"+ maxNum;
			}
			
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

		return "JSP"+1;
	}

}
