package Dovelet;

import java.util.*;

public class gseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum=0;
		for(int i=1;i<=n;i++){
			int curr=0;
			for(int j=0;j<i;j++){
				curr+=j+1;
			}
			sum+=curr;
		}
		System.out.println(sum);
	}
}
