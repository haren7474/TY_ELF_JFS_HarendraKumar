package hebbal.abstracts.defence;

public class IndianAirfoce implements Defence
{

	@Override
	public String getBackup() 
	{
		return "Airfoce arrives";		
	}

	@Override
	public int soldierCount() 
	{		
		return 230;
	}
	
}

