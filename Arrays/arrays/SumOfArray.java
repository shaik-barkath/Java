package com.kn.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		// Take input from user
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the size of the Array");

		// Array Declaration & Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Elements in"+(i+1)+ " Array");
			arr[i] = scan.nextInt();
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(" The sum of Array elements = " + sum);
		// Release the resource
		scan.close();
	}

}
