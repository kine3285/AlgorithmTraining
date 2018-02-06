package Dovelet;
import java.util.*;
public class ip_address {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		for(int i=0;i<32;i=i+8){
			int power=7;
			int curr=0;
			for(int j=i;j<i+8;j++){
				curr+=((int)s.charAt(j)-48) * Math.pow(2, power);
				power--;
			}
			System.out.print(curr);
			if(i<24)System.out.print(".");
		}
	}
}
