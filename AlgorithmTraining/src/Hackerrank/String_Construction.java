package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String_Construction {

	static int stringConstruction(String s) {
		// Complete this function
		int i, t = 0;
		int a1[] = new int[26];
		for (i = 0; i < s.length(); i++)
			a1[s.charAt(i) - 'a']++;

		for (i = 0; i < 26; i++)
			if (a1[i] > 0) {
				t++;
			}
		return t;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = stringConstruction(s);
			System.out.println(result);
		}
		in.close();
	}
}
