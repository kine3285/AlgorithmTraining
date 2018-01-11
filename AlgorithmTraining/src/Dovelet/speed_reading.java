package Dovelet;

import java.util.*;

public class speed_reading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<k;i++){
			int s = sc.nextInt();
			int t = sc.nextInt();
			int breaktime = sc.nextInt();
			int time=0;
			int cnt=0;
			int curr=0;
			while(n>curr){
				if(cnt==t){
					time+=breaktime;
					cnt=0;
					continue;
				}
				curr = curr+s;
				time++;
				cnt++;
			}
			sc.close();
			System.out.println(time);
		}
	}
}
