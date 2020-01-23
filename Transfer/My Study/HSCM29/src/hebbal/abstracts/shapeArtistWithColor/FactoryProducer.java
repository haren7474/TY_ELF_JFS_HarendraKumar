package hebbal.abstracts.shapeArtistWithColor;

public class FactoryProducer 
{
	public AbstractFactory getFactory(String type)
	{
		if(type.equalsIgnoreCase("Shape"))
		{
			return new ShapeFactory();
		}
		else
			return new ColorFactory();
	}
}
