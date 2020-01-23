
public class StringTest {

	public static void main(String[] args) 
	{
		String s1="hello" + "world";
		String s2="helloworld";	
		String s3="hello";
		String s4="world";
		String s5=s3+s4;
		
		System.out.println("s1 Address: "+ s1.hashCode());
		System.out.println("s2 Address: "+ s2.hashCode());
		System.out.println("s3 Address: "+ s3.hashCode());		
		System.out.println("s4 Address: "+ s4.hashCode());		
		System.out.println("s5 Address: "+ s5.hashCode());
		
		System.out.println("---------------------------------");
		System.out.println("s1 Identity Address: "+ System.identityHashCode(s1));
		System.out.println("s2 Identity Address: "+ System.identityHashCode(s2));
		System.out.println("s3 Identity Address: "+ System.identityHashCode(s3));		
		System.out.println("s4 Identity Address: "+ System.identityHashCode(s4));		
		System.out.println("s5 Identity Address: "+ System.identityHashCode(s5));
		
		System.out.print("\nChecking if s5==s2: ");
		System.out.println(s5==s2);

		//Hash code converted to Hex Address
		System.out.println("\n-----Hashcode converted to Hex Address---------");
		System.out.println("s1 Hex Address: "+ Integer.toHexString(s1.hashCode()));
		System.out.println("s2 Hex Address: "+  Integer.toHexString(s2.hashCode()));
		System.out.println("s3 Hex Address: "+ Integer.toHexString(s3.hashCode()));		
		System.out.println("s4 Hex Address: "+ Integer.toHexString(s4.hashCode()));		
		System.out.println("s5 Hex Address: "+ Integer.toHexString(s5.hashCode()));
		
		//Identity Codes converted to Hex Address
		System.out.println("\n---Identity Codes converted to Hex Address-----");
		System.out.println("s1 Identity Hex Address: "+ Integer.toHexString(System.identityHashCode(s1)));
		System.out.println("s2 Identity Hex Address: "+  Integer.toHexString(System.identityHashCode(s2)));
		System.out.println("s3 Identity Hex Address: "+ Integer.toHexString(System.identityHashCode(s3)));		
		System.out.println("s4 Identity Hex Address: "+ Integer.toHexString(System.identityHashCode(s4)));		
		System.out.println("s5 Identity Hex Address: "+ Integer.toHexString(System.identityHashCode(s5)));
		
	}

}
