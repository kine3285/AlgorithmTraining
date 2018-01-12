package Dovelet;
import java.util.*;
public class coci_parking {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[101];
		Arrays.fill(arr, 0);
		for(int i=0;i<3;i++){
			int m = sc.nextInt();
			int n = sc.nextInt();
			for(int j=m;j<n;j++){
				arr[j]++;
			}
		}
		int sum=0;
		for(int i=1;i<101;i++){
			if(arr[i]==1) sum+=a;
			else if(arr[i]==2) sum+=2*b;
			else if(arr[i]==3) sum+=3*c;
		}
		System.out.println(sum);
	}
}
