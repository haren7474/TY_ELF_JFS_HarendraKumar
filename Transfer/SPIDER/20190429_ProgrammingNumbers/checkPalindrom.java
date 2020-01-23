import java.util.Scanner;

class checkPalindrom
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number");
int num= sc.nextInt();

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
System.out.println(temp+" is a palindrom");
}
else
{
System.out.println(temp +" is not a palindrom");
}

}
}
