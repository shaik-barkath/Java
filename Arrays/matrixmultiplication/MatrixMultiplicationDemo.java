package com.kn.matrixmultiplication;

import java.util.Arrays;

import java.util.Scanner;

public class MatrixMultiplicationDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[scan.nextInt()][scan.nextInt()];
		int[][] brr = new int[scan.nextInt()][scan.nextInt()];
		int[][] crr = new int[arr.length][arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				brr[i][j] = scan.nextInt();
			}
		}

		MatrixMultiplication m1 = new MatrixMultiplication();

		m1.matrix(arr, brr, crr);

		System.out.println(Arrays.deepToString(crr));
		scan.close();

	}
	

}
