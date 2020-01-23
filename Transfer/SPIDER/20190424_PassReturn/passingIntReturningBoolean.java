class passingIntReturningBoolean
{
public static void main(String[] args)
{
int a=10;
int b=20;
boolean bool = check(a,b);
System.out.println(bool);
}


public static boolean check(int a, int b)
{
if(a>b)
{
return true;
}
else
{
return false;
}

}


}