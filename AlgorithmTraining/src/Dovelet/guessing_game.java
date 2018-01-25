package Dovelet;
import java.util.*;
public class guessing_game {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int high=Integer.MAX_VALUE;
		int low = Integer.MIN_VALUE;
		
		
		while(true){
			int n = sc.nextInt();
			String s = sc.nextLine();
			if(s=="too high"){
				high = n;
			}else if(s=="too low"){
				low = n;
			}else if(s=="right on"){
				if(n>low && n<high)System.out.println("Stan may be honest");
				else System.out.println("Stan is dishonest");
				break;
			}
		}
	}
}
