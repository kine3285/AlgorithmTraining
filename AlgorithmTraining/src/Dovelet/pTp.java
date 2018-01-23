package Dovelet;
import java.util.*;
public class pTp {
	public static void printer(int i){
		if(i==1)System.out.print("1");
		else{
			printer(i-1);
			System.out.print(i);
			printer(i-1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printer(n);
	}
}
