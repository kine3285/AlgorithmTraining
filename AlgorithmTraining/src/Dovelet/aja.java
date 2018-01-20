package Dovelet;
import java.util.*;
public class aja {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<6;j++){
				int curr = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3]+arr[i][j+4];
				max = Math.max(max, curr);
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<6;j++){
				int curr = arr[j][i]+arr[j+1][i]+arr[j+2][i]+arr[j+3][i]+arr[j+4][i];
				max = Math.max(max, curr);
			}
		}
		System.out.println(max);
	}
}
