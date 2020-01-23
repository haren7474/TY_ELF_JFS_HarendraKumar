class areaOfCircle
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		final double pi=3.14;
		double rad=5.34;
		areaOfCircle(pi, rad); // Method Call, Caller Main Morhod
		System.out.println("Main method ended");
	}

	public static void areaOfCircle(double pi, double rad)
	{
		double area=pi*rad*rad;
		printResult(area); //Method call Caller areaOfCircle Method
	}

	public static void printResult(double  area)
	{	
		System.out.println("Area of circle is = "+area+" cm square");
	}
}
