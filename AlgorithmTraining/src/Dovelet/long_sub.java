package Dovelet;
import java.util.*;
public class long_sub {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String aa = sc.nextLine();
		String bb = sc.nextLine();
		int length=0;
		if(aa.length()>bb.length())
			length=aa.length();
		else length=bb.length();
		
		StringBuilder sb = new StringBuilder();
		
		char[] a = aa.toCharArray();
		char[] b = bb.toCharArray();
		int over=0;
		for(int i=a.length-1;i>=0;i--){
			if(i>=a.length-b.length){
				//두개.
				int first=a[i]-48;
				int second=b[i]-48;
				sb.insert(0, (first+second)%10);
				over = (first+second)/10;
				System.out.println(first+" "+second+" "+sb);
			}else{
				sb.insert(0, (char) ((int)a[i]+(int)b[i]+over));
			}
		}
		System.out.println(sb);
	}
}
