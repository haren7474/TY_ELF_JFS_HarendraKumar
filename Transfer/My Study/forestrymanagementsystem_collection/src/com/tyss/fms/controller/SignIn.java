package com.tyss.fms.controller;

import java.util.HashMap;
import java.util.Scanner;

public class SignIn {
	public static String signIn() {
		HashMap<String, String> loginMap = new HashMap<String, String>();
		loginMap.put("haren", "12345");
		loginMap.put("sweta", "12345");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter user id:");
		String userId = sc.nextLine();

		System.out.println("Please enter password:");
		String pass = sc.nextLine();

		if (loginMap.containsKey(userId)) {
			if (loginMap.get(userId).equals(pass)) {
				return userId;
			} else
				return null;
		} else
			return null;

	}
}
