package hebbal.String;

public class String_Mutable_Immutable_Ex 
{
	public static void main(String[] args) 
	{
		String s= "Hello";
		StringBuffer sb= new StringBuffer("Hello");
		String s1= s.concat(" World");
		sb.append(" World");
		
		System.out.println("String Originol: "+s);
		System.out.println("String: "+s1);
		System.out.println("String Buffer: "+ sb);
	}
		
}
