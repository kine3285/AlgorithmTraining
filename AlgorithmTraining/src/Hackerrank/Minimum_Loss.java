package Hackerrank;

import java.io.*;
import java.util.*;

public class Minimum_Loss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] vals = new long[n];
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for (int i = 0; i < n; i++) {
			vals[i] = sc.nextLong();
		}
		for (int o = 0; o < n; o++) {
			map.put(vals[o], o);
		}

		Arrays.sort(vals);

		long min = Long.MAX_VALUE;
		for (int k = 0; k < n - 1; k++) {
			if (min > vals[k + 1] - vals[k] && map.get(vals[k]) - map.get(vals[k + 1]) > 0) {
				min = vals[k + 1] - vals[k];
			}
		}
		System.out.println(min);
	}
}