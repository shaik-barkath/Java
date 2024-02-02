package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		// Taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base size of the Array");

		// Array Declaration & Creation
		int[][] arr = new int[scan.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of " + (i + 1) + " array =");
			arr[i] = new int[scan.nextInt()];
		}

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data in Array " + (i + 1) + "=");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("----> Elements " + (j + 1) + " = ");
				arr[i][j] = scan.nextInt();
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Data for " + (i + 1) + " array = ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("----> Elements " + (j + 1) + " = " + arr[i][j]);
			}
		}

		// Release the resource
		scan.close();
	}

}
