package Dovelet;

import java.util.*;
import java.io.*;

public class bui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(" **");
		for (int i = 0; i < n; i++)
			System.out.print(" ");
		System.out.println("** ");

		int line = 0;
		int check = 1;
		if (n % 2 == 0)
			line = n / 2;
		else {
			line = (n + 1) / 2;
			check = -1;
		}

		if (check == 1) {
			for (int l = 0; l < line; l++) {
				for (int i = 0; i < l; i++)
					System.out.print(" ");

				System.out.print("*  *");

				for (int i = 0; i < n - (l + 1) * 2; i++)
					System.out.print(" ");

				System.out.print("*  *");

				for (int i = 0; i < l; i++)
					System.out.print(" ");

				System.out.println("");
			}
			for (int i = 0; i < line; i++)
				System.out.print(" ");
			System.out.println("*    *");
			for (int i = 0; i < line + 1; i++)
				System.out.print(" ");
			System.out.println("*  *");
			for (int i = 0; i < line + 2; i++)
				System.out.print(" ");
			System.out.println("**");
		} else {
			for (int l = 0; l < line; l++) {
				if (l == line - 1) {
					for (int i = 0; i < l; i++)
						System.out.print(" ");

					System.out.print("*  *");
					for (int i = 0; i < n - (l + 1) * 2; i++)
						System.out.print(" ");

					System.out.print("  *");
					System.out.println("");
					break;
				}
				for (int i = 0; i < l; i++)
					System.out.print(" ");

				System.out.print("*  *");
				for (int i = 0; i < n - (l + 1) * 2; i++)
					System.out.print(" ");

				System.out.print("*  *");
				System.out.println("");
			}
			for (int i = 0; i < line; i++)
				System.out.print(" ");
			System.out.println("*   *");
			for (int i = 0; i < line + 1; i++)
				System.out.print(" ");
			System.out.println("* *");
			for (int i = 0; i < line + 2; i++)
				System.out.print(" ");
			System.out.println("*");
		}

	}
}
