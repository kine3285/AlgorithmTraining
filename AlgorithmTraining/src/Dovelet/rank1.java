package Dovelet;

import java.util.Arrays;
import java.util.Scanner;

public class rank1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] < arr[j])
					rank[i]++;
			}
		}
		Arrays.sort(arr);
		Arrays.sort(rank);
		for (int i = n-1; i >= 0; i--) {
			System.out.println(arr[i]+" "+(rank[n-i-1]+1));
		}
	}
}
