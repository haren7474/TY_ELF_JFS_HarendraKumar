import java.util.Scanner;
class calculator
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
int a;
int b;

System.out.println("Please Enter Number 1");
a = reader.nextInt();

System.out.println("Please Enter Number 2");
b = reader.nextInt();

System.out.println("Please Enter\n 1 for Addition\n 2 for Diff \n 3 for Prod \n 4 for Div");
int choice = reader.nextInt();


switch(choice)
{
case 1: System.out.println(" Sum is = " + (a+b));
	break;

case 2: System.out.println(" Diff is = " + (a-b));
	break;

case 3: System.out.println(" Prod is = " + (a*b));
	break;

case 4: System.out.println(" Div is = " + (a/b));
	break;
default:System.out.println(" Invalid Choice");
	break;

}
}
}