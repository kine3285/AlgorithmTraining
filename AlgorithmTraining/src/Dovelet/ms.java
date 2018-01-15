package Dovelet;
import java.util.*;
public class ms {
	public static int bigger(int[] arr){
		int cnt=0;
		int max=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<=arr[i+1]){
				cnt++;
				max = Math.max(max, cnt);
			}else{
				cnt=0;
			}
		}
		return max+1;
	}
	public static int smaller(int[] arr){
		int cnt=0;
		int max=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>=arr[i+1]){
				cnt++;
				max = Math.max(max, cnt);
			}else{
				cnt=0;
			}
		}
		return max+1;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int result = Math.max(bigger(arr), smaller(arr));
		System.out.println(result);
		
	}

}
