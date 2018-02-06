package Dovelet;
import java.util.*;
public class fa {
	public static void printer(char c, String s){
		int cnt=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c)cnt++;
		}
		System.out.println(c+":"+cnt);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<26;i++){
			printer((char) (i+97),s);
		}
	}
}
