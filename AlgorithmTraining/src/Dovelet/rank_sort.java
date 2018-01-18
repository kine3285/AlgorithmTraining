package Dovelet;
import java.util.*;
public class rank_sort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] rank = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i] < arr[j])rank[i]++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(rank[i]+1);
		}
	}
}
