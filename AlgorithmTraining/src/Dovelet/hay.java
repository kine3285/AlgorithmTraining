package Dovelet;
import java.util.*;
public class hay {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int[] arr = new int[day];
		int querys = sc.nextInt();
		for(int i=0;i<day;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<querys;i++){
			int m=sc.nextInt();
			int n=sc.nextInt();
			int sum=0;
			for(int j=m-1;j<n;j++){
				sum+=arr[j];
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
