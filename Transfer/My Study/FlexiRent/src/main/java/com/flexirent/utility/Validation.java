package com.flexirent.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation 
{
		public static boolean checkEmail(String email) 
		{
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
					+ "A-Z]{2,7}$";

			Pattern pat = Pattern.compile(emailRegex);
			if (email == null)
				return false;
			Boolean bool = pat.matcher(email).matches();
			if (bool == true) {
				return true;
			} else {
				System.out.println("Incorrect Email, try again\n");
				return false;
			}
		}
		
		public static boolean isStringEmpty(String string)
		{
	        return "".equals(string);
		}
		
		public static boolean checkDateFormat(String s) {
			Pattern p = Pattern.compile("^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$");
			Matcher m = p.matcher(s);
			Boolean bool = (m.find() && m.group().equals(s));
			if (bool == true) {
				return true;
			} else {
				System.out.println("Incorrect date format, try again\n");
				return false;
			}
		}
		
		public static boolean checkNotNullUserId(Integer userId)
		{
			if (userId != null) 
				return true;
			else return false;
		}


}
