package Dovelet;
import java.util.*;
public class crypt {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[2][26];
		String s = sc.nextLine();
		for(int i=0;i<26;i++){
			arr[0][i] = (char) (i+97);
			arr[1][i] = s.charAt(i);
		}
		String text = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)>=65 && text.charAt(i)<=90){
				char c = (char) (text.charAt(i)+32);
				for(int j=0;j<26;j++){
					if(arr[0][j] == c){
						c = arr[1][j];
						break;
					}
				}
				c-=32;
				sb.append(c);
			}else if(text.charAt(i)>96 && text.charAt(i)<123){
				char c = text.charAt(i);
				for(int j=0;j<26;j++){
					if(arr[0][j]==c){
						c = arr[1][j];
						break;
					}
				}
				sb.append(c);
			}else{
				sb.append(text.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
