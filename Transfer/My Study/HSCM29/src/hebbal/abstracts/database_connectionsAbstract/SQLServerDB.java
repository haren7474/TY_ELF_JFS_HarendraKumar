package hebbal.abstracts.database_connectionsAbstract;

public class SQLServerDB extends Database
{
	public void connect()
	{
		System.out.println("\nSqlServer Database>>>> Opened");
	}
	
	public void disconnect()
	{
		System.out.println("\nSqlServer Database>>>> Closed");
	}
}
