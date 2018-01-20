package Dovelet;
import java.util.*;
public class magic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int row=0;
		int col=n/2;
		int value=1;
		while(true){
			row = (row+n)%n;
			col = (col+n)%n;
			if(arr[row][col]!=0)break;
			arr[row][col] = value++;
			if(arr[row][col]%n == 0){
				row++;
			}else{
				row--;
				col++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i][j] < 10)System.out.print(" ");
				System.out.print(" "+arr[i][j]);
			}System.out.println();
		}
	}
}
