package Dovelet;

import java.util.*;

public class ma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		int n = 0;
		int max = 0;
		while (true) {
			arr[n] = sc.nextInt();
			if (arr[n] == 0) {
				break;
			}
			if (arr[n] > max)
				max = arr[n];
			n++;
		}
		int m = max;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
				if (arr[j] - m >= 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			m--;
			System.out.println("");
		}

		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
