package hebbal.abstracts.database_connectionsAbstract;

abstract public class Database 
{
	abstract public void connect();
	abstract public void disconnect();
	
	public String checkStatus(String setStatus)
	{
		if(setStatus=="open")
		{
			return "connected";
		}
		
		else if(setStatus=="close")
		{
			return "disconnected";
		}
		
		else
		{
			return "Not started";
		}
		
	}
}
