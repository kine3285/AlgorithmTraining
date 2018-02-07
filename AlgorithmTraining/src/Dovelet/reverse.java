package Dovelet;
import java.util.*;
public class reverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1;i>=0;i--){
			if(s.charAt(i)!=' '){
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
