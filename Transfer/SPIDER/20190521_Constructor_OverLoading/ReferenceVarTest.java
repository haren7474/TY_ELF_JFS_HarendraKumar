class ReferenceVar 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		RefVar rf1,rf2,rf3;

		rf1	= new RefVar();
		rf1.Return();

		System.out.println();
		rf2	= new RefVar();
		rf2.Return();

		System.out.println();
		rf3	= new RefVar();
		rf3.Return();

		System.out.println("\nAccessing without Ref variable");
		new RefVar().Return();
	}
	
}

class RefVar
{
	public void Return() 
	{
		System.out.println("Null Pointer Exception Handled");
	}

}
