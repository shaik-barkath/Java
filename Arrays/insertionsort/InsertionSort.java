package com.kn.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 29, 84, 132, 9, 16, 11, 64, 2 };
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
