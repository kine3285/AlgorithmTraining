package Dovelet;
import java.util.*;
public class chemi {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length-2;i++){
			String temp = new String();
			temp=temp+arr[i]+arr[i+1]+arr[i+2];
			if(temp.equals("apa") || temp.equals("epe") || temp.equals("ipi") || temp.equals("opo") || temp.equals("upu")){
				System.out.println("i is "+i+", temp is "+temp);
				arr[i+2]='^';
				arr[i+1]='^';
				
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c:arr){
			if(c!='^')
				sb.append(c);
		}
		System.out.println(sb);
	}
}
