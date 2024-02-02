package com.kn.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
