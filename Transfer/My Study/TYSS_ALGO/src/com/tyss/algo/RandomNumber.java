package com.tyss.algo;

public class RandomNumber {

	public static int RandomNumber() {
		int randomNumber = (int) (Math.random() * 1000);
		return randomNumber;
	}

	public static int[] RandomArray() {
		int[] myRandomArray = new int[100];

		for (int i = 0; i < myRandomArray.length; i++) {
			myRandomArray[i] = RandomNumber();
		}
		return myRandomArray;
	}

	public static int sumOfThreeDigitNumbers(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 99 && array[i] < 1000) {
				sum = sum + array[i];
			}
		}
		return sum;
	}

	public static int averageOfTheeDigit(int[] array) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 99 && array[i] < 1000) {
				sum = sum + array[i];
				count++;
			}
		}
		return sum / count;
	}

	public static int divisibleByFiveSix(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] % 6 == 0) {
				count++;
			}
		}

		return count;
	}

}
