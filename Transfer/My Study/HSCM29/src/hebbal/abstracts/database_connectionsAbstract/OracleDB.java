package hebbal.abstracts.database_connectionsAbstract;

public class OracleDB extends Database
{
	public void connect()
	{
		System.out.println("\nOracle Database>>>> Opened");
	}
	
	public void disconnect()
	{
		System.out.println("\nOracle Database>>>> Closed");
	}	
}
