package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser 
{
	public static void main(String[] args) 
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
			System.out.println("User Updated with new email id as " + user.getEmail());
		}
		else
		{
			System.err.println("Something went wrong...Could not update");
		}
				
	}
}
