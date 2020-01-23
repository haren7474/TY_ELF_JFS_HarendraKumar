package edu.jpiders.javatest;

public class MoviesFactory 
{
	public static Movies getMovies(String s)
	{
		Movies m= null;
		if(s.equalsIgnoreCase("horror"))
		{
			m= new Horror();
		}
		
		else if(s.equalsIgnoreCase("comedy"))
		{
			m= new Comedy();
		}
		
		else
		{
			m= new Thriller();
		}
		
		return m;
	}
}
