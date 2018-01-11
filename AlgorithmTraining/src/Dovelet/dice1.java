package Dovelet;

import java.util.*;

public class dice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<7;i++){
			for(int j=1;j<7;j++){
				if(i<=j && i+j==n){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
