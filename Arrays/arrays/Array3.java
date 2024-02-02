package com.kn.arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][][] arr = new int[2][2][1];

		System.out.println("Enter data for Array Elements = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
					scan.close();
				}
			}
		}
	}
}
 