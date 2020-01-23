import java.util.Scanner;

class factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number, to calculate its factorial");
int n= sc.nextInt();
int temp =n;
int mult = 1;

while(n>1)
{
mult= mult*n;
n--;

}
System.out.println("Factorial of " + temp + " is "+mult);

}
}
