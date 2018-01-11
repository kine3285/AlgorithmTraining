package Dovelet;

import java.util.*;

public class table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long k = (long) Math.pow(n, 10);
		int length = 0;
		while (k >= 10) {
			k = k / 10;
			length++;
		}
		
		for(int i=0;i<=length+1;i++)System.out.print(" ");
		for (int i = 1; i < 11; i++) {
			int m=i;
			int currlength=0;
			while(m>=10){
				m = m/10;
				currlength++;
			}
			for (int j = 0; j <= length-currlength; j++) {
				System.out.print(" ");
			}
			System.out.print(i);
		}
		System.out.println("");
		
		for(int i=2;i<=n;i++){
			for(int l=0;l<=length;l++){
				System.out.print(" ");
			}
			System.out.print(i);
			for(int j=1;j<11;j++){
				long m=(long)Math.pow(i, j);
				int currlength=0;
				while(m>=10){
					m = m/10;
					currlength++;
				}
				
				for(int l=0;l<=length-currlength;l++){
					System.out.print(" ");
				}
				System.out.print((long)Math.pow(i, j));
			}
			System.out.println("");
		}
		
		
	}
}
