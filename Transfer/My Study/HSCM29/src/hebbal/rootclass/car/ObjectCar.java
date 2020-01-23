package hebbal.rootclass.car;

public class ObjectCar 
{
	public static void main(String[] args) 
	{
	Car c1= new Car("BMW", "Black", 1500000.0);
	Car c2= new Car("BW", "Black", 1500000.0);
	
	
	System.out.println(c1);
	System.out.println(c2);
	
	if(c1.equals(c2))
	{
	System.out.println("Cars are same");
	}
	
	else
	{
	System.out.println("Cars are different");
	}
	
	}
}
