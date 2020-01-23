package com.tyss.exceptions.custom.checked;

public class Election 
{
	void vote(int age) throws AgeLimitException
	{
		if(age<18)
		{
			throw new AgeLimitException("You can't vote");
		}
		
		else
		{
			System.out.println("Go and Vote");
		}
	}
}
