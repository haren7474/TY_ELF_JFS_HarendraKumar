package hebbal.abstracts.shapeArtistWithColor;

public class ShapeFactory extends AbstractFactory
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

	public Color getColor(String color)
	{	
		return null;
	}
}
