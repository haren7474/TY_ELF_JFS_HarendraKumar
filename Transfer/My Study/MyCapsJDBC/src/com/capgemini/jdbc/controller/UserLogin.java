package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin 
{
	public static void main(String[] args) 
	{
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user= new UserBean();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter User Name");
		user.setUserName(sc.nextLine());
	
		System.out.println("Please enter password");
		user.setPassword(sc.nextLine());
		
		UserBean result=services.userLogin(user.getUserName(), user.getPassword());
		if(result!=null)
		{
			System.out.println("Login Successful....");
			System.out.println("UserId: "+ result.getUserId());
			System.out.println("UserName: "+ result.getUserName());
			System.out.println("Email: "+ result.getEmail());
		}
		
		else
		{
			System.err.println("Something went wrong...Could not log you in");
		}
	}
}
