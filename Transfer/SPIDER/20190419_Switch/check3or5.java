import java.util.Scanner;
class check3or5
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);
int a;

System.out.println("Please Enter a Number");
a = reader.nextInt();


System.out.println("Please Enter\n 1 to check div by 3\n 2 to check Div by 5");
int choice = reader.nextInt();

switch(choice)
{
case 1: 
if(a%3 == 0)
{
System.out.println(a+ " is divisible by 3 = " + ++a);
}

else
{
System.out.println(a+ " is not divisible by 3");
}
	break;

case 2: if(a%5 == 0)
{
System.out.println(a+ " is divisible by 5 = " + --a);

}
else
{
System.out.println(a+ " is not divisible by 5");
}
	break;

default:System.out.println(" Invalid Choice");
	break;

}
}
}