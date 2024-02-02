package com.kn.arrays;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {

		// Taking Array size as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Float Array =");

		// Array Declaration & Creation
		float[] frr = new float[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < frr.length; i++) {
			System.out.print("Enter Float data for Element " + (i + 1) + "=");
			frr[i] = scan.nextFloat();
		}

		System.out.println("Float Array Initialization is Done ");
		//Array Traversing to print its Elements
		for (int i = 0; i < frr.length; i++) {
			System.out.println("The data in " + (i + 1) + " element is = " + frr[i]);
		}
		
		//for (int i = 0; i < frr.length; i++)   //Forward Traversing
		//for (int i = frr.length-1; i >=0; i--) //Backward Traversing

		/*Another way to traverse 
		int count =1;
		for(String s:srr) {
			System.out.println(count++ + "element ="+s);
		}*/
		
		
		// release the resource
		scan.close();
	}

}
