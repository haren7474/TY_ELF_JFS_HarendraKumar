package hebbal.programming.recursion;

public class Recursion 
{
	static int ch1=1, length;
	static char ch2='A', ch3='a';
	
	public static void main(String[] args) 
	{
		length=16;
		printSeq(1);
		
	}

	private static void printSeq(int i) 
	{
		if(i<=length)
		{
			if(i%4==0)
			{
				System.out.println(ch3++);
				ch2++;
			}
			else if(i%2==0)
			{
				System.out.println(ch2++);
				ch3++;
			}
			else
			{
				System.out.println(ch1++);
			}
			printSeq(i+1);
		}
	}

}
