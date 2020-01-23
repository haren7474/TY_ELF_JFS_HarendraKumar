class passingValueReturingValue
{
public static void main(String[] args)
{
int a=10;
int b=20;
int sum = method(a,b);
System.out.println(sum);
}


public static int method(int a, int b)
{
System.out.println("passing Value Returing Value");
return (a+b);
}
}