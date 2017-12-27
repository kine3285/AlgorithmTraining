package Hackerrank;

import java.io.*;
import java.util.*;

public class The_Full_Counting_Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = Integer.parseInt(scan.nextLine());
		StringBuffer[] st = new StringBuffer[100];

		for (int i = 0; i < 100; i++) {
			st[i] = new StringBuffer();
		}

		for (int i = 0; i < size; i++) {
			String sts = scan.nextLine();
			String[] str = sts.split("[\\s]+");
			int k = Integer.parseInt(str[0]);
			String s;
			if (i < size / 2)
				s = "- ";
			else
				s = str[1] + " ";
			st[k] = st[k].append(s);
		}

		for (int i = 0; i < 100; i++) {
			System.out.print(st[i]);
		}
	}
}