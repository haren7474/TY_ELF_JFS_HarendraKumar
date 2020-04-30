class WithOnlyObject 
{
	public static void main(String[] args) 
	{
		System.out.println("*******Using Reference Variable*****");
		OnlyObject oo= new OnlyObject();
		System.out.println(oo.x);
		System.out.println(oo.y);
		oo.m1();
		oo.m2();		
		
		System.out.println("******Using only Object*********");
		System.out.println(new OnlyObject().x);
		System.out.println(new OnlyObject().y);
		new OnlyObject().m1();
		new OnlyObject().m2();	

	}
}


class OnlyObject
{	
	int x=10;
	double y=20.11;

	 void m1()
		{		
			System.out.println("This is method m1");
		}

		void m2()
		{		
			System.out.println("This is method m2");
		}
}
