import java.util.Scanner;

class diamond 
{

  public static void main(String[] args)
	  
	  
{
   int i,j,r;
   System.out.print("Input number of rows (half of the diamond) : ");
   Scanner in = new Scanner(System.in);
		    r = in.nextInt();
   for(i=0;i<=r;i++)
   {
     for(j=1;j<=r-i;j++)
     System.out.print("H");
     
   }
 
}
}
