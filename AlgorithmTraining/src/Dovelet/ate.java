package Dovelet;

import java.util.*;

public class ate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		sc.close();
		if(target>198){
			System.out.println("0");
			return;
		}
		int cnt=0;
		for(int i=1;i<100;i++){
			if(target-i<100)cnt++;
		}
		System.out.println(cnt);
	}
}
