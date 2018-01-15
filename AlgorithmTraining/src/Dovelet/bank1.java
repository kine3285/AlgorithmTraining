package Dovelet;
import java.util.*;
public class bank1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int delay=0;
		int time=0;
		int sum=0;
		for(int i=0;i<n;i++){
			if(i==0){
				delay=0;
				time=arr[i][1]+arr[i][2];
			}else{
				delay=time-arr[i][1];
				if(delay<0){
					delay=0;
					time = arr[i][1]+arr[i][2];
				}else{
					time+=arr[i][2];
				}
				sum+=delay;
			}
		}
		double avr = (double)sum/(double)n;
		System.out.printf("%.1f",avr);
	}
}
