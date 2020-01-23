package com.tyss.datastructure.sorting;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
	public static void bSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.print("\nYour Sorted Array using Bubble Sort:\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
