import java.util.Scanner;

class checkNumberWithMenu
{
public static Scanner sc=new Scanner(System.in);

public static void main(String[] args)
{
System.out.println("\n--------MAIN MENU--------------");
System.out.println("1. Check various types of a given Number \n2. Print various Number types between given range\n3. Read Definitions\n4. Exit");
System.out.println("-----------------------\n");

//Calling method display 
display();

}


public static void display()
{

System.out.println("\nPlease enter your choice\n");
int ch= sc.nextInt();

switch(ch)
	{
	case 1: checkmenu();
	case 2: printMenu();			
	case 3:	displayDefinitions();
	case 4: System.exit(0);
	default:System.out.println("Incorrect Choice\n");
	break;

	}
}

public static void checkmenu()
{
System.out.println("\nPlease enter a number to perform varios actions\n");
int num= sc.nextInt();

while(true)
{
System.out.println("\n--------SUB MENU--------------");
System.out.println("1. Calculate Factorial\n2. Check Prime Number\n3. Check Perfect Numer\n4. Check Palindrom\n5. Check Strong Number\n6. Check Armstrong Number\n7. Check all in one click\n8. Check Armstrong digit\n9. Exit");
System.out.println("-----------------------\n");


System.out.println("\nPlease enter your choice:");
int choice= sc.nextInt();


switch(choice)
{
case 1: System.out.println("\n***Here is your answer***");
		int fact = factorial(num);
		System.out.println("******Factorial of " + num + " is " + fact+"*******\n");
		break;

case 2: System.out.println("***Here is your answer***");
		checkPrime(num);
		break;

case 3: System.out.println("***Here is your answer***");
		checkPerfect(num);
		break;

case 4: System.out.println("***Here is your answer***");
		checkPalindrom(num);
		break;

case 5: System.out.println("***Here is your answer***");
		checkStrong(num);
		break;

case 6: System.out.println("***Here is your answer***");
		checkArmstrong(num);
		break;

case 7: System.out.println("***Here are your combined answers***");
		int fact2 = factorial(num);
		System.out.println("******Factorial of " + num + " is " + fact2+"*******\n");
		checkPrime(num);
		checkPerfect(num);
		checkPalindrom(num);
		checkStrong(num);
		checkArmstrong(num);
		break;

case 8:System.out.println("***Here is your answer***");
		checkArmstrongDigit(num);
		break;


case 9: System.exit(0);


default:System.out.println("Incorrect Choice\n");
	break;

	}
	}
}


//Range Menu

public static void printMenu()
{
			System.out.println("Please enter lower range number");
			int low = sc.nextInt();
			
			System.out.println("Please enter upper range number");
			int up = sc.nextInt();
			

			while(true)
			{
			System.out.println("\n-----------------SUB MENU-------------------");
			System.out.println("1. Find Perfect numbers in a given range \n2. Find Strong Numbers in a given range \n3. Find Armstrong Numbers in a given range\n4. Find prime numbers in given range\n5. Check all in one click \n6. Print Fibonacci\n7. Exit");
			System.out.println("-----------------------\n");
			System.out.println("\nPlease enter your choice\n");

			int ch1= sc.nextInt();

				switch(ch1)
				{	
					case 1: System.out.println("***Here is your answer***");
							printPerfect(low, up);
							break;


					case 2: System.out.println("***Here is your answer***");
							printStrong(low, up);
							break;
										
					case 3: System.out.println("***Here is your answer***");
							printArmstrong(low, up);
							break;

					case 4: System.out.println("***Here is your answer***");
							printPrime(low, up);
							break;

					case 5: System.out.println("***Here are your combined answers***");
							printPerfect(low, up);
							printStrong(low, up);
							printArmstrong(low, up);
							printPrime(low, up);
							break;

					case 6: printFibonacci(low, up);
							System.out.println("***Here is your answer***\n");
							break;

					case 7: System.exit(0);


					default:System.out.println("Incorrect Choice\n");
					break;
					
				}
			}
}


// Display Definitions

public static void displayDefinitions()
{
		System.out.println("\n~~~FACTORIAL OF A NUMBER~~~>>> the product of an integer and all the integers below it; e.g. factorial four is: 24\n");
		System.out.println("~~~PRIME NUMBER~~~>>> a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).\n");
		System.out.println("~~~PERFECR NUMBER~~~>>> a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself. (e.g. 6 is 1+2+3)\n");
		System.out.println("~~~PALINDROM~~~>>> a word, phrase, or sequence that reads the same backwards as forwards, e.g. 1555551\n");
		System.out.println("~~~STRONG NUMBER~~~>>> numbers whose sum of factorial of digits is equal to the original number. Example: 145 is a strong number\n");	
		System.out.println("~~~ARMSTRONG NUMBER~~~>>> numbers whose sum of cubes of digits is equal to the original number. Example: 153 is an armstrong number\n");	
}


// Calculate Factorial
public static int factorial(int num)
{
int mult = 1;

while(num>1)
{
mult= mult*num;
num--;

}
return mult;
}


// Check Prime
public static void checkPrime(int num)
{
int c=0;
for(int i=2; i<num; i++)
{
	if(num%i==0)
	{
		c++;	
	}

}

if(c==0)
{
System.out.println("******Prime Number********\n");
}
else
{
System.out.println("********Not a Prime Number*********\n");
}
}



//Check Perfect Number
public static void checkPerfect(int num)
{
int sum=0;

	for(int j=1; j<num;j++)
	{
		if(num%j==0)
		{
		sum= sum+j;
		}
	}
	
	if(sum==num)
	{
	System.out.println("******"+ num +" is a perfect number************\n");
	}
	
	else
	{ System.out.println("*****"+ num + " is not a perfect number*******\n");	
	}

}


//Check Palindrom
public static void checkPalindrom(int num)
{
int temp=num;
int rev=0;

while(num>0)
{
int rem= num%10;
rev = rev*10+rem;
num=num/10;
}

if(rev==temp)
{
System.out.println("**********"+temp+" is a palindrom **************\n");
}
else
{
System.out.println("***********"+temp +" is not a palindrom*********\n");
}

}


//Check Strong Number
public static void checkStrong(int num)
{
int temp=num;
int sum=0;
int rem;

while(num>0)
{
rem= num%10;
sum = sum+factorial(rem);
num=num/10;
}

if(sum==temp)
	{
	System.out.println("******"+temp+" is a Strong Number******\n");
	}
else
	{
	System.out.println("********"+temp+" is not a Strong Number*******\n");
	}
}



//Check Armstrong
public static void checkArmstrong( int num)
	{
	int sum =0;
	int temp=num;
	while(num>0)
		{
			int rem= num%10;
			sum = sum+(rem*rem*rem);
			num=num/10;

		}

		if(sum==temp)
		{
			System.out.println("****** "+temp+" is an Armstrong Number******\n");
		}
			else
		{
			System.out.println("******** "+temp+" is not an Armstrong Number*******\n");
		}


	}


