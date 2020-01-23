//Example where we can wee 3 reference variables pns1, pns2, pns3 and referring to 3 objects of new PrintNonStatic(). All pns have their own object, so here if we change the value from one reference varriable, it will be reflected only for that variable.

class ProgramObjectExample1
{
	public static void main(String[] args) 
	{
		
		System.out.println("Main Method Begins");

		//Creating 3 Object of class PrintNonStatic which are referred by pns1, pns2, pns3
		PrintNonStatic pns1= new PrintNonStatic();
		PrintNonStatic pns2= new PrintNonStatic();
		PrintNonStatic pns3= new PrintNonStatic();	
		
		//Accessing Data Members: Non Static
		System.out.println("\n***Originol Values:***");
		System.out.println("pns1.x " + pns1.x);
		System.out.println("pns2.x " + pns2.x);
		System.out.println("pns3.x " + pns3.x);

		//Accessing Non Static Methods
		pns1.printNonStatic();
		pns2.printNonStatic();
		pns3.printNonStatic();

		//Reassignment
		pns1.x=100;
		pns2.x=1000;

		//Accessing Data Members: Non Static
		System.out.println("\n***Re-assigned Values:***");
		System.out.println("pns1.x " + pns1.x);
		System.out.println("pns2.x " + pns2.x);
		System.out.println("pns3.x " + pns3.x);

	}
}


class PrintNonStatic
{
	//Non Static Data Member
	public int x=10;


	//Non Static Method
	public void printNonStatic()
	{
		System.out.println("Returning Print Method Static");
	}
}


class PrintStatic
{
	//Non Static Data Member
	public static int y=10;


	//Non Static Method
	public void printStatic()
	{
		System.out.println("Returning Print Method Non Static");
	}
}
