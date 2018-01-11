package Dovelet;
import java.util.*;

public class sugar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n%3 != 0 && n%5 != 0){
			System.out.println("-1");
			return;
		}
		int curr = n/5;
		int exchange = n%5;
		if(exchange == 0){
			System.out.println(curr);
			return;
		}
		while(true){
			
			if(exchange%3 == 0){
				System.out.println(curr+exchange/3);
				break;
			}
			if(curr==0){
				System.out.println("-1");
				break;
			}
			curr-=1;
			exchange+=5;
			
		}
	}
}
