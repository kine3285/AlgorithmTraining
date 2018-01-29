package Dovelet;
import java.util.*;
public class notes {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] note = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			note[i] = sc.nextInt();
			sum+=note[i];
		}
		int[] time = new int[sum];
		int i=0;
		int songnum=0;
		while(true){		
			if(note[songnum]==0)songnum++;
			if(songnum>n-1)break;
			time[i++] = songnum+1;
			note[songnum]--;
		}
		
		for(int j=0;j<q;j++){
			int temp = sc.nextInt();
			System.out.println(time[temp]);
		}
		
		
		
	}
}
