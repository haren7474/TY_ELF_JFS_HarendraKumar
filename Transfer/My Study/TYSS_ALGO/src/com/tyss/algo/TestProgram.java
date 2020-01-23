package com.tyss.algo;

public class TestProgram {

	public static void main(String[] args) {
		RandomNumber rn= new RandomNumber();
		
		//Getting array with random numbers
		int[] myRandomArray = rn.RandomArray();

		for (int i = 0; i < myRandomArray.length; i++) {
			System.out.print(myRandomArray[i] + " ");
		}
		
		// Printing sum
		int sum= rn.sumOfThreeDigitNumbers(myRandomArray);
		System.out.println("\nSum of 3 digits numbers is: "+ sum);
		
		// Printing average
		int average= rn.averageOfTheeDigit(myRandomArray);
		System.out.println("\nAverage of 3 digits numbers is: "+ average);
		
		// Printing average
		int divFiveSix= rn.divisibleByFiveSix(myRandomArray);
		System.out.println("\ndivisible By Five and Six count is: "+ divFiveSix);
		
		
		JaggedArray ja= new JaggedArray();
		
		ja.jaggedArray();

	}

}
