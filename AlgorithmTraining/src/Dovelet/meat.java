package Dovelet;
import java.util.*;
public class meat {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int sam = 0;
		int ella = 0;
		int start=0;
		int end=n-1;
		while(start<=end){
			if(sam == ella && end==start){
				System.out.println(sam);
				System.out.println(ella);
				break;
			}
			
			
			if(sam<ella){
				sam += arr[start];
				start++;
			}else{
				ella += arr[end];
				end--;
			}
			
		}
		end+=2;
		if(sam != ella)System.out.println("No equal partitioning.");
		else System.out.println("Sam stops at position "+start+" and Ella stops at position "+end+".");
	}
}
