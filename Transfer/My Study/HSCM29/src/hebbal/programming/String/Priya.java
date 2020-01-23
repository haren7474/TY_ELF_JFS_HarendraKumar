package hebbal.programming.String;

public class Priya {

	public static void main(String[] args) 
	{
		char[] array = { 'a', 'b', 'c', 'd' };

		int i = 0, j = array.length - 1;

		//Reverse Logic
		for (i = 0; i < array.length / 2; i++, j--) 
		{
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

		//Printing Reversed Array
		for (i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}
