package Hackerrank;

import java.io.*;
import java.util.*;

public class Journey_to_the_Moon {
	public static int comparemin(int a, int b) {
		if (a < b)
			return a;
		return b;
	}

	public static void samecountry(int arr[], int a, int b) {
		if (a < b) {
			for (int i = 0; i < arr.length; i++) {
				if (i != b && arr[i] == arr[b]) {
					arr[i] = arr[a];
				}
			}
			arr[b] = arr[a];
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i != a && arr[i] == arr[a]) {
					arr[i] = arr[b];
				}
			}
			arr[a] = arr[b];
		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < p; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (arr[a] == 0 && arr[b] == 0) {
				arr[a] = i + 1;
				arr[b] = i + 1;
			} else if (arr[a] != 0 && arr[b] == 0) {
				arr[b] = arr[a];
			} else if (arr[a] == 0 && arr[b] != 0) {
				arr[a] = arr[b];
			} else if (arr[a] != 0 && arr[b] != 0) {
				samecountry(arr, a, b);
			}
		}
		Arrays.sort(arr);
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				c = i;
				break;
			}
		}
		long sum = 0;
		for (int i = n - 1; i > 0; i--) {
			long cnt = 0;
			if (arr[i] == 0) {
				cnt += i;
			} else {
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] != arr[j]) {
						cnt += j + 1;
						break;
					}
				}
			}
			sum += cnt;
		}
		System.out.println(sum);
	}
}