class patternQ2D2204
{
public static void main(String[] args)
{
int n =1;
char ch= 'A';
for(int i=0; i<5; i++)
{
for( int j=0; j<=i; j++)
{

if(i%2==0)
{
System.out.print(n++);
}
else
{
System.out.print(ch++);
}
}
System.out.println();
}
}
}