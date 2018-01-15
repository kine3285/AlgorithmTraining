package Dovelet;
import java.util.*;
public class prd {
	public static int travel(int n){
		if(n==0) return 1;
		if(n==1) return 1;
		
		return 3*travel(n-1)%100000-travel(n-2)%100000;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n%37500;
		System.out.println(n);
		int result = (int) (travel(n) % 100000);
		System.out.println(result);
	}
}
