package hebbal.abstracts.Uber;

public class UberFactory 
{
	public Uber getCarDetails(String cardetail)
	{
		Uber u= null;
		
		if(cardetail.equalsIgnoreCase("ubergo"))
		{
			u= new UberGo();
		}
		
		else if(cardetail.equalsIgnoreCase("uberxl"))
		{
			u= new UberXL();
		}
		
		else
		{
			u= new UberPrime();
		}
		return u;
	}

}
