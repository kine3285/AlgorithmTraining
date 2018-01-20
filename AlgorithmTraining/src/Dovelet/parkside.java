package Dovelet;
import java.util.*;
public class parkside {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(num==10)num=1;
				arr[j][i] = num;
				num++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i][j] == 0)System.out.print("  ");
				else System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
