class noMultipleReturns
{
public static void main(String[] args)
{
char c = method();
System.out.println(c);
}


public static char method()
{
System.out.println("No Multiple Return");
return 'A';
return 'B';
System.out.println("told you, No Multiple Return");

}
}