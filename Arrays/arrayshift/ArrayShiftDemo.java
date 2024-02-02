package com.kn.arrayshift;

import java.util.Scanner;

public class ArrayShiftDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array = ");
		int[] arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data for " + i + " element ");
			arr[i] = scan.nextInt();
		}
		ArrayShift a1 = new ArrayShift();
		a1.arrayShift(arr);
		scan.close();
	}
}
