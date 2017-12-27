package Hackerrank;

import java.io.*;
import java.util.*;

public class Running_time_of_Algorithm {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp;
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
				cnt++;
			}
			arr[j + 1] = temp;
		}
		System.out.println(cnt);
	}
}
