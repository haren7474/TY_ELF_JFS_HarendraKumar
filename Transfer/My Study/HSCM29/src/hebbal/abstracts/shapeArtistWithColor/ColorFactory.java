package hebbal.abstracts.shapeArtistWithColor;

public class ColorFactory extends AbstractFactory
{
	public Color getColor(String color)
	{
		Color c= null;
		
		if(color.equalsIgnoreCase("Red"))
		{
			c= new Red();
		}
		
		else if(color.equalsIgnoreCase("Green"))
		{
			c= new Green();
		}
		
		else
		{
			c= new Pink();
		}
		
		return c;
	}
	
	public Shape getShape(String shape)
	{
		return null;
	}
}
