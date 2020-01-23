package edu.web.tests.geeks;

import java.util.ArrayList;
import java.util.List;

public class RearrangePalindrom {

	public static void main(String[] args) 
	{
		String s="aabbcc";
		char[] ch=s.toCharArray();
		char[] chEven= new char[s.length()];
		List<Character> l= new ArrayList<Character>();
		
	
		for (int i = 0; i < ch.length; i++) 
		{
			l.add(ch[i]);
		}
		
		for (int i = 0; i < l.size(); i++) 
		{
			Character c= l.get(i);
			
		}

	}

}
