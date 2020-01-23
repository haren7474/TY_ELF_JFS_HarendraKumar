import java.util.Scanner;
class greatestInArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter size of the array");
		int size=sc.nextInt();

		int[] arr= new int[size];
		System.out.println("Please Enter elements of array");
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("This is your array");
		for(int i=0; i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}

		
		System.out.println("Largest in your array is:");
		int max=arr[0];
			for(int j=0;j<size;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];	
				}
			}
			
		
		System.out.print(max+" ");



		System.out.println("Second Largest in your array is:");
			int max1, max2, j;
			max2=arr[0];
			max1=max2;

			for(j=0;j<size;j++)
			{
				if(arr[j]>max1)
				{
					max2=max1;
					max1=arr[j];
				}
				else if(arr[j]>max2)
				{
					max2=arr[j];
				}
			}
			
		
		System.out.print("Largest is: "+max1+" and 2nd largest is "+max2);

	}
}
