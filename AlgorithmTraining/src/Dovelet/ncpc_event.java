package Dovelet;
import java.util.*;
public class ncpc_event {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int money = sc.nextInt();
		int hotel = sc.nextInt();
		int week = sc.nextInt();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<hotel;i++){
			int hotelmoney = sc.nextInt();
			for(int j=0;j<week;j++){
				int hotelpeople = sc.nextInt();
				if(hotelmoney*people<=money && hotelpeople>=people){
					min = Math.min(min, people*hotelmoney);
				}
			}
		}
		if(min<Integer.MAX_VALUE)System.out.println(min);
		else System.out.println("stay home");
	}
}
