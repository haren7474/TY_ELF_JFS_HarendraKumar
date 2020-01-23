import java.util.Scanner;

class MainMetodOverloadedInAclass
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
		
		for(int i=0; i<size; i++)
		{
			System.out.println(array[i]);
		}

		String arg = "My Name is Harendra";		
		main(arg);

		System.out.println(main(10,20));
	}

	public static void main(String args)
	{
		System.out.println("This is Main Method with String Input");
		
			System.out.println(args);
	}

	public static int main(int a, int b)
	{
		System.out.println("This is Main Method with Integer input");
		return a+b;
	}

}


