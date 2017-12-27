package Hackerrank;

import java.io.*;
import java.util.*;

public class Missing_Numbers {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;

		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		int dff[] = new int[101];
		for (int i = 0; i < n2; i++) {
			dff[arr2[i] - min]++;
		}
		for (int i = 0; i < n1; i++) {
			dff[arr1[i] - min]--;
		}
		for (int i = 0; i < 101; i++) {
			if (dff[i] > 0) {
				System.out.print((min + i) + " ");
			}
		}

	}
}