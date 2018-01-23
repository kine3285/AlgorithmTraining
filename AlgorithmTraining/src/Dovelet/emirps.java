package Dovelet;
import java.util.*;
public class emirps {
	public static boolean primenum(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0)return false;
		}
		return true;
	}
	public static int reverse(int n){
		int temp=0;
		while(n>0){
			temp=n%10+temp*10;
			n=n/10;
		}
		return temp;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(primenum(n)){
			if(primenum(reverse(n)))System.out.println(n+" is an emirp");
			else System.out.println(n+" is a prime");
		}else System.out.println(n+" is not prime");
		
	}
}
