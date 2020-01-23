package hebbal.abstracts.database_connectionsAbstract;

import java.util.Scanner;

public class DatabaseApp 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n----Main Menu---");
			System.out.print("-----------------\n|1. OracleDB    |\n|2. SqlServer DB|\n");
			System.out.println("|3. Db2 DB      |\n|4. Exit        |\n ----------------");

			System.out.println("Please enter your choice");
			int ch = sc.nextInt();

			// To track and update the current value of Connection Status for all the Databases (open/ close)
			String setStatus = null;

			// To create Object of Concrete Method checkStatus present in Abstract Class which returns connection status for all Databases.
			OracleDB objStatus = new OracleDB();

		switch (ch) 
		{
		case 1:
				while (true) 
				{
					System.out.println("\n---Inside Oracle DB---\n1. Connect\n2. Disconnect\n3. Check Status\n4. Return to Main Menu");

					System.out.println("Please enter your choice");
					int chOracle = sc.nextInt(); // User Choice

					// To get the Status from check status method (Connected/ Disconnected/ Not Started Yet)
					String status = objStatus.checkStatus(setStatus);

					switch (chOracle) 
					{
					case 1:
						if (status == "connected") {
							System.out.println("\n***Connection is already Open***");
						} else {
							setStatus = "open";
							new OracleDB().connect();
						}

						break;

					case 2:
						if (status == "connected") {
							setStatus = "close";
							new OracleDB().disconnect();

						} else if (status == "disconnected") {
							System.out.println("\n***Connection is already Closed***");
						}

						else if (status == "Not started") {
							System.out.println("\n***Connection is not open yet***");
						}

						break;

					case 3:
						status = objStatus.checkStatus(setStatus);
						System.out.println("\n***Connection Status: " + status + "***");
						break;

					case 4:
						System.out.println("\n***Returning to Main Menu***");
						main(args);
						break;

					default:
						System.out.println("Invalid Choice");
						break;

					}
				}

			case 2:
				while (true) {
					System.out.println(
							"\n---Inside SQLServer---\n1. Connect\n2. Disconnect\n3. Check Status\n4. Return to Main Menu");

					System.out.println("Please enter your choice");
					int chSQL = sc.nextInt(); // User Choice

					// To get the Status from check status method (Connected/ Disconnected/ Not Started Yet)
					String status = objStatus.checkStatus(setStatus);

					switch (chSQL) {
					case 1:
						if (status == "connected") {
							System.out.println("\n***Connection is already Open***");
						} else {
							setStatus = "open";
							new SQLServerDB().connect();
						}

						break;

					case 2:
						if (status == "connected") {
							setStatus = "close";
							new SQLServerDB().disconnect();

						} else if (status == "disconnected") {
							System.out.println("\n***Connection is already Closed***");
						}

						else if (status == "Not started") {
							System.out.println("\n***Connection is not open yet***");
						}

						break;

					case 3:
						status = objStatus.checkStatus(setStatus);
						System.out.println("\n***Connection Status: " + status + "***");
						break;

					case 4:
						System.out.println("\n***Returning to Main Menu***");
						main(args);
						break;

					default:
						System.out.println("Invalid Choice");
						break;

					}
				}

			case 3:
				while (true) {
					System.out.println(
							"\n---Inside Db2 DB---\n1. Connect\n2. Disconnect\n3. Check Status\n4. Return to Main Menu");

					System.out.println("Please enter your choice");
					int chDb2 = sc.nextInt(); // User Choice

					// To get the Status from check status method (Connected/ Disconnected/ Not Started Yet)
					String status = objStatus.checkStatus(setStatus);

					switch (chDb2) {
					case 1:
						if (status == "connected") {
							System.out.println("\n***Connection is already Open***");
						} else {
							setStatus = "open";
							new Db2DB().connect();
						}

						break;

					case 2:
						if (status == "connected") {
							setStatus = "close";
							new Db2DB().disconnect();

						} else if (status == "disconnected") {
							System.out.println("\n***Connection is already Closed***");
						}

						else if (status == "Not started") {
							System.out.println("\n***Connection is not open yet***");
						}

						break;

					case 3:
						status = objStatus.checkStatus(setStatus);
						System.out.println("\n***Connection Status: " + status + "***");
						break;

					case 4:
						System.out.println("\n***Returning to Main Menu***");
						main(args);
						break;

					default:
						System.out.println("Invalid Choice");
						break;

					}
				}

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice");
				break;

			}

		}
	}

}
