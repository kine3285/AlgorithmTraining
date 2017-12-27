package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beautiful_Binary_String {

	static int minSteps(int n, String B) {
		// Complete this function
		char arr[] = B.toCharArray();
		int cnt = 0;
		for (int i = 2; i < n; i++) {
			if (arr[i] == '0' && arr[i - 2] == '0' && arr[i - 1] == '1') {
				cnt++;
				i += 2;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		int result = minSteps(n, B);
		System.out.println(result);
	}
}
