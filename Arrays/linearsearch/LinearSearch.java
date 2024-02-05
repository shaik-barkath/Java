package com.kn.linearsearch;

public class LinearSearch {

	public int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println(i);;
			}
		}
		return -1;
	}

}
