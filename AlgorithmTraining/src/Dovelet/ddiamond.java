package Dovelet;

import java.util.*;
import java.io.*;

public class ddiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n / 2 + 1; i++) {
			int num = 1;
			for (int j = 0; j < n / 2 - i; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print(num);
				num++;
			}
			num--;
			for (int j = 0; j < i; j++) {
				num--;
				System.out.print(num);
			}
			System.out.println("");
		}

		// 거꾸로.
		for (int i = n / 2; i > 0; i--) {
			int num = 1;
			for (int j = 0; j < n / 2 + 1 - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++) {
				System.out.print(num);
				num++;
			}
			num--;
			for (int j = 0; j < i - 1; j++) {
				num--;
				System.out.print(num);
			}
			System.out.println("");

		}
	}
}