	//Check Armstrong with digit count
	public static void checkArmstrongDigit( int num)
	{
	int sum =0;
	int temp=num;
	int count=0;

	while(num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;

	while(num>0)
		{
			int rem= num%10;
			int prod=1;

			for(int i=0; i<count;i++)
			{
				prod=prod*rem;
			}
			sum = sum+prod;
			num=num/10;

		}

		if(sum==temp)
		{
			System.out.println("****** "+temp+" is an Armstrong Number******\n");
		}
			else
		{
			System.out.println("******** "+temp+" is not an Armstrong Number*******\n");
		}


	}

// Print Prime
public static void printPrime(int low, int up)
{
System.out.println("List of Prime Numbers\n");

for(int j=low; j<=up;j++)
	{
int c=0;
for(int i=2; i<j; i++)
{
	if(j%i==0)
	{
		c++;	
	}

}

if(c==0)
{
System.out.print(j+"   ");
}
}
}


//Print Perfect Number in a range
public static void printPerfect(int low, int up)
{	

	System.out.println("List of Perfect numbers in range is:");
	for(int i=low; i<=up; i++)
	{
		
		int sum=0;
		for(int j=1; j<i;j++)
		{
			if(i%j==0)
			{
			sum= sum+j;
			}
		}
	
		
		if(sum==i)
		{
		System.out.println(i);
		}
	
	}
	
}


//Print Strong Numbers
public static void printStrong(int low, int up)
	{
		System.out.println("List of Strong numbers is:");

		for(int i= up; i>=low; i--)
			{
			int sum=0;
			int rem;
			for(int j= i; j>=1;)
				{
				rem= j%10;
				int fact= factorial(rem);
				sum = sum+fact;
				j=j/10;
				}
					if(sum==i)
					{
					System.out.println(i);
					}
			}
		}



//Print Armstrong
public static void printArmstrong( int low, int up)
	{
	System.out.println("List of Armstrong numbers is:");
	for(int i=low; i<=up;i++)
		{
			int sum =0;
			for(int num=i; num>0;)
			{
				int rem= num%10;
				sum = sum+(rem*rem*rem);
				num=num/10;

			}

			if(sum==i)
			{
				System.out.println(i);
			}
			}


	}

public static void printFibonacci(int n1, int n2)
	{
			System.out.println("Please enter Length");
			int len = sc.nextInt();

			if(len==1)
		{
			System.out.println(n1);	
		}
				else if(len==2)
		{
			System.out.println(n1);	
			System.out.println(n2);
		}

		else
		{
			System.out.println(n1);	
			System.out.println(n2);
			
			for(int i=2; i<len; i++)
			{
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			}

		}

	}

	

}

