package hebbal.abstracts.defence;

public class IndianNavy implements Defence
{

	@Override
	public String getBackup() 
	{
		return "Navy arrives";		
	}

	@Override
	public int soldierCount() 
	{		
		return 850;
	}
	
}

