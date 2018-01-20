package Dovelet;
import java.util.*;
public class ball {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3-i;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		while(arr[2][0] != 0){
			System.out.print(arr[2][0]+" ");
			if(arr[1][0]>arr[1][1]){
				arr[2][0] = arr[1][0];
				if(arr[0][0]>arr[0][1]){
					arr[1][0] = arr[0][0];
					arr[0][0] = 0;
				}else{
					arr[1][0] = arr[0][1];
					arr[0][1] = 0;
				}
			}else{
				arr[2][0] = arr[1][1];
				if(arr[0][1]>arr[0][2]){
					arr[1][1] = arr[0][1];
					arr[0][1] = 0;
				}else{
					arr[1][1] = arr[0][2];
					arr[0][2] = 0;
				}
			}
		}
	}
}
