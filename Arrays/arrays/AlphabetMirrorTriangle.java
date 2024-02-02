package com.kn.arrays;

import java.util.Scanner;

public class AlphabetMirrorTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			for (char c = 'A'; c < (char) ('A' + i); c++) {
				System.out.print(c);
			}
			for (char a = (char) ('A' + i); a >= 'A'; a--) {
				System.out.print(a);
			}
			System.out.println();
		}
		scan.close();
	}

}
