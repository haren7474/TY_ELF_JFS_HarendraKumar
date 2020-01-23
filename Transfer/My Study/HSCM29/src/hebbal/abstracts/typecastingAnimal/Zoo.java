package hebbal.abstracts.typecastingAnimal;

public class Zoo 
{
	public void animalFood(Animal a)
	{
		a.print();
		
		if(a instanceof Dog)
		{
			Dog d= (Dog) a;
			d.eat();
		}
		
		else if(a instanceof Cat)
		{
			Cat c= (Cat) a;
			c.eat();
		}
		
		if(a instanceof Lion)
		{
			Lion l= (Lion) a;
			l.eat();
		}
	}

}
