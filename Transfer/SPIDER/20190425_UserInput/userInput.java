import java.util.Scanner;

class userInput
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Please enter an Integer");
int a = sc.nextInt(); 

System.out.println("Please enter a double value");
double d = sc.nextDouble(); 

System.out.println("Please enter a float value");
float f = sc.nextFloat(); 

System.out.println("Please enter a booleean value");
boolean b = sc.nextBoolean(); 

System.out.println("Please enter a char value");
char c= sc.next().charAt(0); 

System.out.println("Please enter another String");
String s1= sc.nextLine();

System.out.println("Please enter a String");
String s2= sc.next(); 

System.out.println("Entered Integer: "+ a);
System.out.println("Entered Double: "+ d);
System.out.println("Entered Float: "+ f);
System.out.println("Entered Boolean: "+ b);
System.out.println("Entered Char: "+ c);
System.out.println("Entered String1: "+ s1);
System.out.println("Entered String2: "+ s2);
}
}