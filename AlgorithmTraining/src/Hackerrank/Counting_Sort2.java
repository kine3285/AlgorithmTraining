package Hackerrank;

import java.io.*;
import java.util.*;

public class Counting_Sort2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int cnt[] = new int[100];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			cnt[arr[i]]++;
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 1; j <= cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}