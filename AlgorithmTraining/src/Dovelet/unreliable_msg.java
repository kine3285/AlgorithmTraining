package Dovelet;
import java.util.*;
public class unreliable_msg {
	public static String restoreJ(String s){
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(s.length()-1, s.length()));
		sb.append(s.substring(0,s.length()-1));
		return sb.toString();
	}
	public static String restoreC(String s){
		StringBuilder sb = new StringBuilder();
		sb.append(s.substring(1));
		sb.append(s.charAt(0));
		return sb.toString();
	}
	public static String restoreE(String s){
		StringBuilder sb = new StringBuilder();
		if(s.length()%2==0){
			sb.append(s.substring(s.length()/2));
			sb.append(s.substring(0, s.length()/2));
		}else{
			sb.append(s.substring(s.length()/2+1));
			sb.append(s.charAt(s.length()/2));
			sb.append(s.substring(0, s.length()/2));
		}
		return sb.toString();
	}
	public static String restoreA(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static String restoreP(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>'0' && s.charAt(i)<='9'){
				char c = (char) (s.charAt(i)-1);
				sb.append(c);
			}else if(s.charAt(i)=='0'){
				sb.append('9');
			}else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static String restoreM(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0' && s.charAt(i)<'9'){
				char c = (char) (s.charAt(i)+1);
				sb.append(c);
			}else if(s.charAt(i)=='9'){
				sb.append('0');
			}else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		
		String msg = sc.nextLine();
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i] == 'J'){
				msg = restoreJ(msg);
			}else if(arr[i] == 'C'){
				msg = restoreC(msg);
			}else if(arr[i] == 'E'){
				msg = restoreE(msg);
			}else if(arr[i] == 'A'){
				msg = restoreA(msg);
			}else if(arr[i] == 'P'){
				msg = restoreP(msg);
			}else if(arr[i] == 'M'){
				msg = restoreM(msg);
			}
		}
		System.out.println(msg);
	}
}
