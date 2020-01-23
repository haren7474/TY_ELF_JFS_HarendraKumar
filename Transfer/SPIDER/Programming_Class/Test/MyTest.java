import java.util.Scanner;

public class MyTest
{
	static Scanner sc = new Scanner(System.in);
	public static int getNumber()
	{
		System.out.println("Please enter a number");
		return sc.nextInt();
	}
		
 
	public static void main(String[] args)
	{
		int num1=0, num2=0;

		System.out.println("Please Enter Your choice");
		int choice= sc.nextInt();

		switch(choice)
		{
			case 1: 
					q1findBiggestPrime(getNumber(), getNumber());
					break;

			case 2: 
					int res= q2sumOfDigits(getNumber());
					System.out.println(res);
					break;
				
			case 4: 
					q4checkArmstrong(getNumber());
					break;

			case 5:	
					q5biggestOddDigit(getNumber());
					break;

			case 6: 
					q6checkSpecialNumber(getNumber());
					break;

			case 7: 
					q7Pattern(getNumber());
					break;

			case 20: System.exit(0);
			
			default:
			System.out.println("Invalid choice");
		}

	}

	

	public static void q1findBiggestPrime(int n1, int n2)
	{	
		int largestPrime=0;
		int n=n1+1;
			while(n<n2)
			{
				
				int count=0;
				for(int i=2; i<=n/2;i++)
				{
					if(n%i==0)
					{
					count++;
					break;
					}
				}

				if(count==0)
				{
					largestPrime=n;
				}
			n++;
			}

		System.out.println("Largest prime is "+ largestPrime);
	}

	public static int q2sumOfDigits(int n)
	{
		int sum=0;
		int rem=0;
		
		if(n==0)
		{
			return 0;
		}
		rem=n%10;
		n=n/10;
		return  rem + q2sumOfDigits(n);
	}

	public static void q5biggestOddDigit(int n)
	{
		int biggest=0;
		int rem=0;
		while(n>0)
		{
			rem= n%10;
			if(rem> biggest)
			{
			biggest= rem;
			}
			n=n/10;
		}
		System.out.println(biggest+ " is the biggest number");	
	}

	 public static void q4checkArmstrong(int n)
     	{
	int num=n;
	int digit=0;
	int sum=0;
	int rem=0;

		while( num != 0)
		{
			num= num/10;
			digit++;
		}
		
		num=n;

		while(num!=0)
		{
		  rem= num%10;

		  sum= sum+ powerOfDigit(digit, rem);	
		  num=num/10;
		}
		 
		if(sum==n)
		{
			System.out.println(n+ " is an armstrong number");
		}

		else
		{
			System.out.println(n+ " is not an armstrong number");
		}
     	}

		public static int powerOfDigit(int digit, int rem)
		{
			int product=1;
			for(int i=0; i<digit;i++)
			{
				product= product*rem;
			}
				return product;
		}

	public static void q6checkSpecialNumber(int num)
	{
		int sum=0;
		int rem;
		int n= num;
		while(n>0)
		{
			rem= n%10;
			sum= sum+ calculateFactorial(rem);
			n/=10;
		}

		if(num==sum)
		{
			System.out.println(num+ " is a special number");
		}

		else
		{
			System.out.println(num+ " is not a special number");
		}	
	}

	public static int calculateFactorial(int num)
	{	int n=num;
		int fact=1;
		while(n>1)
		{
		fact=fact*n;
		n--;
		}
		return fact;
	}

	public static void q7Pattern(int length)
	{
		int n=1;
		char ch1= 'A';
		char ch2= 'a';
		int len= length/4;

		for(int i=1; i<=len;i++)
		{
			for(int j=1; j<=4;j++)
			{
				if(i%4==0)
				{
				System.out.print(ch2++);
				ch1++;
				}

				else if (i%2==0)
				{
				System.out.print(ch1++);
				ch2++;
				}

				else
				{
				System.out.print(n++);
				}
			}
		}
	}

	

	


}