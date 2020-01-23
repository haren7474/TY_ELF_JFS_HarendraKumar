import java.util.Scanner;
class gradingSystem
{
public static void main(String[] args)
{
Scanner reader = new Scanner(System.in);

System.out.println("Please Enter Number Grade");
char a = reader.next().charAt(0);

switch(a)
{
case 'A': System.out.println("You have passes with FCD");
	break;

case 'B': System.out.println("You have passes with FC");
	break;

case 'C': System.out.println("You have passes with SC");
	break;

case 'D': System.out.println("You have failed, go and die");
	break;
default:System.out.println(" Invalid Grade");
	break;

}
}
}