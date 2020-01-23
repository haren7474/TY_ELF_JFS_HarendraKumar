class CountDigit 
{
	public static void main(String[] args) 
	{
		checkArmstrong(371);
	
	}

	public static void checkArmstrong(int n)
     {
	int num=n;
	int sum=0;
	while( num != 0)
	{
	   num= num/10;
	   sum++;
	}
	  System.out.println(sum);
	 
     }
}
