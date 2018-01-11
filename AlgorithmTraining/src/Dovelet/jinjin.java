package Dovelet;
import java.util.*;
public class jinjin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++){
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			if(temp1+temp2>8)cnt++;
		}
		System.out.println(cnt);
	}
}
