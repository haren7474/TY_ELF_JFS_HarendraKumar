import java.util.Scanner;

class sumOfDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number, to calculate digit sum");
int num= sc.nextInt();
int temp=num;
int sum=0;
int rem;

while(num>0)
{
rem= num%10;
sum = sum+rem;
num=num/10;
}
System.out.println("Sum of all digits of " + temp + " is "+ sum);

}
}
