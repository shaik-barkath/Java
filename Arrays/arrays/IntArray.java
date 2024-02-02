package com.kn.arrays;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Elements =");

		int[] arr = new int[(scan.nextInt())];

		System.out.println("Enter data for Array Elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Data within Array = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Squaring of array elements = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]*2);
		}

		scan.close();
	}

}
