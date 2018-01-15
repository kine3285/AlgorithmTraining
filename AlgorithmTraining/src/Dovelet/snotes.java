package Dovelet;
import java.util.*;
public class snotes {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		int[] table = new int[sum];
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<arr[i];j++){
				table[k] = i+1;
				k++;
			}
		}
		for(int i=0;i<t;i++){
			System.out.println(table[sc.nextInt()]);
		}
		
	}
}
