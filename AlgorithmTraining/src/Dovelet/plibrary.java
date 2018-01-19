package Dovelet;
import java.util.*;
public class plibrary {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int check=0;
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=0;j<m;j++){
				sum+=arr[j][i];
			}
			if(sum == m){
				check=1;
				break;
			}
		}
		if(check>0)System.out.println("yes");
		else System.out.println("no");
	}
}
