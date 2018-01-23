package Dovelet;
import java.util.*;
public class athletic {
	public static void game(int n){
		if(n==1){
			System.out.println("o");
		}else{
			System.out.print("o");
			game(n-1);
			System.out.print("xo");
			game(n-1);
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		game(n);
	}
}
