import java.util.Scanner;

class areaCalculation
{
public static void main(String[] args)
{
while(true)
{
Scanner sc = new Scanner(System.in);

System.out.println("1. Area of Square\n2. Area of Ractangle\n3. Area of Triangle\n4. Area of Circle\n5. Exit the menu");
System.out.println("Please enter your choice");
int choice = sc.nextInt();

switch(choice)
{
	case 1: System.out.println("Please enter side of square in cm");
		double side = sc.nextDouble();
		double aos = areaOfSquare(side);
		System.out.println("Area of Square is: " + aos +"cm square");
		break;

	case 2: System.out.println("Please enter length of ractangle in cm");
		double length = sc.nextDouble();
		System.out.println("Please enter breadth of ractangle in cm");
		double breadth = sc.nextDouble();

		double aor = areaOfRactangle(length, breadth);
		System.out.println("Area of Rectanle is: " + aor +"cm square");
		break;

	case 3: System.out.println("Please enter base of triangle in cm");
		double base= sc.nextDouble();
		System.out.println("Please enter height of triangle in cm");
		double height= sc.nextDouble();

		double aot = areaOfTriangle(base, height);
		System.out.println("Area of Triangle is: " + aot +"cm square");
		break;

	case 4: System.out.println("Please enter radius of circle in cm");
		double radius= sc.nextDouble();
		double aoc = areaOfCircle(radius);
		System.out.println("Area of Circle is: " + aoc +"cm square");
		break;
	
	case 5: System.exit(0);

	default:System.out.println("Please enter valid choice");
		break;
}

}

}
public static double areaOfSquare(double side)
{
return side*side;
}

public static double areaOfRactangle(double length, double breadth)
{
return length*breadth;
}

public static double areaOfTriangle(double base, double height)
{
return .5*base*height;
}

public static double areaOfCircle(double radius)
{
return 3.14*radius*radius;
}

}