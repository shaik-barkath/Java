package com.kn.arraysum;

public class ArraySum {

	public int[] findSumOfTwoArrays(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		for (int i = 0; i < crr.length; i++) {
			crr[i] = arr[i] + brr[i];
		}
		return crr;
	}
}
