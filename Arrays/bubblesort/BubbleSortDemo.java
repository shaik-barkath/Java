package com.kn.bubblesort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {

		int[] arr = { 16, 14, 5, 6, 8 };

		BubbleSort sort = new BubbleSort();

		sort.bubbleSort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
