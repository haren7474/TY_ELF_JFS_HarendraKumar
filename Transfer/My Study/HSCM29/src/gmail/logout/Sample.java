package gmail.logout;

import gmail.login.Test;

public class Sample extends Test
{
	public void disp()
	{		
		System.out.println("\n\n-----Outside Package---");
		
		//Inherited Directly from extends Test
		System.out.println("Public pub= "+pub);
		System.out.println("Protected pro= "+pro);

		
		
		//Need to access though Getters
		Test t = new Test();
		System.out.println("Default def= "+ t.getDef(500));
		System.out.println("Private pri= "+t.getPri(5000));
	}
}
