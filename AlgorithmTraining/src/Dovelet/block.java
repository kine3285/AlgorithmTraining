package Dovelet;
import java.util.*;
public class block {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int[] sums = new int[9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				arr[i][j] = sc.nextInt();
				if(i<3 && j<3){
					sums[0] += arr[i][j];
				}else if(i<3 && j<6){
					sums[1] += arr[i][j];
				}else if(i<3 && j>=6){
					sums[2] += arr[i][j];
				}else if(i<6 && j<3){
					sums[3] += arr[i][j];
				}else if(i<6 && j<6){
					sums[4] += arr[i][j];
				}else if(i<6 && j>=6){
					sums[5] += arr[i][j];
				}else if(i>=6 && j<3){
					sums[6] += arr[i][j];
				}else if(i>=6 && j<6){
					sums[7] += arr[i][j];
				}else{
					sums[8] += arr[i][j];
				}
			}
		}
		
		for(int i=0; i<9; i++){
			System.out.println(sums[i]);
		}
		
	}
}
