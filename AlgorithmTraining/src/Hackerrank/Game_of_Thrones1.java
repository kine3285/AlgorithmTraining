package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Game_of_Thrones1 {

	static String gameOfThrones(String s) {
		// Complete this function
		int len = s.length();
		char arr[] = s.toCharArray();
		int cnt = 1;
		boolean check = true;

		for (int i = 0; i < len; i++) {
			if (arr[i] != '0') {
				for (int j = i + 1; j < len; j++) {
					if (arr[i] == arr[j]) {
						cnt++;
						arr[j] = '0';
					}
				}
				if (cnt % 2 != 0) {
					if (check == false) {
						return "NO";
					}
					check = false;
				}
				// arr[i] = '0';
			}
			cnt = 1;
		}
		// if(cnt==0) return "NO";
		return "YES";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = gameOfThrones(s);
		System.out.println(result);
	}
}
