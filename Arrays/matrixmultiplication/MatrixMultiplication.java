package com.kn.matrixmultiplication;

public class MatrixMultiplication {

	public void matrix(int[][] arr, int[][] brr, int[][] crr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < brr.length; k++) {
					crr[i][j] += arr[i][k] + brr[j][k];

				}
			}
		}

	}

}
