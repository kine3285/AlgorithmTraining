package Dovelet;
import java.util.*;
public class rsq {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0;i<k;i++){
			int start = sc.nextInt();
			int last = sc.nextInt();
			int sum=0;
			for(int j = start-1; j<last; j++){
				sum+=arr[j];
			}
			System.out.println(sum);
		}
	}
}
