package com.kn.findtheelement;

import java.util.Scanner;

public class FindElementInArrayDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array =");

		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " element =");
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element to be found =");
		int input = scan.nextInt();

		FindElementInArray findElement = new FindElementInArray();

		boolean result = findElement.isElementFound(arr, input);

		if (result) {
			System.out.println(input + " is Found");
		} else {
			System.out.println(input + "is not Found");
		}

		scan.close();

	}
}
