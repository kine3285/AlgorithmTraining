package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equal {
	public static long find_min_actions(int[] cookies) {

		Arrays.sort(cookies);

		long sum = Long.MAX_VALUE;

		for (int base = 0; base < 3; base++) {
			int current_sum = 0;
			for (int i = 0; i < cookies.length; i++) {
				int delta = cookies[i] - cookies[0] + base;
				current_sum += (int) delta / 5 + delta % 5 / 2 + delta % 5 % 2 / 1;
			}
			sum = Math.min(current_sum, sum);
		}

		return sum;
	}

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int a = 0; a < T; a++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(find_min_actions(arr));
		}
	}
}
