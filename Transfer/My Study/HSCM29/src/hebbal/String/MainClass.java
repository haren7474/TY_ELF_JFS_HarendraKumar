package hebbal.String;

public class MainClass {
	public static void main(String[] args) 
	{
		// Calling my own immutable class (UserDefinedImmutableClass)
		UserDefinedImmutableClass d1 = new UserDefinedImmutableClass(10);
		UserDefinedImmutableClass d2 = d1.modify(100);
		UserDefinedImmutableClass d3 = d1.modify(10);

		System.out.println("result for d1==d2 " + (d1 == d2));
		System.out.println("result for d1==d3 " + (d1 == d3));
	}
	
	public static void check()
	{
		String s1 = "Hello";
		String s2 = "hello";

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.equals(s2));

		System.out.println(s1 == s2);
	}
}
