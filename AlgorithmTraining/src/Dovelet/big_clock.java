package Dovelet;
import java.util.*;
public class big_clock {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char[] arr = s.toCharArray();
		if(arr[3] != '0' || arr[4] != '0'){
			System.out.println("0");
		}else{
			int time=0;
			time = (arr[0]-48)*10 + arr[1] - 48;
			if(time>12){
				System.out.println(time-12);
			}else{
				System.out.println(time+12);
			}
		}
	}
}
