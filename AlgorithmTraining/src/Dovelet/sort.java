package Dovelet;
import java.util.*;
public class sort {
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int cnt=0;
		int low=0;
		int high=n-1;
		int target=3;
		while(true){
			if(target==2 && low>=high)break;
			if(target==3 && low>=high){
				low=0;
				high=n-1;
				target=2;
			}
			if(arr[high] >= target)
				high--;
			if(arr[low] != target)
				low++;
			if(arr[low] == target && arr[high]<target){
				int temp=arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				cnt++;
				print(arr);
			}
			
		}
		System.out.println(cnt);
	}
}
