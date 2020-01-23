package hebbal.programming.recursion;

public class Recursion2 
{
	static int ch1=1, length;
	static char ch2='A', ch3='a';
	
	public static void main(String[] args) 
	{
		length=5;
		printSeq(1);
		
	}
	
	private static void printSeq(int i) 
	{
		if(i<length)
		{
			System.out.println(i);
			printSeq(++i);
		}
		System.out.println(i);
	}

}
