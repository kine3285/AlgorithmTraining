package Dovelet;
import java.util.*;
public class digit_game {
	public static int finder(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length-2;i++){
			int curr=0;
			for(int j=i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					curr = arr[i]+arr[j]+arr[k];
					curr = curr%10;
					max = Math.max(max, curr);
				}
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<5;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int winner=-1;
		int max=-1;
		for(int i=0;i<n;i++){
			int curr = finder(arr[i]);
			if(curr>=max){
				max = curr;
				winner = i;
			}
		}
		System.out.println(winner+1);
		
	}
}
