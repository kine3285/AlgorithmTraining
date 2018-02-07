package Dovelet;
import java.util.*;
public class esrever {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int left=0;
		int right=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ' || i==s.length()-1){
				right=i;
				StringBuilder temp = new StringBuilder();
				temp.append(s.substring(left, right));
				temp.reverse();
				if(i==s.length()-1)sb.append(s.charAt(i));
				sb.append(temp);
				left=right+1;
				sb.append(' ');
			}
		}
		System.out.println(sb);
	}
}
