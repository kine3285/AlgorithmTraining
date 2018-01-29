package Dovelet;
import java.util.*;
public class fact_pow {
	public static long fact(int n){
		if(n<2)return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for(int i=0;i<k;i++){
			int n = sc.nextInt();
			for(int j=1;;j++){
				if(fact(j)>Math.pow(n, j)){
					System.out.println(j);
					break;
				}
			}
		}
		System.out.println("dfdfd");
	}
}
