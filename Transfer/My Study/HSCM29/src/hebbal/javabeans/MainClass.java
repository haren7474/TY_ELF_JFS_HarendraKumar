package hebbal.javabeans;

public class MainClass 
{
	public static void main(String[] args) 
	{
		//--------------------Student----------------------------------------------------
		Student s1= new Student("Harendra", 1, 99);
		Student s2= new Student("Akshita", 2, 19);
		System.out.println("\n*****Student Example****");
		System.out.println(s1.getName()+" "+ s1.getId()+" "+s1.getMarks());
		System.out.println(s2.getName()+" "+ s2.getId()+" "+s2.getMarks());
		s2.setMarks(33);//Update		
		System.out.println(s2.getName()+" "+ s2.getId()+" "+s2.getMarks());		
		
		
		//--------------------Car----------------------------------------------------
		Car c1= new Car("Audi", 999000, "Red", "SUV");
		Car c2= new Car("Merc", 998000, "Black", "Sedan");
		System.out.println("\n*****Car Example****");
		System.out.println(c1.getBrand()+" "+ c1.getPrice()+" "+ c1.getColor()+ " "+ c1.getClassType());
		System.out.println(c2.getBrand()+" "+ c2.getPrice()+" "+ c2.getColor()+ " "+ c2.getClassType());
		c2.setColor("White");//Update
		System.out.println(c2.getBrand()+" "+ c2.getPrice()+" "+ c2.getColor()+ " "+ c2.getClassType());
		
		
		//--------------------Pen----------------------------------------------------
		Pen p1= new Pen("Renolds", 10);
		Pen p2= new Pen("Rotomac", 25);
		System.out.println("\n*****Pen Example****");
		System.out.println(p1.getBrand()+" "+ p1.getPrice());
		System.out.println(p2.getBrand()+" "+ p2.getPrice());
		p2.setPrice(50);//Update
		System.out.println(p2.getBrand()+" "+ p2.getPrice());
		
	}
}
