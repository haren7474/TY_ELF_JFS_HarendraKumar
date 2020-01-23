package hebbal.abstracts.shapeArtistWithColor;

import java.util.Scanner;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter shape");
		String shape= sc.nextLine();
		
		System.out.println("Please Enter color");
		String color= sc.nextLine();
		
		System.out.println("----Presenting Your Drawing------");
		
		FactoryProducer fp= new FactoryProducer();
		
		fp.getFactory("shape").getShape(shape).draw();
		fp.getFactory("color").getColor(color).fill();
	}
}