package Dovelet;
import java.util.*;
public class linear {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int cnt=0;
		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=j+1;k<n;k++){
					if(arr[j]-arr[i] == arr[k]-arr[j]){
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
