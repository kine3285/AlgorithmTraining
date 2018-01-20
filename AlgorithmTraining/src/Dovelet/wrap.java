package Dovelet;
import java.util.*;
public class wrap {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				int curr = arr[i][j]+arr[i][(j+1)%10]+arr[i][(j+2)%10]+arr[i][(j+3)%10]+arr[i][(j+4)%10];
				max = Math.max(max, curr);
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				int curr = arr[j][i]+arr[(j+1)%10][i]+arr[(j+2)%10][i]+arr[(j+3)%10][i]+arr[(j+4)%10][i];
				max = Math.max(max, curr);
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				int curr = arr[i][j]+arr[(i+1)%10][(j+1)%10]+arr[(i+2)%10][(j+2)%10]
						+arr[(i+3)%10][(j+3)%10]+arr[(i+4)%10][(j+4)%10];
				max = Math.max(max, curr);
			}
		}
		for(int i=9;i>=0;i--){
			for(int j=0;j<10;j++){
				int curr = arr[i][j]+arr[((i-1)+10)%10][(j+1)%10]+arr[((i-2)+10)%10][(j+2)%10]
						+arr[((i-3)+10)%10][(j+3)%10]+arr[((i-4)+10)%10][(j+4)%10];
				max = Math.max(max, curr);
			}
		}
		System.out.println(max);
	}
}
