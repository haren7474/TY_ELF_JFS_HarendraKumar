package hebbal.programming.arrays.missingNumbers;

public class FindMissingNumber 
{
	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 9, 4, 5, 6, 7, 8 };

		int n = a.length + 1;
		int sum = n * (n + 1) / 2;

		int arraySum = 0;
		for (int i = 0; i < a.length; i++) {
			arraySum = a[i] + arraySum;
		}

		System.out.println(sum - arraySum);

		for (int i = 0; i < a.length - 1; i++) 
		{
			if (a[i + 1] - a[i] == 1)
				continue;
			else
			{
				System.out.println("Missing Number " + a[i] + 1);
				System.out.println("Odd man out " + a[i]);
			}
		}
		
		System.out.println('H'-'h');
	}
}
