import java.util.Scanner;
class Oddeven
{
	public boolean oddEven(int num)
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
	public void areaOfCircle(double rad)
	{
		final double pi= 3.14;
		double area = pi*rad*rad;

		System.out.println("Area of Circle is "+ area);
	}
}

class CheckAreaAndOddEven
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
		Oddeven oe= new Oddeven();

		if(oe.oddEven(num))
		{
		System.out.println("Status of number is even");
		}
		else
		{
		System.out.println("Status of number is odd");	
		}


		//Area 
		AreaOfCircle aoc= new AreaOfCircle();
		System.out.println("Area of Circle: ");
		aoc.areaOfCircle(rad);


		System.out.println("Maine Method starts");

	}
}
