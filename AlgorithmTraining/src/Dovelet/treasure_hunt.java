package Dovelet;
import java.util.*;
public class treasure_hunt {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int t=sc.nextInt();
		int loc1=0;
		int loc2=0;
		for(int i=0;i<t;i++){
			int move = sc.nextInt();
			String vect = sc.next();
			if(vect.equals("N"))loc2+=move;
			else if(vect.equals("S"))loc2-=move;
			else if(vect.equals("E"))loc1+=move;
			else if(vect.equals("W"))loc1-=move;
		}
		sc.close();
		if(m==loc1 && n==loc2)System.out.println("Treasure Found");
		else System.out.println("Bad Map");
	}
}
