package Dovelet;
import java.util.*;
public class distinct {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[1001];
		Arrays.fill(arr, 0);
		for(int i=0;i<n;i++){
			int k = sc.nextInt();
			arr[k] = 1;
		}
		int sum=0;
		for(int i=0;i<1001;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
