import java.util.Scanner;
class Oddeven
{
	public static boolean oddEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


class AreaOfCircle
{
	public static void areaOfCircle(double rad)
	{
		final double pi= 3.14;
		double area = pi*rad*rad;

		System.out.println("Area of Circle is "+ area);
	}
}

class program
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Maine Method starts");

		System.out.println("Please Enter A number to check odd even");
		int num= sc.nextInt();


		System.out.println("Please Enter radius to calculate area");
		double rad= sc.nextDouble();


		// Check Odd Even
		if(Oddeven.oddEven(num))
		{
		System.out.println("Status of number is even");
		}
		else
		{
		System.out.println("Status of number is odd");	
		}


		//Area 
		System.out.println("Area of Circle: ");
		AreaOfCircle.areaOfCircle(rad);


		System.out.println("Maine Method starts");

	}
}
