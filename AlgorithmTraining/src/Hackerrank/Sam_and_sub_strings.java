package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sam_and_sub_strings {

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] stochar = s.toCharArray();
		int[] arr = new int[stochar.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stochar[i] - '0';
		}
		long mod = 1000000007;
		long res = 0;
		long f = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			res = (res + arr[i] * f * (i + 1)) % mod;
			f = (f * 10 + 1) % mod;
		}
		System.out.println(res);

	}
}
