package hebbal.abstracts.defence;

public class IndianArmy implements Defence
{

	@Override
	public String getBackup() 
	{
		return "BSF arrives";		
	}

	@Override
	public int soldierCount() 
	{		
		return 1500;
	}
	
}
