package gmail.login;

public class Demo 
{
	Test t = new Test();
	
	public void print()
	{
	System.out.println("----Inside Package----");
	System.out.println("Default def= "+t.def);
	System.out.println("Public pub= "+t.pub);
	System.out.println("Protected pro= "+t.pro);
	System.out.println("Private pri= "+t.getPri(400));
	t.sum();
	}
}
