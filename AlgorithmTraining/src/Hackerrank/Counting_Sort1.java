package Hackerrank;

import java.util.*;

public class Counting_Sort1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 100; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] == i)
					count++;
			}
			System.out.print(count + " ");
		}
	}
}
