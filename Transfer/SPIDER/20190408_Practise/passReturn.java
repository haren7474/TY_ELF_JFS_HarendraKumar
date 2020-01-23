class passReturn
{
public static void main(String[] args)
{

int a=100;
int b=51;

String res = checkEven(a,b);
System.out.println(res);

}
public static String checkEven (int a, int b)
{
if(a%2==0 && b%2==0)
return "both even";

else if(a%2==1 && b%2==1)
return "both odd";

else if(a%2==1 && b%2==0)
return "only A odd";

else
return "only B Odd";

}
}