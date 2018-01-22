package Dovelet;
import java.util.*;
public class corn_field {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<k;i++){
			int row = sc.nextInt();
			int col = sc.nextInt();
			int rowstart = row-(a/2);
			if(rowstart<0)rowstart=0;
			int rowend = rowstart+a;
			if(rowend>=n)rowend=n-1;
			int colstart = col-(a/2);
			if(colstart<0)colstart=0;
			int colend = colstart+a;
			if(colend>=n)colend=n-1;
			int max=Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int m=rowstart;m<rowend;m++){
				for(int l=colstart;l<rowend;l++){
					max = Math.max(max, arr[m][l]);
					min = Math.min(min, arr[m][l]);
				}
			}
			System.out.println(max-min);
		}
	}
}
