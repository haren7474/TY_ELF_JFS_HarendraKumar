class middlePatternDecreasing
{
public static void main(String[] args)
{

for(int i=0; i<10; i++)
{

for( int j=0; j<=20; j++)
{

if(i + j >  18)
{
System.out.print(" ");
}

else if(j<i)
{
System.out.print(" ");
}
else
{
System.out.print("*");
}

}
System.out.println();
}
}
}