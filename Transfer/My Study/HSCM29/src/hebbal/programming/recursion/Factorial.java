package hebbal.programming.recursion;

public class Factorial 
{

	public static void main(String[] args) 
	{
		System.out.println(factorial(8));
	}
	static int fact =1;
	public static int factorial(int n)
	{
		if(n==1)
			{
				return 1;
			}	
		
		fact= n*factorial(n-1);
		return fact;
		}
}
