package Dovelet;
import java.util.*;
public class lotto {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-5;i++){
			for(int j=i+1;j<n-4;j++){
				for(int k=j+1;k<n-3;k++){
					for(int l=k+1;l<n-2;l++){
						for(int m=l+1;m<n-1;m++){
							for(int o=m+1;o<n;o++){
								System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" "+arr[m]+" "+arr[o]);
							}
						}
					}
				}
			}
		}
	}
}
