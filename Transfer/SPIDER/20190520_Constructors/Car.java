class  CarDetail
{
	public static void main(String[] args) 
	{
		Car c1= new Car("Ferrari" , "Dark Red", 1915);
		Car c2= new Car("RR", "Mirror Black", 1965);
		Car c3= new Car("Merc" , "Red", 1857);
		Car c4= new Car("BMW");
		Car c5= new Car(2000, "White");

		System.out.println("Name in c1: " + c1.cName);
		System.out.println("Name in c1: " + c1.cColor);
		System.out.println("Name in c1: " + c1.cYom);

		System.out.println("\nName in c2: " + c2.cName);
		System.out.println("Name in c2: " + c2.cColor);
		System.out.println("Name in c2: " + c2.cYom);
		
		System.out.println("\nName in c3: " + c3.cName);
		System.out.println("Name in c3: " + c3.cColor);
		System.out.println("Name in c3: " + c3.cYom);

		System.out.println("\nName in c4: " + c4.cName);

		System.out.println("\nName in c5: " + c5.cYom);
		System.out.println("Name in c5: " + c5.cColor);
	}
}	

class Car
{
	String cName;
	String cColor;
	int cYom;

	Car(String name, String color, int yom)
	{
		cName= name;
		cColor= color;
		cYom= yom;
	}

	Car(String name)
	{
		cName= name;
	}

	Car(int yom, String color)
	{
		cYom= yom;
		cColor= color;
	}
}