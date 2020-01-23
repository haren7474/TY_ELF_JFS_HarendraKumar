class methodInsideMethod
{
public static void main(String[] args)
{
System.out.println("Main Starts");
//Calling Methods
M1();

System.out.println("Main Ends");
}

public static void M1()
{
System.out.println("M1 Starts");
M2();
System.out.println("M1 Ends");
}

public static void M2()
{
System.out.println("M2 Starts");
M3();
System.out.println("M2 Ends");
}

public static void M3()
{
System.out.println("M3 Starts");
System.out.println("M3 Ends");
}


}