package com.tyss.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput 
{
	public static void main(String[] args)
	{
		try {
			FileOutputStream f1= new FileOutputStream("anu.txt");			
			String s1="Divya Kumar Khosla";
			byte b[]= s1.getBytes();
			f1.write(b);
			System.out.println("File created!!!");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
