package LeetCode;

import java.util.*;
import java.io.*;

public class Container_With_Most_Water {
	public static int MaxArea(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int max = 0;
		while (start < end) {
			max = Math.max(max, (end - start) * Math.min(arr[start], arr[end]));
			if (arr[start] > arr[end]) {
				end--;
			} else {
				start++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(MaxArea(arr));
	}
}
