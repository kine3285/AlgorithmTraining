package Dovelet;
import java.util.*;

public class d_game {
	public static int bigger(int a, int b, int c){
		
		return Math.max(Math.max(a, b), c);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==b && b==c){
				int price = 10000+(a*1000);
				result = Math.max(result, price);
				
			}else if(a!=b && b!=c && c!=a){
				int price = bigger(a,b,c)*100;
				result = Math.max(result, price);
			}else{
				int price=0;
				if(a==b){
					price = 1000+(a*100);
				}else if(b==c){
					price = 1000+(b*100);
				}else{
					price = 1000+(c*100);
				}
				result = Math.max(result, price);
			}
		}
		sc.close();
		System.out.println(result);
	}
}
