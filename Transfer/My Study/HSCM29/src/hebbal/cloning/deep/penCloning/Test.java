package hebbal.cloning.deep.penCloning;

public class Test 
{
	public static void main(String[] args) throws CloneNotSupportedException  
	{

		Refil r = new Refil("Reynolds", 5);
		
		Pen p1= new Pen("Cello", "Bright", "Ball", 10, r);
		Pen p2=(Pen) p1.clone();
		
		System.out.println("Before change");
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		
		p1.refil.price=8;	

		System.out.println("After change");
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		
		
		System.out.println(p1==p2);
		System.out.println(p1.refil==p2.refil);
	}
}
