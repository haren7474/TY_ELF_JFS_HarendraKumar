package hebbal.programming.String;

public class StringDemo {
	public static void main(String[] args) {
		String s = "sauravkumar";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int j = 0; j < s.length(); j++) 
			{

				if (s.charAt(i) == s.charAt(j) && i != j)
				{
					count++;
				}
			}

			if (count == 0) {
				System.out.println(s.charAt(i));
				break;
			}
		}

		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				System.out.print(s.charAt(i) + " ");
			}

		}
	}
}
