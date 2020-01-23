import java.util.Scanner;

class checkPrimeNumber
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
int c=0;
System.out.println("Please enter a number to check if its a prime or not");
int num=sc.nextInt();


for(int i=2; i<num; i++)
{
	if(num%i==0)
	{
		c++;	
	}

}

if(c==0)
{
System.out.println("Prime");
}
else
{
System.out.println("not a prime");
}


}
}


