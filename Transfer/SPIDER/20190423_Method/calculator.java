import java.util.Scanner;
class calculator
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);


System.out.println("Please Enter Number 1");
int a = reader.nextInt();

System.out.println("Please Enter Number 2");
int b = reader.nextInt();

while(true)
{
System.out.println("Please Enter\n 1 for Addition\n 2 for Diff \n 3 for Prod \n 4 for Div\n 5 To Exit");
int choice = reader.nextInt();



switch(choice)
{
case 1: int sum = add(a,b);
	System.out.println(" Sum is = " + sum);
	break;

case 2: int dif = diff(a,b);
	System.out.println(" Diff is = " + dif);
	break;

case 3: int prod = mult(a,b);
	System.out.println(" Prod is = " + prod);
	break;

case 4: int divi = div(a,b);
	System.out.println(" Div is = " + divi);
	break;
case 5: System.exit(0);

default:System.out.println(" Invalid Choice");
	break;
}
}
}

public static int add(int a, int b)
{
return a+b;
}

public static int diff(int a, int b)
{
return a-b;
}

public static int mult(int a, int b)
{
return a*b;
}

public static int div(int a, int b)
{
return a/b;
}


}