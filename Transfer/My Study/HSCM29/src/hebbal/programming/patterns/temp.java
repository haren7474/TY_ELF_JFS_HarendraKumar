package hebbal.programming.patterns;

public class temp 
{
	public static void pattern12() 
	{
		int i = 0, num = 0, ch1 = 0, ch2 = 0, st = 0, val = 0;
		for (int j = 1; j <= st; j++) 
		{
			if (i <= num / 2 + 1) 
			{
				if (val++ % 2 == 0) 
				{
					System.out.print(ch2++);
					ch1++;
				} else 
				{
					System.out.print(ch1++);
					ch2++;
				}
			} 
			else 
			{
				if (val++ % 2 == 0) 
				{
					System.out.print(ch1++);
					ch2++;
				} 
				else {
					System.out.print(ch2++);
					ch1++;
				}
			}
		}
	}

	/*
	public static void pattern13() 
	{
		for(int i=1;i<=num; i++)
		{
			for(int j=1;j<=sp;j++)
			System.out.println(" ");
		
			for(int j=1; j<=st; j++)
			{
				if(i==1 || (i<=num/2+1) && (j==1) || (i==num))
					System.out.println("*");
				else
				{
					if(i<=num/2+1)
					{
						if(j==1)
						{
							System.out.println(ch2++);
							ch1++;
						}
						else if(j==st)
						{
							System.out.println(ch1++);
							ch2++;
						}
						else
						{
							System.out.println(" ");
						}
					}
					else
					{
						if(j==1)
						{
							System.out.println(ch1++);
							ch2++;
						}
						else if(j==st)
						{
							System.out.println(ch2++);
							ch1++;
						}
						else
						{
							System.out.println(" ");
						}
					}
				}
			}
		}
	}
*/
}
