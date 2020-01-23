package hebbal.abstracts.sharpeArtist;

import java.util.Scanner;

public class Artist 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);

		while(true)
		{
		System.out.println("\n1. Circle\n2. Square\n3. Ractangle\n4. Exit");		
		System.out.println("Please enter your choice");		
		int ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: new ShapeFactory().getShape("Circle").draw();
				break;
				
		case 2: new ShapeFactory().getShape("Square").draw();
		break;
		
		case 3: new ShapeFactory().getShape("Ractangle").draw();
				break;
		
		case 4: System.exit(0);
			
		default: System.out.println("invalid choice");
		}
		
		}
	}
}
