package LeetCode;

import java.io.*;
import java.util.*;

public class FourSum {
	public static List<List<Integer>> fourSum(int[] arr, int target) {
		
		Arrays.sort(arr);
		List<List<Integer>> list = new LinkedList<>();
		for (int i = 0; i < arr.length - 3; i++) {
			if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
				for (int j = i + 1; j < arr.length - 2; j++) {
					if (j == i+1 || (j>0 && arr[j] != arr[j - 1])){
						int start = j+1;
						int end = arr.length-1;
						
						while(start<end){
//							System.out.println("i is "+i+", j is "+j+", start is "+start+"end is "+end);
							int sum=arr[start]+arr[end]+arr[i]+arr[j];
							if (sum > target) {
								end--;
							} else if(sum < target){
								start++;
							} else if(sum == target){
								list.add(Arrays.asList(arr[i], arr[j], arr[start], arr[end]));
								// 중복제거..
								while (start < end && arr[start] == arr[start + 1])
									start++;
								while (start < end && arr[end] == arr[end - 1])
									end--;
								//
								start++;
								end--;
							}
//							System.out.println(list);
						}
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(fourSum(arr, target));
	}

}
