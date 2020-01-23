class  PenDetail
{
	public static void main(String[] args) 
	{
		Pen p1= new Pen("Dark Red", 20.1);
		Pen p2= new Pen("Mirror Black", 15);
		Pen p3= new Pen("Red");
		Pen p4= new Pen(50,"Glitter");


		System.out.println("Name in p1: " + p1.pPrice);
		System.out.println("Name in p1: " + p1.pColor);

		System.out.println("\nName in p2: " + p2.pPrice);
		System.out.println("Name in p2: " + p2.pColor);
		


		System.out.println("\nName in p3: " + p3.pColor);

		System.out.println("\nName in c5: " + p4.pColor);
		System.out.println("Name in c5: " + p4.pPrice);
	}
}	

class Pen
{
	String pColor;
	double pPrice;
	
	Pen(String color, double price)
	{
		pColor= color;
		pPrice= price;
	}

	Pen(String color)
	{
		pColor= color;
	}

	Pen(double price, String color)
	{
		pPrice= price;
		pColor= color;
	}
}