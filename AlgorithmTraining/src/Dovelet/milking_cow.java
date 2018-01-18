package Dovelet;
import java.util.*;
public class milking_cow {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[1000000];
		int low=1000000;
		int high=0;
		for(int i=0;i<n;i++){
			int start = sc.nextInt();
			int last = sc.nextInt();
			for(int j = start;j<last;j++){
				arr[j]++;
			}
			low = Math.min(low, start);
			high = Math.max(high, last);
		}
		int max=0;
		int cnt=0;
		for(int i=low;i<=high;i++){
			if(arr[i]>0){
				if(arr[i+1]>0){
					cnt++;
				}else{
					cnt++;
					max = Math.max(max, cnt);
					cnt=0;
				}
			}
		}
		int newmax=0;
		for(int i=low;i<=high;i++){
			if(arr[i]==0){
				if(arr[i+1]==0){
					cnt++;
				}else{
					cnt++;
					newmax = Math.max(newmax, cnt);
					cnt=0;
				}
			}
		}
		System.out.println(max+" "+newmax);
	}
}
