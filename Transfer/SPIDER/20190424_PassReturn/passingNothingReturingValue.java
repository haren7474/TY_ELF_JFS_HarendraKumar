class passingNothingReturingValue
{
public static void main(String[] args)
{

char c = method();
System.out.println(c);
}


public static char method()
{
System.out.println("passing nothing Returing Value");
return 'A';
}
}