package com.kn.arraysum;

import java.util.Scanner;

public class ArraySumDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array 1 =");

		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data for element " + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the Size of the Array 2 =");

		int[] brr = new int[scan.nextInt()];

		for (int i = 0; i < brr.length; i++) {
			System.out.println("Enter data for element " + (i + 1) + " = ");
			brr[i] = scan.nextInt();
		}

		if (arr.length != brr.length) {
			System.out.println("Invalid Array Input,Cant find Sum of it ");
		}

		ArraySum arraySum = new ArraySum();

		int[] crr = arraySum.findSumOfTwoArrays(arr, brr);
		
		System.out.print("The Sum of Arrays = ");

		System.out.print("[");
		for (int i = 0; i < crr.length; i++) {
			if (i == 0) {
				System.out.print(crr[i]);
			} else {
				System.out.print(", " + crr[i]);
			}
		}
		System.out.print("]");

		scan.close();

	}

}
