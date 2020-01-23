class atmCheck
{
public static void main(String[] args)
{
int dbpin = 1234;
int dbamt = 20000;
int pin = 1235;
int amt = 21000;


if(dbpin == pin)
{

if( amt <= dbamt)
{
System.out.println("Please collect cash");
}
else
{
System.out.println("Insufficient Balance");
}


}


else
{
System.out.println("Incorrect Pin");
}
}
}