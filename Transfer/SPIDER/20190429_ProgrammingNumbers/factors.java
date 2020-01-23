import java.util.Scanner;

class factors
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Please enter a number to check its factors");
int num=sc.nextInt();


System.out.println("Factors of the number:"+num+" are");
for(int i=1; i<=num; i++)
{
	if(num%i==0)
	{
		System.out.println(i);	
	}

}


}
}


