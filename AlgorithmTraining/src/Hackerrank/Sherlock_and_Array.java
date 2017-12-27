package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock_and_Array {

	static String solve(int n, int[] a) {
		// Complete this function
		StringBuilder result = new StringBuilder();

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i < n; i++) {
			sum2 += a[i];
		}
		int i = 0;
		// System.out.println("sum1 = "+sum1+", sum2 = "+sum2);
		while (sum1 <= sum2) {
			if (sum1 == sum2) {
				return "YES";
			}
			sum1 += a[i];
			sum2 -= a[i + 1];
			i++;
			// System.out.println("sum1 = "+sum1+", sum2 = "+sum2);
		}

		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			String result = solve(n, a);
			System.out.println(result);
		}
	}
}
