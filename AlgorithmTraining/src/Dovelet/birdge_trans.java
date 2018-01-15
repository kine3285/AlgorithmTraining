package Dovelet;
import java.util.*;
public class birdge_trans {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		
			sum+=arr[i];
			if(i>3){
				sum-=arr[i-4];
			}
			if(sum>weight){
				System.out.println(i);
				break;
			}
			if(i==n-1){
				System.out.println(n);
			}
		}
		
		
	}
}
