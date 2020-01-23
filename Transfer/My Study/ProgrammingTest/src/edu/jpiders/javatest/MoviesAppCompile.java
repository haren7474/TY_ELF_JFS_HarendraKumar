package edu.jpiders.javatest;

import java.util.Scanner;

public class MoviesAppCompile 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Horror\n2.Comedy\n3.Thriller\n\nPlease enter your choice");
		
		int choice= sc.nextInt();
		MoviesFac_CompileTime mf= new MoviesFac_CompileTime();
		
		
		switch(choice)
		{
		case 1: String name= mf.getMovie(new Horror()).getName();
				System.out.println(name);
				break;
				
		case 2:  name= mf.getMovie(new Comedy()).getName();
				System.out.println(name);
				break;
		
		case 3:  name= mf.getMovie(new Thriller()).getName();
				System.out.println(name);
				break;
		
		case  4: System.exit(0);
			break;
				
		
		}

	}
}
