import java.util.Scanner;

class printPerfectNumber
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter upper range number");
	int k = sc.nextInt();
	System.out.println("List of Perfect numbers in range 1 and " + k);
	for(int i=1; i<=k; i++)
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
}