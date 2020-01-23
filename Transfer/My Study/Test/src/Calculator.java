import java.io.IOException;
import java.util.Scanner;

public class Calculator {

	int add(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}

	int minus(int number1, int number2) {
		int diff = number1 - number2;
		return diff;
	}

	int multi(int number1, int number2) {
		int prod = number1 * number2;
		return prod;
	}

	int div(int number1, int number2) {
		int divi = number1 / number2;
		return divi;

	}

	public static void Alphabets() {
		char c = 'A';

		do {
			System.out.println(c);
			c++;
		} while (c <= 'Z');
	}

	public static void Calc() {
		Calculator obj = new Calculator();

		Scanner reader = new Scanner(System.in);

		System.out.println("Please Enter Number 1");
		int n1 = reader.nextInt();
		System.out.println("Please Enter Number 2");
		int n2 = reader.nextInt();

		int a = obj.add(n1, n2);
		int min = obj.minus(n1, n2);
		int mul = obj.multi(n1, n2);
		int d = obj.div(n1, n2);
		System.out.println(
				"Please Select Your choice:\n\nAddition--->1;\nSubtraction-->2; \nMultiplication-->3; \nDivision -->4;\n");
		int Choice = reader.nextInt();
		if (Choice == 1) {
			System.out.println("\nSum: " + a);
		}
		if (Choice == 2) {
			System.out.println("\nSubtraction: " + min);
		}
		if (Choice == 3) {
			System.out.println("\nMultiplication: " + mul);
		}
		if (Choice == 4) {
			System.out.println("\nDivision: " + d);
		} else if (Choice > 4 || Choice < 1) {
			System.out.println("Try again.");
			Choice = -1;
			Calc();
			reader.close();

		}
	}

	public static void main(String[] args) throws IOException {

		System.out.print("Math or English?\n");
		Scanner reader1 = new Scanner(System.in);
		int Op = reader1.nextInt();
		if (Op == 1) {
			Calc();
		}
		if (Op == 2) {
			Alphabets();
		}
		reader1.close();
	}

}