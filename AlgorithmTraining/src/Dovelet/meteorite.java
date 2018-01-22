package Dovelet;
import java.util.*;
public class meteorite {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		long costsum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
				int cost=Math.min(Math.min(i, n-1-i), Math.min(j, n-1-j));
				cost++;
				costsum+=cost*arr[i][j];
			}
		}
		System.out.println(costsum);
	}
}
