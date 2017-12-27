package Hackerrank;

import java.io.*;
import java.util.*;

public class Pairs {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int cnt = 0;
		int i = 0;
		int j = 1;
		while (j < n) {
			int dff = arr[j] - arr[i];
			if (dff == k) {
				cnt++;
				j++;
			} else if (dff < k) {
				j++;
			} else if (dff > k) {
				i++;
			}
		}
		System.out.println(cnt);
	}
}