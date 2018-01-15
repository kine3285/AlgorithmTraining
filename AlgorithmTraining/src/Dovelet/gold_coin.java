package Dovelet;
import java.util.*;
public class gold_coin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		int coin=1;
		int day = n;
		for(int i=1;;i++){
			for(int j=0;j<i;j++){
				sum+=coin;
				n--;
				if(n==0)break;
			}
			if(n==0)break;
			coin++;
		}
		System.out.println(day+" "+sum);
	}
}
