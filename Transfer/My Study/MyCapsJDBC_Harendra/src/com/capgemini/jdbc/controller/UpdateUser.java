package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser 
{
	public static boolean update()
	{
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter User ID");
		user.setUserId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Please Enter Email");
		user.setEmail(sc.nextLine());
		
		System.out.println("Please enter password");
		user.setPassword(sc.nextLine());
		
		if(services.updateUser(user.getUserId(), user.getPassword(), user.getEmail()))
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
}
