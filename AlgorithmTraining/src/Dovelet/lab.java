package Dovelet;
import java.util.*;
public class lab {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int cnt=0;
		int winner=-1;
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 3)cnt++;
			}
			if(max < cnt){
				max = cnt;
				winner = i;
			}
			cnt=0;
		}
		System.out.println(winner+1);
	}
}
