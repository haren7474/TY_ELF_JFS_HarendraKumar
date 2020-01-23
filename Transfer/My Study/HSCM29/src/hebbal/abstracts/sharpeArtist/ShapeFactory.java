package hebbal.abstracts.sharpeArtist;

public class ShapeFactory 
{
	public Shape getShape(String shape)
	{
		Shape s= null;
		
		if(shape.equalsIgnoreCase("Circle"))
		{
			s= new Circle();
		}
		
		else if(shape.equalsIgnoreCase("Square"))
		{
			s= new Square();
		}
		
		else
		{
			s= new Ractangle();
		}
		return s;
	}

}
