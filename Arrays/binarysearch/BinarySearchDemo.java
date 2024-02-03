package com.kn.binarysearch;

public class BinarySearchDemo {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int key = 20;

		BinarySearch search = new BinarySearch();

		int value = search.binarySearch(arr, key);

		if (value >= 0) {
			System.out.println(key + " found at position " + (value + 1));
		} else {
			System.out.println("Not Found");
		}
	}

}
