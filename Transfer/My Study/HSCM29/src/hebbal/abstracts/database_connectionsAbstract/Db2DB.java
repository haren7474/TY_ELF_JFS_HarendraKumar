package hebbal.abstracts.database_connectionsAbstract;

public class Db2DB extends Database
{
	public void connect()
	{
		System.out.println("\nDb2 Database>>>> Opened");
	}
	
	public void disconnect()
	{
		System.out.println("\nDb2 Database>>>> Closed");
	}
}
