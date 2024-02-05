package com.kn.linearsearch;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int key = 40;
		LinearSearch search = new LinearSearch();
		int index = search.linearSearch(arr, key);
		if (index > 0) {
			System.out.println("Element " + key + " found at " + (index + 1));
		} else {
			System.out.println("Element " + key + " not found ");
		}

	}

}
