package Dovelet;
import java.util.*;
public class doubles {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];
		int n=0;
		while(true){
			int k = sc.nextInt();
			if(k==0)break;
			arr[n] = k;
			n++;
		}
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++){
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		int cnt=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr2[j]%2==0 && arr2[i]*2 == arr2[j]){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}
