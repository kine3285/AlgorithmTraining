package LeetCode;

import java.util.*;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> result = new LinkedList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			if (i == 0 || (i>0 && arr[i] != arr[i - 1])) {
				int correct = 0 - arr[i];
//				System.out.println("correct is " + correct);
				int start = i + 1;
				int end = arr.length - 1;
				while (start < end) {
					if (arr[start] + arr[end] == correct) {
						result.add(Arrays.asList(arr[i], arr[start], arr[end]));
						// 중복제거..
						while (start < end && arr[start] == arr[start + 1])
							start++;
						while (start < end && arr[end] == arr[end - 1])
							end--;
						//
						start++;
						end--;
					} else if (arr[start] + arr[end] < correct)
						start++;
					else
						end--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(threeSum(arr));
	}
}
