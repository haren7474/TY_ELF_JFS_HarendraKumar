import java.util.Scanner;

class AddInteger
{
	public static void main(String[] args)
	{
		System.out.println("AddInteger class main");
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			sum= sum+ Integer.parseInt(args[i]);
		}
		System.out.println("Integer Sum :" + sum);
	}
}


class AddDouble
{
	public static void main(String[] args)
	{
		System.out.println("AddDouble class main");
		double sum=0;
		for(int i=0; i<args.length; i++)
		{
			sum= sum+ Double.parseDouble(args[i]);
		}
		System.out.println("Double Sum :" + sum);
	}
}

class Program
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size= sc.nextInt();


		String [] array= new String[size];
		for(int i=0; i<size; i++)
		{
			array[i]= sc.next();
		}
		
		AddInteger.main(array);
	}
}


