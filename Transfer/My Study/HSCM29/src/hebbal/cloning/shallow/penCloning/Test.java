package hebbal.cloning.shallow.penCloning;

public class Test 
{
	public static void main(String[] args) throws CloneNotSupportedException  
	{
		Pen p1= new Pen("Cello", "Bright", "Ball", 10);
		Pen p2=p1;
		
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		
		System.out.println( p1==p2);
		
		Pen p3= (Pen) p1.clone();
		System.out.println("p3 "+ p3);
		System.out.println( p1==p3);		
		
	}
}
