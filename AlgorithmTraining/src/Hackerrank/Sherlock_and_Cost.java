package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock_and_Cost {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int maxi = 0;
			int max1 = 0;
			for (int i = 1; i < n; i++) {
				int curr = arr[i];
				int prev = arr[i - 1];
				int newmaxi = Math.max(maxi + Math.abs(curr - prev), max1 + (curr - 1));
				int newmax1 = Math.max(maxi + Math.abs(1 - prev), max1);
				maxi = newmaxi;
				max1 = newmax1;
			}
			System.out.println(Math.max(maxi, max1));

		}
	}
}
