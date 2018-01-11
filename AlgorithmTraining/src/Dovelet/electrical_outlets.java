package Dovelet;

import java.util.*;

public class electrical_outlets {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = 0;
		int temp =0;
		for(int i=0;i<t;i++){
			k = sc.nextInt();
			int sum=1;
			for(int j=0;j<k;j++){
				temp = sc.nextInt();
				sum = sum+temp-1;
			}
			System.out.println(sum);
		}

	}
}
