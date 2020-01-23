class greaterOf3
{
public static void main(String[] args)
{
int a=10;
int b  = 20;
int c = 30;


if(a> b && a > c)
{
System.out.println(a + " is the greater than " + b + " and " + c);
}
if(b> a && b > c)
{
System.out.println(b + " is the greater than " + a + " and " + c);
}

if(c> a && c > b)
{
System.out.println(c + " is the greater than " + b + " and " + a);
}

else
{
System.out.println("all are equal");
}
}
}