package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array = ");
		int size = scan.nextInt();
		
		//Array Declaration
		int[] arr;
		
		//Array Creation
		arr = new int[size];

		System.out.println("Enter data for Array Elements = ");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println("Data within Array = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
