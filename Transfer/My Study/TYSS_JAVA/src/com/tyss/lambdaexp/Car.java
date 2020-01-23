package com.tyss.lambdaexp;

public class Car 
{
	Vehicle v1= (a,b, c)-> 
	{
		System.out.println("This is Lambda Exp with sum value "+ (a+b) + " " + c);
		//If only 1 statement in the body then {} are optional.
		//If only 1 parameter is present then () are optional.
	};
}
