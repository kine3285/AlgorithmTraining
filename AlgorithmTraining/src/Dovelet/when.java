package Dovelet;
import java.util.*;

public class when {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int doc = sc.nextInt();
		int[] arr = new int[101];
		Arrays.fill(arr, 0);
		for(int i=0;i<n;i++){
			int k = sc.nextInt();
			for(int j=0;j<k;j++){
				int m = sc.nextInt();
				arr[m-1]++;
			}
		}
		int max=0;
		int day=0;
		for(int i=0;i<101;i++){
			if(max<arr[i]){
				max=arr[i];
				day=i;
			}
		}
		if(max<doc)System.out.println("0");
		else System.out.println(day+1);
	}
}
