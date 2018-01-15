package Dovelet;
import java.util.*;
public class sum_rule {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] arr = new long[n][m];
		for(int i=0;i<arr.length;i++){
			arr[i][0] = 1;
		}
		for(int i=0;i<arr[0].length;i++){
			arr[0][i] = 1;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<arr[0].length;j++){
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
