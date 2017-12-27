package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternating_Characters {

	static int alternatingCharacters(String s) {
		// Complete this function
		int cnt = 0;
		char arr[] = s.toCharArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = alternatingCharacters(s);
			System.out.println(result);
		}
	}
}
