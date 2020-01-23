import java.util.Scanner;

class userInput
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

while(true)
{
System.out.println("1: Check if even\n2. Check if Odd\n3. Exit");
int choice=sc.nextInt();

switch(choice)
{
	case 1: System.out.println("Please enter a number");
		int a=sc.nextInt();
		
		boolean b = checkEven(a);
		System.out.println(b);
		break;
	case 2: System.out.println("Please enter a number");
		int n=sc.nextInt();

		boolean bo = checkOdd(n);
		System.out.println(bo);
		break;
	case 3: System.exit(0);
}
}

}

public static boolean checkEven(int a)
{
if(a%2==0)
return true;
else 
return false;
}

public static boolean checkOdd(int b)
{
if(b%2==1)
return true;
else 
return false;
}

}