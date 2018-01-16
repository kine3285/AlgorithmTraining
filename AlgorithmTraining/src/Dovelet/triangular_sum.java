package Dovelet;
import java.util.*;
public class triangular_sum {
	public static int summary(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i*summary(i+1);
		}
		System.out.println(sum);
	}
}
