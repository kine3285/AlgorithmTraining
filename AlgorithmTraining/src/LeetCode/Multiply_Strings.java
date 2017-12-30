package LeetCode;
import java.util.*;
import java.io.*;
public class Multiply_Strings {
	public static String multiply(String num1, String num2) {
		int n = num1.length();
		int m = num2.length();
		int[] arr = new int[n+m];
		for(int i=n-1; i>=0; i--){
			for(int j=m-1; j>=0; j--){
				int curr = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int loc1 = i+j;
				int loc2 = i+j+1;
				int currsum = curr + arr[loc2];
				arr[loc1] += currsum/10;
				arr[loc2] = currsum%10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i : arr){
			if(!(sb.length() == 0 && i == 0)) sb.append(i);
		}
	    return sb.length() == 0 ? "0" : sb.toString();
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		System.out.println(multiply(num1,num2));
	}
}
