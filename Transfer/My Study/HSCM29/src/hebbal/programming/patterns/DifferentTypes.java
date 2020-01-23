package hebbal.programming.patterns;

import java.util.Scanner;

public class DifferentTypes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your choice\n1. Pattern 1\n2. Pattern 2\n3. Pattern 3\n"
				+ "4. Pattern 4\n5. Pattern 5\n6. Pattern 6\n7. Print All\n8. Exit\n");
		int choice = sc.nextInt();

		System.out.println("Please enter length for pattern");
		int len = sc.nextInt();
		sc.close();

		switch (choice) {
		case 1:
			pattern1(len);
			break;

		case 2:
			pattern2(len);
			break;

		case 3:
			pattern3(len);
			break;

		case 4:
			pattern4(len);
			break;

		case 5:
			pattern5(len);
			break;

		case 6:
			pattern6(len);
			break;

		case 9:
			decreasingTriangle(len);
			break;

		case 7:
			pattern1(len);
			pattern2(len);
			pattern3(len);
			pattern4(len);
			pattern5(len);
			pattern6(len);
			decreasingTriangle(len);
			pattern3Extend(len);
			break;
			
		case 10: 
			patternRactangle(len);

		case 8:
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
			break;

		}
	}

	private static void pattern1(int len) {
		System.out.println("\n---------Pattern 1-------------");
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int len) {
		System.out.println("\n---------Pattern 2-------------");
		int space = len - 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}

	public static void pattern3(int len) {
		System.out.println("\n---------Pattern 3-------------");
		int stars = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= stars; j++) {
				System.out.print(" *");
			}
			if (i <= len / 2) {
				stars++;
			} else {
				stars--;
			}
			System.out.println();
		}
	}

	public static void pattern4(int len) {
		System.out.println("\n---------Pattern 4-------------");
		int stars = 1;
		int sp = len / 2;

		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();

			if (i <= len / 2) {
				stars++;
				sp--;
			} else {
				sp++;
				stars--;
			}
		}
	}

	public static void pattern5(int len) {
		System.out.println("\n---------Pattern 5-------------");
		int stars = 1;
		int sp = len / 2;

		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();

			if (i <= len / 2) {
				stars = stars + 2;
				sp--;
			} else {
				stars = stars - 2;
				sp++;

			}
		}
	}

	public static void pattern6(int len) {
		System.out.println("\n---------Pattern 6-------------");
		int stars = 1;
		int sp = len - 1;

		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}

			System.out.println();
			sp--;
			stars = stars + 2;

		}
	}

	public static void decreasingTriangle(int len) {
		System.out.println("\n-------Desc tri-------------");
		for (int i = len; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3Extend(int len) {
		System.out.println("\n---------Pattern 3 extended-------------");
		int stars = 1;
		int num = 0;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= stars; j++) {
				if (i <= len / 2 + 1)
					System.out.print(++num + " ");
				else
					System.out.print(--num + " ");
			}
			if (i <= len / 2) {
				stars++;
			} else {

				stars--;
			}
			System.out.println();
		}
	}
	
	public static void patternRactangle(int len) 
	{
		System.out.println("\n---------Pattern 3 extended-------------");
	
		int n3=2;
		for (int i = 1; i <= len; i++) 
		{
			for (int j = 1; j <= len; j++) 
			{
				if(i%2==0 && j==1 || i%2==1 && j==len)
				{
					System.out.print(n3++);
				}
				else
				{
					System.out.print(i);
				}
			
			}
			System.out.println();
	}
	}
}


