package com.kn.findtheelement;

public class FindElementInArray {

	public boolean isElementFound(int[] arr, int input) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				return true;
			}
		}
		return false;
	}
}
