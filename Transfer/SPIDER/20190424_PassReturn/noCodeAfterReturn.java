class noCodeAfterReturn
{
public static void main(String[] args)
{
char c = method();
System.out.println(c);
}


public static char method()
{
System.out.println("No Code After Return");
return 'A';
System.out.println("told you, No Code After Return");

}
}