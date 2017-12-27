package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fibonacci_Modified {

	public static BigInteger calculate(BigInteger t1, BigInteger t2, int n) {
		if (n == 1) {
			return t1;
		} else if (n == 2) {
			return t2;
		}
		return calculate(t1, t2, n - 2).add(calculate(t1, t2, n - 1).multiply(calculate(t1, t2, n - 1)));

	}

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		BigInteger t1 = new BigInteger(sc.nextInt() + "");
		BigInteger t2 = new BigInteger(sc.nextInt() + "");
		int n = sc.nextInt();
		long[] arr = new long[n + 1];
		System.out.println(calculate(t1, t2, n));
	}
}