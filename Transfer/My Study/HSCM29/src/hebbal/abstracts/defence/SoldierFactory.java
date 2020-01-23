package hebbal.abstracts.defence;

public class SoldierFactory 
{
	public Defence getSoldierDetails(String required)
	{
	Defence def=null;
	if(required.equalsIgnoreCase("Land"))
	{
		def= new IndianArmy();
	}
	else if(required.equalsIgnoreCase("Water"))
	{
		def= new IndianNavy();
	}
	
	else
	{
		def= new IndianAirfoce();
	}
	
	return def;
	}
}
