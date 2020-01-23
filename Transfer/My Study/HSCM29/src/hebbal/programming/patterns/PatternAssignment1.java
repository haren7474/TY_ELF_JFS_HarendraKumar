package hebbal.programming.patterns;

import java.util.Scanner;

public class PatternAssignment1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Pattern 1\n2. Pattern 2\n3. Pattern 3\n"
				+ "4. Pattern 4\n5. Pattern 5\n6. Pattern 6\n7. Pattern 7\n8. Pattern 8\n"
				+ "9. Pattern 9\n10. Pattern 10\n11. Pattern 11\n12. Pattern 12\n13. Pattern 13\n"
				+ "14. Print All\n15. Exit");

		while (true) {
			System.out.println("\nPlease enter your choice\n");
			int choice = sc.nextInt();

			System.out.println("Please enter length for pattern");
			int len = sc.nextInt();

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

			case 7:
				pattern7(len);
				break;

			case 8:
				pattern8(len);
				break;

			case 9:
				pattern9(len);
				break;

			case 10:
				pattern10(len);
				break;

			case 11:
				pattern11(len);
				break;

			case 12:
				pattern12(len);
				break;

			case 13:
				pattern13(len);
				break;

			case 14:
				pattern1(len);
				pattern2(len);
				pattern3(len);
				pattern4(len);
				pattern5(len);
				pattern6(len);
				pattern7(len);
				pattern8(len);
				pattern9(len);
				pattern10(len);
				pattern11(len);
				pattern12(len);
				pattern13(len);
				break;

			case 15:
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	private static void pattern1(int len) {
		System.out.println("----------pattern1---------");
		for (int i = 1; i <= len; i++) {
			int n = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int len) {
		System.out.println("----------pattern2---------");
		for (int i = 1; i <= len; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int len) {
		System.out.println("----------pattern3---------");
		char ch = 'A';
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int len) {
		System.out.println("----------pattern4---------");
		char ch = 'A';
		int n = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print(n++ + " ");
				else
					System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern5(int len) {
		System.out.println("----------pattern5---------");
		char ch = 'A';
		int n = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print(n++ + " ");
				else
					System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern6(int len) {
		System.out.println("----------pattern6---------");
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}

	private static void pattern7(int len) {
		System.out.println("----------pattern7---------");
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}

	private static void pattern8(int len) {
		System.out.println("----------pattern8---------");
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i == len) || (j == 1) || (i == j))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static void pattern9(int len) {
		System.out.println("----------pattern9---------");
		char ch = 'A';
		int n = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if ((j == 1) || (i == j))
					System.out.print(ch++ + " ");
				else
					System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern10(int len) {
		System.out.println("----------pattern10---------");
		char ch = 'A';
		int n = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j == 2) || (i == len && j == 1) || i + j == 2 * len)
					System.out.print("* ");
				else if ((j == 1) || (i == j))
					System.out.print(ch++ + " ");
				else
					System.out.print(n++ + " ");
			}
			System.out.println();
		}
	}

	private static void pattern11(int len) {
		System.out.println("----------pattern11---------");
		char ch = 'A';
		int n = 1;
		int count = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				if (count % 2 == 0) {
					System.out.print(ch++ + " ");
				} else {
					System.out.print(n++ + " ");
				}
			}
			System.out.println();
		}
	}

	private static void pattern12(int len) {
		System.out.println("----------pattern12---------");
		char ch = 'A';
		char ch2 = 'a';
		int count = 1;
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				if (count % 2 == 0) {
					System.out.print(ch++ + " ");
					ch2++;
				} else {
					System.out.print(ch2++ + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}

	private static void pattern13(int len) {
		System.out.println("----------pattern13---------");
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i == len) || (j == 1) || (i == j) || ((i + j) == (len + 1)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
