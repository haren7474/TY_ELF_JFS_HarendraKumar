package com.tyss.looseCoupleCrush;

public class Crush 
{
	Nokia n= new Nokia();
	Vivo v= new Vivo();
	OnePlus o= new OnePlus();
	Iphone i= new Iphone();
	
	void recieve(Phone p)
	{
		if(p instanceof Nokia)
		{
			n.reply();
		}
		else if (p instanceof Vivo)
		{
			v.reply();
		}
		else if (p instanceof OnePlus)
		{
			o.reply();
		}
		else if (p instanceof Iphone)
		{
			i.reply();
		}
		else
		{
			System.out.println("I thought we were friends!!!!");
		}
	}
}
