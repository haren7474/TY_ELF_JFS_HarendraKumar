package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class InsertUser 
{
	public static boolean insert() 
	{
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter User ID");
		user.setUserId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Please enter UserName");
		user.setUserName(sc.nextLine());
		
		System.out.println("Please Enter Email");
		user.setEmail(sc.nextLine());
		
		System.out.println("Please enter password");
		user.setPassword(sc.nextLine());
		
		if(services.insertUser(user))
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}

}
