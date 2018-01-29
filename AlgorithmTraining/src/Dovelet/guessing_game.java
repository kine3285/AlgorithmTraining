package Dovelet;
import java.util.*;
public class guessing_game {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int high=Integer.MAX_VALUE;
		int low = Integer.MIN_VALUE;
		while(true){
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			if(s.equals("too high")){
				if(n<high)
					high = n;
			}else if(s.equals("too low")){
				if(n>low)
					low = n;
			}else if(s.equals("right on")){
				if(n>low && n<high)System.out.println("Stan may be honest");
				else System.out.println("Stan is dishonest");
				break;
			}
		}
	}
}
