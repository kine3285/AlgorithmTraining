package Hackerrank;

import java.io.*;
import java.util.*;

public class Ice_Cream_Palor {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			for (int a = 0; a < n - 1; a++) {
				for (int b = a + 1; b < n; b++) {
					if (arr[a] + arr[b] == m) {
						System.out.println((a + 1) + " " + (b + 1));
					}
				}
			}

		}

	}
}