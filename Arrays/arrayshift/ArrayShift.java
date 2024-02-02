package com.kn.arrayshift;

import java.util.Arrays;

public class ArrayShift {

	public void arrayShift(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		System.out.println("Array Shift = " + Arrays.toString(arr));
	}

}
