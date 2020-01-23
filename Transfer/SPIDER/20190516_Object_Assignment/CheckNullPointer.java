class CheckNullPointer 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Without Null****");
		NullPointer np= new NullPointer();
		System.out.println(np.x);
		np.nullPointer();

		System.out.println("*****With Null****");
		//Below with give Run time Null Pointer Exception.
		NullPointer np1 = null;
		System.out.println(np1.x);
		np1.nullPointer();
	}
}


class NullPointer
{
	int x=10;	
	 void nullPointer()
		{	
			System.out.println("To check null pointer");
		}
}

