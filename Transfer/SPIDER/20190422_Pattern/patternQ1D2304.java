class patternQ1D2304
{
public static void main(String[] args)
{

int n =1;

for(int i=0; i<5; i++)
{

for( int j=0; j<=i; j++)
{

if(i==j)
{
System.out.print("*");
}
else
{
System.out.print(n++);
}
}
System.out.println();
}
}
}