package com.tyss.phonesimulator.controller;

public class Validation {
	public static boolean checkName(String cname) {
		return cname.matches("[A-Z][a-z]*") && cname.length()>3 && cname.length()<10;
	}
}
