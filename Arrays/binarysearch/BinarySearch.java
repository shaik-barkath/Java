package com.kn.binarysearch;

public class BinarySearch {

	public int binarySearch(int[] arr, int key) {
		int start =0, end = arr.length - 1, mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}
}
